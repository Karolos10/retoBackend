package com.pragma.powerup.infrastructure.out.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "restauranteEmpleado")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RestauranteEmpleadoEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "restauranteEmpleado_id", nullable = false)
    private Long idRestauranteEmpleado;
    @Column(name = "fielRestauranetEmpleado")
    private String field;

    @ManyToOne
    @JoinColumn(name = "id_restaurante", insertable = false, updatable = false)
    private RestauranteEntity restauranteEntity;
}
