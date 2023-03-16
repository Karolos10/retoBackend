package com.pragma.powerup.domain.usecase;

import com.pragma.powerup.domain.api.IPedidoPlatoServicePort;
import com.pragma.powerup.domain.model.ObjectModel;
import com.pragma.powerup.domain.model.PedidoPlatoModel;
import com.pragma.powerup.domain.spi.IPedidoPlatoPersistencePort;

import java.util.List;

public class PedidoPlatoUseCase implements IPedidoPlatoServicePort {

    private final IPedidoPlatoPersistencePort pedidoPlatoPersistencePort;

    public PedidoPlatoUseCase(IPedidoPlatoPersistencePort pedidoPlatoPersistencePort) {
        this.pedidoPlatoPersistencePort = pedidoPlatoPersistencePort;
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
    public void savePedidoPlato(PedidoPlatoModel pedidoPlatoModel) {
        pedidoPlatoPersistencePort.savePedidoPlato(pedidoPlatoModel);
    }

    @Override
    public List<PedidoPlatoModel> getAllPedidoPlatos() {
        return pedidoPlatoPersistencePort.getAllPedidoPlatos();
    }
}