package com.pragma.powerup.infrastructure.out.jpa.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "roles")
public class RolEntity {

    @Id
    @Column(name = "rol_id", nullable = false)
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRol;

    private String nombre;

    private String descripcion;

    @OneToMany(mappedBy = "rolEntity")
    private List<UsuarioEntity> usuarioEntity;

}
