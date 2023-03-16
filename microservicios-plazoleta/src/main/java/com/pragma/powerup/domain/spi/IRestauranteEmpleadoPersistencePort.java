package com.pragma.powerup.domain.spi;

import com.pragma.powerup.domain.model.ObjectModel;
import com.pragma.powerup.domain.model.RestauranteEmpleadoModel;

import java.util.List;

public interface IRestauranteEmpleadoPersistencePort {
    RestauranteEmpleadoModel saveRestauranteEmpleado(RestauranteEmpleadoModel restauranteEmpleadoModel);

    List<RestauranteEmpleadoModel> getAllRestauranteEmpleados();
}