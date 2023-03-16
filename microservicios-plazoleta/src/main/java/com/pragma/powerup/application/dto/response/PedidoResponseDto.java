package com.pragma.powerup.application.dto.response;

import com.pragma.powerup.domain.model.RestauranteModel;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class PedidoResponseDto {
    private Long id;

    //TODO traer la integracion del objeto usuario
    private Long idCliente;
    private Date fecha;
    private String estado;

    //TODO traer la integracion del objeto usuario
    private Long idChef;
    private RestauranteModel restaurante;
}
