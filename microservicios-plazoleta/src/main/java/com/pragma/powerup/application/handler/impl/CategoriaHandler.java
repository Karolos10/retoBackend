package com.pragma.powerup.application.handler.impl;

import com.pragma.powerup.application.dto.request.CategoriaRequestDto;
import com.pragma.powerup.application.dto.request.ObjectRequestDto;
import com.pragma.powerup.application.dto.response.CategoriaResponseDto;
import com.pragma.powerup.application.dto.response.ObjectResponseDto;
import com.pragma.powerup.application.handler.ICategoriaHandler;
import com.pragma.powerup.application.handler.IObjectHandler;
import com.pragma.powerup.application.mapper.ICategoriaRequestMapper;
import com.pragma.powerup.application.mapper.ICategoriaResponseMapper;
import com.pragma.powerup.application.mapper.IObjectRequestMapper;
import com.pragma.powerup.application.mapper.IObjectResponseMapper;
import com.pragma.powerup.domain.api.ICategoriaServicePort;
import com.pragma.powerup.domain.api.IObjectServicePort;
import com.pragma.powerup.domain.model.CategoriaModel;
import com.pragma.powerup.domain.model.ObjectModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class CategoriaHandler implements ICategoriaHandler {

    private final ICategoriaServicePort categoriaServicePort;
    private final ICategoriaRequestMapper categoriaRequestMapper;
    private final ICategoriaResponseMapper categoriaResponseMapper;

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
    public void saveCategoria(CategoriaRequestDto categoriaRequestDto) {
        CategoriaModel categoriaModel = categoriaRequestMapper.toCategoria(categoriaRequestDto);
        categoriaServicePort.saveCategoria(categoriaModel);
    }

    @Override
    public List<CategoriaResponseDto> getAllCategorias() {
        return categoriaResponseMapper.toResponseList(categoriaServicePort.getAllCategorias());
    }
}