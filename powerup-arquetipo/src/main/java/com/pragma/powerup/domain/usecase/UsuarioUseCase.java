package com.pragma.powerup.domain.usecase;

import com.pragma.powerup.domain.api.IUsuarioServicePort;
import com.pragma.powerup.domain.exception.DomainException;
import com.pragma.powerup.domain.model.UsuarioModel;
import com.pragma.powerup.domain.spi.IUsuarioPersistencePort;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsuarioUseCase implements IUsuarioServicePort {

    private final IUsuarioPersistencePort usuarioPersistencePort;

    public UsuarioUseCase(IUsuarioPersistencePort usuarioPersistencePort) {
        this.usuarioPersistencePort = usuarioPersistencePort;
    }

    @Override
    public void saveUsuario(UsuarioModel usuarioModel) {

        //Valida y verifica que se pueda incluir el + en el numero de telefono

        Pattern numeroTelefono = Pattern.compile("\\+?\\d{12}");

        Matcher numeroTelefonoMatcher = numeroTelefono.matcher(usuarioModel.getCelular());

        if(!numeroTelefonoMatcher.matches()){
            throw new DomainException("numero invalido: " + usuarioModel.getCelular());
        }

        if(!usuarioModel.getCelular().contains("+")){
            usuarioModel.setCelular("+" + usuarioModel.getCelular());
        }

//        String mumeroTelefonoPrefijo = usuarioModel.getCelular().contains("+")
//                ? usuarioModel.getCelular()
//                : "+" + usuarioModel.getCelular();

//        usuarioModel.setCelular(mumeroTelefonoPrefijo);
        System.out.println(usuarioModel);

        usuarioPersistencePort.saveUsuario(usuarioModel);



    }

    @Override
    public List<UsuarioModel> getAllUsuario() {
        return usuarioPersistencePort.getAllUsuario();
    }

    @Override
    public UsuarioModel getUsuario(Long UsuarioId) {
        return usuarioPersistencePort.getUsuario(UsuarioId);
    }

    @Override
    public void updateUsuario(UsuarioModel usuarioModel) {
        usuarioPersistencePort.updateUsuario((usuarioModel));

    }

    @Override
    public void deleteUsuario(Long UsuarioId) {
        usuarioPersistencePort.deleteUsuario(UsuarioId);

    }
}
