package com.pragma.powerup.application.handler.impl;

import com.pragma.powerup.application.dto.request.ObjectRequestDto;
import com.pragma.powerup.application.dto.request.RestauranteEmpleadoRequestDto;
import com.pragma.powerup.application.dto.response.ObjectResponseDto;
import com.pragma.powerup.application.dto.response.RestauranteEmpleadoResponseDto;
import com.pragma.powerup.application.handler.IObjectHandler;
import com.pragma.powerup.application.handler.IRestauranteEmpleadoHandler;
import com.pragma.powerup.application.mapper.IObjectRequestMapper;
import com.pragma.powerup.application.mapper.IObjectResponseMapper;
import com.pragma.powerup.application.mapper.IRestauranteEmpleadoRequestMapper;
import com.pragma.powerup.application.mapper.IRestauranteEmpleadoResponseMapper;
import com.pragma.powerup.domain.api.IObjectServicePort;
import com.pragma.powerup.domain.api.IRestauranteEmpleadoServicePort;
import com.pragma.powerup.domain.model.ObjectModel;
import com.pragma.powerup.domain.model.RestauranteEmpleadoModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class RestauranteEmpleadoHandler implements IRestauranteEmpleadoHandler {

    private final IRestauranteEmpleadoServicePort restauranteEmpleadoServicePort;
    private final IRestauranteEmpleadoRequestMapper restauranteEmpleadoRequestMapper;
    private final IRestauranteEmpleadoResponseMapper restauranteEmpleadoResponseMapper;

//    @Override
//    public void saveObject(ObjectRequestDto objectRequestDto) {
//        ObjectModel objectModel = objectRequestMapper.toObject(objectRequestDto);
//        objectServicePort.saveObject(objectModel);
//    }
//
//    @Override
//    public List<ObjectResponseDto> getAllObjects() {
//        return objectResponseMapper.toResponseList(objectServicePort.getAllObjects());
//    }

    @Override
    public void saveRestauranteEmpleado(RestauranteEmpleadoRequestDto restauranteEmpleadoRequestDto) {
        RestauranteEmpleadoModel restauranteEmpleadoModel = restauranteEmpleadoRequestMapper.toRestauranteEmpleado(restauranteEmpleadoRequestDto);
        restauranteEmpleadoServicePort.saveRestauranteEmpleado(restauranteEmpleadoModel);

    }

    @Override
    public List<RestauranteEmpleadoResponseDto> getAllRestaurenteEmpleados() {
        return restauranteEmpleadoResponseMapper.toResponseList(restauranteEmpleadoServicePort.getAllRestauranteEmpleados());
    }
}