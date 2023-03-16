package com.pragma.powerup.infrastructure.out.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "pedido")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PedidoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "pedido_id", nullable = false)
    private Long idPedido;

    @Column(name = "fechaPedido")
    private LocalDate fecha;

    @Column(name = "estadoPedido")
    private String estado;

    @OneToMany(mappedBy = "pedidoEntity")
    private List<PedidoPlatoEntity> pedidoPlatoEntity;

    @ManyToOne
    @JoinColumn(name = "id_restaurante", insertable = false, updatable = false)
    private RestauranteEntity restauranteEntity;
}
