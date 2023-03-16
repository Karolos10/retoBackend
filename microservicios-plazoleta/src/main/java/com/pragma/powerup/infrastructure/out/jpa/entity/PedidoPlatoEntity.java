package com.pragma.powerup.infrastructure.out.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "pedido_plato")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PedidoPlatoEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "pedidoPlato_id", nullable = false)
    private Long idPedidoPlato;

    @Column(name = "catidadPedidoPlato")
    private Integer catidad;
    @ManyToOne
    @JoinColumn(name = "id_pedido", insertable = false, updatable = false)
    private PedidoEntity pedidoEntity;

    @ManyToOne
    @JoinColumn(name = "id_plato", insertable = false, updatable = false)
    private PlatoEntity platoEntity;
}
