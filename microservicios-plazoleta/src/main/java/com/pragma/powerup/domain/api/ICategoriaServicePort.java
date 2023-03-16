package com.pragma.powerup.domain.api;

import com.pragma.powerup.domain.model.CategoriaModel;
import com.pragma.powerup.domain.model.ObjectModel;

import java.util.List;

public interface ICategoriaServicePort {

    void saveCategoria(CategoriaModel categoriaModel);

    List<CategoriaModel> getAllCategorias();
}