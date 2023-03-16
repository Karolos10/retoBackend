package com.pragma.powerup.infrastructure.out.jpa.adapter;

import com.pragma.powerup.domain.model.UsuarioModel;
import com.pragma.powerup.domain.spi.IUsuarioPersistencePort;
import com.pragma.powerup.infrastructure.exception.NoDataFoundException;
import com.pragma.powerup.infrastructure.out.jpa.entity.UsuarioEntity;
import com.pragma.powerup.infrastructure.out.jpa.mapper.IUsuarioEntityMapper;
import com.pragma.powerup.infrastructure.out.jpa.repository.IUsuarioRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class UsuarioJpaAdapter implements IUsuarioPersistencePort {

    private final IUsuarioRepository usuarioRepository;
    private final IUsuarioEntityMapper usuarioEntityMapper;


//    @Override
//    public ObjectModel saveObject(ObjectModel objectModel) {
//        ObjectEntity objectEntity = objectRepository.save(objectEntityMapper.toEntity(objectModel));
//        return objectEntityMapper.toObjectModel(objectEntity);
//    }

//    @Override
//    public List<ObjectModel> getAllObjects() {
//        List<ObjectEntity> entityList = objectRepository.findAll();
//        if (entityList.isEmpty()) {
//            throw new NoDataFoundException();
//        }
//        return objectEntityMapper.toObjectModelList(entityList);
//    }

    @Override
    public void saveUsuario(UsuarioModel usuarioModel) {
        System.out.println(usuarioModel);
        UsuarioEntity usuarioEntity = usuarioRepository.save(usuarioEntityMapper.toEntity(usuarioModel));
        usuarioEntityMapper.toUsuarioModel(usuarioEntity);
        System.out.println(usuarioEntity);

    }

    @Override
    public List<UsuarioModel> getAllUsuario() {
        List<UsuarioEntity> entityList = usuarioRepository.findAll();
        if (entityList.isEmpty()){
            throw new NoDataFoundException();
        }
        return usuarioEntityMapper.toUsuarioModelList(entityList);
    }

    @Override
    public UsuarioModel getUsuario(Long UsuarioId) {
        return null;
    }

    @Override
    public void updateUsuario(UsuarioModel usuarioModel) {

    }

    @Override
    public void deleteUsuario(Long UsuarioId) {

    }
}