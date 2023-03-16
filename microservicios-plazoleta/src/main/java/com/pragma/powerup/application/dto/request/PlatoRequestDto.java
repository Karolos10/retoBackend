package com.pragma.powerup.application.dto.request;

import com.pragma.powerup.domain.model.CategoriaModel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlatoRequestDto {
    private Long idPlator;
    private String nombrePlato;
    private CategoriaModel categoria;
    private String descripcionPlator;
    private Integer percioPlato;
    private String url_imagen;
    private Boolean activo;
}
