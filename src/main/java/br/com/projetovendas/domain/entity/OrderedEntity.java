package br.com.projetovendas.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="dad_pedido", schema = "tabaale_bd")
public class OrderedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pdd_id")
    private Integer id;

    @Column(name = "pdd_cliente")
    private Integer cliente;

    @Column(name = "pdd_data")
    private Date data;

    @Column(name = "pdd_total")
    private BigDecimal total;

    @Column(name = "pdd_situacao")
    private boolean situacao;
}