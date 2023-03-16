package com.pragma.powerup.infrastructure.out.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "plato")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PlatoEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "plato_id", nullable = false)
    private Long idPlato;

    @Column(name = "nombrePlato", length = 50)
    private String nombrePlato;

    @Column(name = "descripcionPlato")
    private String descripcionPlato;

    @Column(name = "precioPlato")
    private Integer precioPlato;

    @Column(name = "urlPlato")
    private String url_imagen;

    @Column(name = "activoPlato")
    private Boolean activoPlato;

    @OneToMany(mappedBy = "platoEntity")
    private List<PedidoPlatoEntity> pedidoPlatoEntity;

    @ManyToOne
    @JoinColumn(name = "idCategoria", insertable = false, updatable = false)
    private CategoriaEntity categoriaEntity;

    @ManyToOne
    @JoinColumn(name = "id_restaurante", insertable = false, updatable = false)
    private RestauranteEntity restauranteEntity;
}
