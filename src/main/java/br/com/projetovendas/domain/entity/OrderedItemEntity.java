package br.com.projetovendas.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="dad_pedido_item", schema = "tabaale_bd")
public class OrderedItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ptm_id")
    private Integer id;

    @Column(name = "ptm_pedido")
    private Integer pedido;

    @Column(name = "ptm_produto")
    private Integer produto;

    @Column(name = "ptm_quantidade")
    private BigDecimal quantidade;
}