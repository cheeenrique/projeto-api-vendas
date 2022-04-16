package br.com.projetovendas.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="dad_clientes", schema = "tabaale_bd")
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clt_id")
    private Integer id;

    @Column(name = "clt_nome")
    private String nome;

    @Column(name = "clt_sobrenome")
    private String sobrenome;

    @Column(name = "clt_cpf")
    private String cpf;

    @Column(name = "clt_situacao")
    private boolean situacao;
}