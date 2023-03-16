package com.pragma.powerup.application.mapper;

import com.pragma.powerup.application.dto.response.ObjectResponseDto;
import com.pragma.powerup.application.dto.response.RestauranteEmpleadoResponseDto;
import com.pragma.powerup.domain.model.ObjectModel;
import com.pragma.powerup.domain.model.RestauranteEmpleadoModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IRestauranteEmpleadoResponseMapper {
    RestauranteEmpleadoResponseDto toResponse(RestauranteEmpleadoModel restauranteEmpleadoModel);

    List<RestauranteEmpleadoResponseDto> toResponseList(List<RestauranteEmpleadoModel> restauranteEmpleadoModelList);
}
