package com.pragma.powerup.domain.spi;

import com.pragma.powerup.domain.model.RoleModel;

import java.util.List;

public interface IRolePersistencePort {

    void saveRole(RoleModel roleModel);

    List<RoleModel> getAllRole();

    RoleModel getRole(Long RoleId);

    void updateRole(RoleModel roleModel);

    void deleteRole(Long RoleId);
}
