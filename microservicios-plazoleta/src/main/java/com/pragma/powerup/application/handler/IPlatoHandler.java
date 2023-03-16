package com.pragma.powerup.application.handler;

import com.pragma.powerup.application.dto.request.ObjectRequestDto;
import com.pragma.powerup.application.dto.request.PlatoRequestDto;
import com.pragma.powerup.application.dto.response.ObjectResponseDto;
import com.pragma.powerup.application.dto.response.PlatoResponseDto;

import java.util.List;

public interface IPlatoHandler {

    void savePlatos(PlatoRequestDto platoRequestDto);

    List<PlatoResponseDto> getAllPlatos();
}