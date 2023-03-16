package com.pragma.powerup.domain.usecase;

import com.pragma.powerup.domain.api.IRestauranteServicePort;
import com.pragma.powerup.domain.exception.DomainException;
import com.pragma.powerup.domain.model.ObjectModel;
import com.pragma.powerup.domain.model.RestauranteModel;
import com.pragma.powerup.domain.spi.IRestaurantePersistencePort;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RestauranteUseCase implements IRestauranteServicePort {

    private final IRestaurantePersistencePort restaurantePersistencePort;

    public RestauranteUseCase(IRestaurantePersistencePort restaurantePersistencePort) {
        this.restaurantePersistencePort = restaurantePersistencePort;
    }


//    @Override
//    public void saveObject(ObjectModel objectModel) {
//        objectPersistencePort.saveObject(objectModel);
//    }
//
//    @Override
//    public List<ObjectModel> getAllObjects() {
//        return objectPersistencePort.getAllObjects();
//    }

    @Override
    public void saveRestaurante(RestauranteModel restauranteModel) {

        Pattern nombreRestauranteLetrasNumeros = Pattern.compile("\\[A-Za-z0-9]$");

        Matcher nombreRestauranteMatcher = nombreRestauranteLetrasNumeros.matcher(restauranteModel.getNombreRestaurante());

        if(!nombreRestauranteMatcher.matches()){
            throw new DomainException("Nombre invalido" + restauranteModel.getNit());
        }

        Pattern numeroNitRestaurante = Pattern.compile("\\[0-9]{1,13}$");

        Matcher numeroNitRestauranteMatcher = numeroNitRestaurante.matcher(Long.toString(restauranteModel.getNit()));

        if(!numeroNitRestauranteMatcher.matches()){
            throw new DomainException("Numero de nit invalido" + restauranteModel.getNit());
        }

        Pattern numeroTelefonoRestaurante = Pattern.compile("\\+?\\d{12}");

        Matcher numeroTelefonoRestauranteMatcher = numeroTelefonoRestaurante.matcher(restauranteModel.getTelefonoRestaurante());

        if(!numeroTelefonoRestauranteMatcher.matches()){
            throw new DomainException("numero invalido: " + restauranteModel.getTelefonoRestaurante());
        }

//        String numeroTelefonoRestaurantePrefijo = restauranteModel.getTelefonoRestaurante().contains("+")
//                ? restauranteModel.getTelefonoRestaurante()
//                : "+" + restauranteModel.getTelefonoRestaurante();

        if(!restauranteModel.getTelefonoRestaurante().contains("+")){
            restauranteModel.setTelefonoRestaurante("+" + restauranteModel.getTelefonoRestaurante());
        }

        restaurantePersistencePort.saveRestaurante(restauranteModel);

    }

    @Override
    public List<RestauranteModel> getAllRestaurantes() {
        return restaurantePersistencePort.getAllRestaurantes();
    }
}