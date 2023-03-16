package com.pragma.powerup.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RestauranteModel {
    private Long idRestauranteModel;
    private String nombreRestaurante;
    private String direccionRestaurante;

    //TODO traer la integracion del objeto usuario
    private Long idPropietario;
    private String telefonoRestaurante;
    private String urlLogo;
    private Long nit;
}
