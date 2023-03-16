package com.pragma.powerup.application.dto.request;

import com.pragma.powerup.domain.model.PedidoModel;
import com.pragma.powerup.domain.model.PlatoModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PedidoPlatoRequestDto {
    private PedidoModel pedido;
    private PlatoModel plato;
    private Integer catidad;
}
