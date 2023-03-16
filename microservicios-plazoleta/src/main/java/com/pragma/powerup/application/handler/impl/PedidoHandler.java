package com.pragma.powerup.application.handler.impl;

import com.pragma.powerup.application.dto.request.ObjectRequestDto;
import com.pragma.powerup.application.dto.request.PedidoRequestDto;
import com.pragma.powerup.application.dto.response.ObjectResponseDto;
import com.pragma.powerup.application.dto.response.PedidoResponseDto;
import com.pragma.powerup.application.handler.IObjectHandler;
import com.pragma.powerup.application.handler.IPedidoHandler;
import com.pragma.powerup.application.mapper.IObjectRequestMapper;
import com.pragma.powerup.application.mapper.IObjectResponseMapper;
import com.pragma.powerup.application.mapper.IPedidoRequestMapper;
import com.pragma.powerup.application.mapper.IPedidoResponseMapper;
import com.pragma.powerup.domain.api.IObjectServicePort;
import com.pragma.powerup.domain.api.IPedidoServicePort;
import com.pragma.powerup.domain.model.ObjectModel;
import com.pragma.powerup.domain.model.PedidoModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class PedidoHandler implements IPedidoHandler {

    private final IPedidoServicePort pedidoServicePort;
    private final IPedidoRequestMapper pedidoRequestMapper;
    private final IPedidoResponseMapper pedidoResponseMapper;

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
    public void savePedido(PedidoRequestDto pedidoRequestDto) {
        PedidoModel pedidoModel = pedidoRequestMapper.toPedido(pedidoRequestDto);
        pedidoServicePort.savePedido(pedidoModel);

    }

    @Override
    public List<PedidoResponseDto> getAllPedidos() {
        return pedidoResponseMapper.toResponseList(pedidoServicePort.getAllPedidos());
    }
}