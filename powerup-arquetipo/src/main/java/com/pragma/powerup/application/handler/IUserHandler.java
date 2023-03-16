package com.pragma.powerup.application.handler;

import com.pragma.powerup.application.dto.request.UsuarioRequestDto;
import com.pragma.powerup.application.dto.response.UsuarioResponseDto;

import java.util.List;

public interface IUserHandler {

    void saveUsuario(UsuarioRequestDto usuarioRequestDto);

    List<UsuarioResponseDto> getAllUsuarios();
}