package com.pragma.powerup.application.handler.impl;

import com.pragma.powerup.application.dto.request.ObjectRequestDto;
import com.pragma.powerup.application.dto.request.PlatoRequestDto;
import com.pragma.powerup.application.dto.response.ObjectResponseDto;
import com.pragma.powerup.application.dto.response.PlatoResponseDto;
import com.pragma.powerup.application.handler.IObjectHandler;
import com.pragma.powerup.application.handler.IPlatoHandler;
import com.pragma.powerup.application.mapper.IObjectRequestMapper;
import com.pragma.powerup.application.mapper.IObjectResponseMapper;
import com.pragma.powerup.application.mapper.IPlatoRequestMapper;
import com.pragma.powerup.application.mapper.IPlatoResponseMapper;
import com.pragma.powerup.domain.api.IObjectServicePort;
import com.pragma.powerup.domain.api.IPlatoServicePort;
import com.pragma.powerup.domain.model.ObjectModel;
import com.pragma.powerup.domain.model.PlatoModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class PlatoHandler implements IPlatoHandler {

    private final IPlatoServicePort platoServicePort;
    private final IPlatoRequestMapper platoRequestMapper;
    private final IPlatoResponseMapper platoResponseMapper;

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
    public void savePlatos(PlatoRequestDto platoRequestDto) {
        PlatoModel platoModel = platoRequestMapper.toPlato(platoRequestDto);
        platoServicePort.savePlato(platoModel);

    }

    @Override
    public List<PlatoResponseDto> getAllPlatos() {
        return platoResponseMapper.toResponseList(platoServicePort.getAllPlatos());
    }
}