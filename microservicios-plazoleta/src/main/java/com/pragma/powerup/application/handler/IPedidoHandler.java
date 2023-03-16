package com.pragma.powerup.application.handler;

import com.pragma.powerup.application.dto.request.ObjectRequestDto;
import com.pragma.powerup.application.dto.request.PedidoRequestDto;
import com.pragma.powerup.application.dto.response.ObjectResponseDto;
import com.pragma.powerup.application.dto.response.PedidoResponseDto;

import java.util.List;

public interface IPedidoHandler {

    void savePedido(PedidoRequestDto pedidoRequestDto);

    List<PedidoResponseDto> getAllPedidos();
}