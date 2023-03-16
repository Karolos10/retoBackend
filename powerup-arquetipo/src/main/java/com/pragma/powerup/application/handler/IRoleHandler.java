package com.pragma.powerup.application.handler;

import com.pragma.powerup.application.dto.request.ObjectRequestDto;
import com.pragma.powerup.application.dto.request.RoleRequestDto;
import com.pragma.powerup.application.dto.response.ObjectResponseDto;
import com.pragma.powerup.application.dto.response.RoleResponseDto;

import java.util.List;

public interface IRoleHandler {

    void saveRole(RoleRequestDto roleRequestDto);

    List<RoleResponseDto> getAllRoles();
}