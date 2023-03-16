package com.pragma.powerup.infrastructure.out.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categoria")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CategoriaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "categoria_id", nullable = false)
    private Long idCategoria;

    @Column(name = "NombreCategoria")
    private String nombreCategoria;

    private String descripcionCategorian;

    @OneToMany(mappedBy = "categoriaEntity")
    private List<PlatoEntity> platoEntity;
}
