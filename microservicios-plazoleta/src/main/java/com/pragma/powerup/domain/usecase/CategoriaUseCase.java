package com.pragma.powerup.domain.usecase;

import com.pragma.powerup.domain.api.ICategoriaServicePort;
import com.pragma.powerup.domain.model.CategoriaModel;
import com.pragma.powerup.domain.model.ObjectModel;
import com.pragma.powerup.domain.spi.ICategoriaPersistencePort;

import java.util.List;

public class CategoriaUseCase implements ICategoriaServicePort {

    private final ICategoriaPersistencePort categoriaPersistencePort;

    public CategoriaUseCase(ICategoriaPersistencePort categoriaPersistencePort) {
        this.categoriaPersistencePort = categoriaPersistencePort;
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
    public void saveCategoria(CategoriaModel categoriaModel) {
        categoriaPersistencePort.saveCategoria(categoriaModel);

    }

    @Override
    public List<CategoriaModel> getAllCategorias() {
        return categoriaPersistencePort.getAllCategorias();
    }
}