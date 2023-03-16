package com.pragma.powerup.infrastructure.out.jpa.mapper;

import com.pragma.powerup.domain.model.ObjectModel;
import com.pragma.powerup.domain.model.RoleModel;
import com.pragma.powerup.infrastructure.out.jpa.entity.ObjectEntity;
import com.pragma.powerup.infrastructure.out.jpa.entity.RolEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)
public interface IRoleEntityMapper {

    RolEntity toEntity(RoleModel user);
    RoleModel toRoleModel(RolEntity rolEntity);
    List<RoleModel> toRoleModelList(List<RolEntity> userEntityList);
}