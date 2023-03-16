package com.pragma.powerup.domain.usecase;

import com.pragma.powerup.domain.api.IPlatoServicePort;
import com.pragma.powerup.domain.model.ObjectModel;
import com.pragma.powerup.domain.model.PlatoModel;
import com.pragma.powerup.domain.spi.IPlatoPersistencePort;

import java.util.List;

public class PlatoUseCase implements IPlatoServicePort {

    private final IPlatoPersistencePort platoPersistencePort;

    public PlatoUseCase(IPlatoPersistencePort platoPersistencePort) {
        this.platoPersistencePort = platoPersistencePort;
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
    public void savePlato(PlatoModel platoModel) {
        platoPersistencePort.savePlato(platoModel);

    }

    @Override
    public List<PlatoModel> getAllPlatos() {
        return platoPersistencePort.getAllPlatos();
    }
}