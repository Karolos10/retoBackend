package com.pragma.powerup.domain.spi;

import com.pragma.powerup.domain.model.ObjectModel;
import com.pragma.powerup.domain.model.PedidoPlatoModel;

import java.util.List;

public interface IPedidoPlatoPersistencePort {
    PedidoPlatoModel savePedidoPlato(PedidoPlatoModel pedidoPlatoModel);

    List<PedidoPlatoModel> getAllPedidoPlatos();
}