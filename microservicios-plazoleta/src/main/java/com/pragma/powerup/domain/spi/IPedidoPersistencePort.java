package com.pragma.powerup.domain.spi;

import com.pragma.powerup.domain.model.ObjectModel;
import com.pragma.powerup.domain.model.PedidoModel;

import java.util.List;

public interface IPedidoPersistencePort {
    PedidoModel savePedido(PedidoModel pedidoModel);

    List<PedidoModel> getAllPedidos();
}