package com.pragma.powerup.application.handler.impl;

import com.pragma.powerup.application.dto.request.ObjectRequestDto;
import com.pragma.powerup.application.dto.request.PedidoPlatoRequestDto;
import com.pragma.powerup.application.dto.response.ObjectResponseDto;
import com.pragma.powerup.application.dto.response.PedidoPlatoResponseDto;
import com.pragma.powerup.application.handler.IObjectHandler;
import com.pragma.powerup.application.handler.IPedidoPlatoHandler;
import com.pragma.powerup.application.mapper.IObjectRequestMapper;
import com.pragma.powerup.application.mapper.IObjectResponseMapper;
import com.pragma.powerup.application.mapper.IPedidoPlatoRequestMapper;
import com.pragma.powerup.application.mapper.IPedidoPlatoResponseMapper;
import com.pragma.powerup.domain.api.IObjectServicePort;
import com.pragma.powerup.domain.api.IPedidoPlatoServicePort;
import com.pragma.powerup.domain.model.ObjectModel;
import com.pragma.powerup.domain.model.PedidoPlatoModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class PedidoPlatoHandler implements IPedidoPlatoHandler {

    private final IPedidoPlatoServicePort pedidoPlatoServicePort;
    private final IPedidoPlatoRequestMapper pedidoPlatoRequestMapper;
    private final IPedidoPlatoResponseMapper pedidoPlatoResponseMapper;

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
    public void savePedidoPlato(PedidoPlatoRequestDto pedidoPlatoRequestDto) {
        PedidoPlatoModel pedidoPlatoModel = pedidoPlatoRequestMapper.toPedidoPlato(pedidoPlatoRequestDto);
        pedidoPlatoServicePort.savePedidoPlato(pedidoPlatoModel);

    }

    @Override
    public List<PedidoPlatoResponseDto> getAllPedidoPlatos() {
        return pedidoPlatoResponseMapper.toResponseList(pedidoPlatoServicePort.getAllPedidoPlatos());
    }
}