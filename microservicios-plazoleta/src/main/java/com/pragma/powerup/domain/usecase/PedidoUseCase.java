package com.pragma.powerup.domain.usecase;

import com.pragma.powerup.domain.api.IPedidoServicePort;
import com.pragma.powerup.domain.model.ObjectModel;
import com.pragma.powerup.domain.model.PedidoModel;
import com.pragma.powerup.domain.spi.IPedidoPersistencePort;

import java.util.List;

public class PedidoUseCase implements IPedidoServicePort {

    private final IPedidoPersistencePort pedidoPersistencePort;

    public PedidoUseCase(IPedidoPersistencePort pedidoPersistencePort) {
        this.pedidoPersistencePort = pedidoPersistencePort;
    }


//    @Override
//    public void saveObject(ObjectModel objectModel) {
//        objectPersistencePort.saveObject(objectModel);
//    }
//
//    @Override
//    public List<ObjectModel> getAllObjects() {
//        return objectPersistencePort.getAllObjects();
//    }

    @Override
    public void savePedido(PedidoModel pedidoModel) {
        pedidoPersistencePort.savePedido(pedidoModel);

    }

    @Override
    public List<PedidoModel> getAllPedidos() {
        return pedidoPersistencePort.getAllPedidos();
    }
}