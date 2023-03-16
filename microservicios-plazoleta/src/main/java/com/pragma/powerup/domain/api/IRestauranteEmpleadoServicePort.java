package com.pragma.powerup.domain.api;

import com.pragma.powerup.domain.model.ObjectModel;
import com.pragma.powerup.domain.model.RestauranteEmpleadoModel;

import java.util.List;

public interface IRestauranteEmpleadoServicePort {

    void saveRestauranteEmpleado(RestauranteEmpleadoModel restauranteEmpleadoModel);

    List<RestauranteEmpleadoModel> getAllRestauranteEmpleados();
}