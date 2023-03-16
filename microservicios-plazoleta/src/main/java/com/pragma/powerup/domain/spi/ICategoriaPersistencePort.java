package com.pragma.powerup.domain.spi;

import com.pragma.powerup.domain.model.CategoriaModel;
import com.pragma.powerup.domain.model.ObjectModel;

import java.util.List;

public interface ICategoriaPersistencePort {
    CategoriaModel saveCategoria(CategoriaModel categoriaModel);

    List<CategoriaModel> getAllCategorias();
}