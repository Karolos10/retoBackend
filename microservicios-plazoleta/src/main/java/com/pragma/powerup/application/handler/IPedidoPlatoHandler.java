package com.pragma.powerup.application.handler;

import com.pragma.powerup.application.dto.request.ObjectRequestDto;
import com.pragma.powerup.application.dto.request.PedidoPlatoRequestDto;
import com.pragma.powerup.application.dto.response.ObjectResponseDto;
import com.pragma.powerup.application.dto.response.PedidoPlatoResponseDto;

import java.util.List;

public interface IPedidoPlatoHandler {

    void savePedidoPlato(PedidoPlatoRequestDto pedidoPlatoRequestDto);

    List<PedidoPlatoResponseDto> getAllPedidoPlatos();
}