package com.pragma.powerup.application.dto.request;

import com.pragma.powerup.domain.model.RestauranteModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RestauranteEmpleadoRequestDto {
    private RestauranteModel restaurante;

    //TODO traer la integracion del objeto usuario
    private Long idPersonage;
    private String field;
}
