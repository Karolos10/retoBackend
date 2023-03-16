package com.pragma.powerup.application.handler;

import com.pragma.powerup.application.dto.request.CategoriaRequestDto;
import com.pragma.powerup.application.dto.request.ObjectRequestDto;
import com.pragma.powerup.application.dto.response.CategoriaResponseDto;
import com.pragma.powerup.application.dto.response.ObjectResponseDto;

import java.util.List;

public interface ICategoriaHandler {

    void saveCategoria(CategoriaRequestDto categoriaRequestDto);

    List<CategoriaResponseDto> getAllCategorias();
}