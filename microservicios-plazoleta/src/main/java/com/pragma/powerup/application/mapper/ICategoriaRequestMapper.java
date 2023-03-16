package com.pragma.powerup.application.mapper;

import com.pragma.powerup.application.dto.request.CategoriaRequestDto;
import com.pragma.powerup.application.dto.request.ObjectRequestDto;
import com.pragma.powerup.domain.model.CategoriaModel;
import com.pragma.powerup.domain.model.ObjectModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface ICategoriaRequestMapper {
    CategoriaModel toCategoria(CategoriaRequestDto categoriaRequestDto);
}
