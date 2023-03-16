package com.pragma.powerup.application.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RestauranteRequestDto {
    private Long idRestauranteModel;
    private String nombreRestaurante;
    private String direccionRestaurante;

    //TODO traer la integracion del objeto usuario
    private Long idPropietario;
    private String telefonoRestaurante;
    private String urlLogo;
    private Long nit;
}
