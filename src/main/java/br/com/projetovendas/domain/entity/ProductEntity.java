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
@Table(name="dad_produto", schema = "tabaale_bd")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pdt_id")
    private Integer id;

    @Column(name = "pdt_nome")
    private String nome;

    @Column(name = "pdt_valor_unitario")
    private BigDecimal sobrenome;

    @Column(name = "pdt_situacao")
    private boolean situacao;
}