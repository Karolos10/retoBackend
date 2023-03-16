package com.pragma.powerup.domain.api;

import com.pragma.powerup.domain.model.UsuarioModel;

import java.util.List;

public interface IUsuarioServicePort {

    void saveUsuario(UsuarioModel usuarioModel);

    List<UsuarioModel> getAllUsuario();

    UsuarioModel getUsuario(Long UsuarioId);

    void updateUsuario(UsuarioModel usuarioModel);

    void deleteUsuario(Long UsuarioId);
}
