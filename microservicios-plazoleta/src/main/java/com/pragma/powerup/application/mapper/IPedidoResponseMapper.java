package com.pragma.powerup.application.mapper;

import com.pragma.powerup.application.dto.response.ObjectResponseDto;
import com.pragma.powerup.application.dto.response.PedidoResponseDto;
import com.pragma.powerup.domain.model.ObjectModel;
import com.pragma.powerup.domain.model.PedidoModel;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IPedidoResponseMapper {
    PedidoResponseDto toResponse(PedidoModel pedidoModel);

    List<PedidoResponseDto> toResponseList(List<PedidoModel> pedidoModelList);
}
