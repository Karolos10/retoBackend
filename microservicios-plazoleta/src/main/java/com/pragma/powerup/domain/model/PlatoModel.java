package com.pragma.powerup.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlatoModel {
    private Long idPlator;
    private String nombrePlato;
    private CategoriaModel categoria;
    private String descripcionPlator;
    private Integer percioPlato;
    private String url_imagen;
    private Boolean activo;
}
