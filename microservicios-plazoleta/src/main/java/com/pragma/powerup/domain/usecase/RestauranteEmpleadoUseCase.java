package com.pragma.powerup.domain.usecase;

import com.pragma.powerup.domain.api.IRestauranteEmpleadoServicePort;
import com.pragma.powerup.domain.model.ObjectModel;
import com.pragma.powerup.domain.model.RestauranteEmpleadoModel;
import com.pragma.powerup.domain.spi.IRestauranteEmpleadoPersistencePort;

import java.util.List;

public class RestauranteEmpleadoUseCase implements IRestauranteEmpleadoServicePort {

    private final IRestauranteEmpleadoPersistencePort restauranteEmpleadoPersistencePort;

    public RestauranteEmpleadoUseCase(IRestauranteEmpleadoPersistencePort restauranteEmpleadoPersistencePort) {
        this.restauranteEmpleadoPersistencePort = restauranteEmpleadoPersistencePort;
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
    public void saveRestauranteEmpleado(RestauranteEmpleadoModel restauranteEmpleadoModel) {
        restauranteEmpleadoPersistencePort.saveRestauranteEmpleado(restauranteEmpleadoModel);

    }

    @Override
    public List<RestauranteEmpleadoModel> getAllRestauranteEmpleados() {
        return restauranteEmpleadoPersistencePort.getAllRestauranteEmpleados();
    }
}