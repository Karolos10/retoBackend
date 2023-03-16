package com.pragma.powerup.domain.api;

import com.pragma.powerup.domain.model.PedidoPlatoModel;

import java.util.List;

public interface IPedidoPlatoServicePort {

    void savePedidoPlato(PedidoPlatoModel pedidoPlatoModel);

    List<PedidoPlatoModel> getAllPedidoPlatos();
}