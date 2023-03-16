package com.pragma.powerup.infrastructure.out.jpa.repository;

import com.pragma.powerup.infrastructure.out.jpa.entity.ObjectEntity;
import com.pragma.powerup.infrastructure.out.jpa.entity.RolEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<RolEntity, Long> {

}