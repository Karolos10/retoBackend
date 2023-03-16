package com.pragma.powerup.infrastructure.out.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "restaurante")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RestauranteEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "restaurante_id", nullable = false)
    private Long idRestaurante;

    @Column(length = 50)
    private String nombreRestaurante;

    @Column(name = "direccionRestaurante", length = 80)
    private String direccionRestaurante;

    @Column(name = "telefonoRestaurante")
    private String telefonoRestaurante;

    @Column(name = "urlLogoRestaurante")
    private String urlLogoRestaurante;

    @Column(name = "nitRestaurante")
    private Long nitRestaurante;

    @OneToMany(mappedBy = "restauranteEntity")
    private List<RestauranteEmpleadoEntity> restauranteEmpleadoEntity;

    @OneToMany(mappedBy = "restauranteEntity")
    private List<PlatoEntity> platoEntity;

    @OneToMany(mappedBy = "restauranteEntity")
    private List<PedidoEntity> pedidoEntity;
}
