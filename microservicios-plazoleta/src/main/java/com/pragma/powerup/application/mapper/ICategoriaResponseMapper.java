package com.pragma.powerup.application.mapper;

import com.pragma.powerup.application.dto.response.CategoriaResponseDto;
import com.pragma.powerup.application.dto.response.ObjectResponseDto;
import com.pragma.powerup.domain.model.CategoriaModel;
import com.pragma.powerup.domain.model.ObjectModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ICategoriaResponseMapper {
    CategoriaResponseDto toResponse(CategoriaModel categoriaModel);

    List<CategoriaResponseDto> toResponseList(List<CategoriaModel> categoriaModelList);
}
