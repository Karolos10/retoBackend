package com.pragma.powerup.infrastructure.out.jpa.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "usuario")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    private String apellido;

    @Column(nullable = false, unique = true)
    private Long cedula;

    @Column(nullable = false, unique = true)
    private String celular;

    @Column(nullable = false, unique = true)
    private String correo;

    private String clave;

    @ManyToOne
    @JoinColumn(name = "idRol", insertable = false, updatable = false)
    private RolEntity rolEntity;
}
