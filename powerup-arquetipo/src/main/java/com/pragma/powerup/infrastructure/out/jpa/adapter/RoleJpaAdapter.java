package com.pragma.powerup.infrastructure.out.jpa.adapter;

import com.pragma.powerup.domain.model.ObjectModel;
import com.pragma.powerup.domain.model.RoleModel;
import com.pragma.powerup.domain.spi.IObjectPersistencePort;
import com.pragma.powerup.domain.spi.IRolePersistencePort;
import com.pragma.powerup.infrastructure.exception.NoDataFoundException;
import com.pragma.powerup.infrastructure.out.jpa.entity.ObjectEntity;
import com.pragma.powerup.infrastructure.out.jpa.entity.RolEntity;
import com.pragma.powerup.infrastructure.out.jpa.mapper.IObjectEntityMapper;
import com.pragma.powerup.infrastructure.out.jpa.mapper.IRoleEntityMapper;
import com.pragma.powerup.infrastructure.out.jpa.repository.IObjectRepository;
import com.pragma.powerup.infrastructure.out.jpa.repository.IRoleRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class RoleJpaAdapter implements IRolePersistencePort {

    private final IRoleRepository roleRepository;
    private final IRoleEntityMapper roleEntityMapper;


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
    public void saveRole(RoleModel roleModel) {
        RolEntity rolEntity = roleRepository.save(roleEntityMapper.toEntity(roleModel));
        roleEntityMapper.toRoleModel(rolEntity);

    }

    @Override
    public List<RoleModel> getAllRole() {
        List<RolEntity> entityList = roleRepository.findAll();
        if (entityList.isEmpty()){
            throw new NoDataFoundException();
        }
        return roleEntityMapper.toRoleModelList(entityList);
    }

    @Override
    public RoleModel getRole(Long RoleId) {
        return null;
    }

    @Override
    public void updateRole(RoleModel roleModel) {

    }

    @Override
    public void deleteRole(Long RoleId) {

    }
}