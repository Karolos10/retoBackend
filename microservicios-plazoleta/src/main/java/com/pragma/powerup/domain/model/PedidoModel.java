package com.pragma.powerup.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PedidoModel {

    private Long id;

    //TODO traer la integracion del objeto usuario
    private Long idCliente;
    private Date fecha;
    private String estado;

    //TODO traer la integracion del objeto usuario
    private Long idChef;
    private RestauranteModel restaurante;
}
