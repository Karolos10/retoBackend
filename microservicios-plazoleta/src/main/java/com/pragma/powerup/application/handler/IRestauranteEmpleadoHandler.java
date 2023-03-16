package com.pragma.powerup.application.handler;

import com.pragma.powerup.application.dto.request.ObjectRequestDto;
import com.pragma.powerup.application.dto.request.RestauranteEmpleadoRequestDto;
import com.pragma.powerup.application.dto.response.ObjectResponseDto;
import com.pragma.powerup.application.dto.response.RestauranteEmpleadoResponseDto;

import java.util.List;

public interface IRestauranteEmpleadoHandler {

    void saveRestauranteEmpleado(RestauranteEmpleadoRequestDto restauranteEmpleadoRequestDto);

    List<RestauranteEmpleadoResponseDto> getAllRestaurenteEmpleados();
}