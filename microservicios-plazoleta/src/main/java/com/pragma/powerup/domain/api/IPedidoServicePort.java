package com.pragma.powerup.domain.api;

import com.pragma.powerup.domain.model.ObjectModel;
import com.pragma.powerup.domain.model.PedidoModel;

import java.util.List;

public interface IPedidoServicePort {

    void savePedido(PedidoModel pedidoModel);

    List<PedidoModel> getAllPedidos();
}