package br.com.projetovendas.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDTO {
    private Integer id;
    private String nome;
    private String sobrenome;
    private String cpf;
    private boolean situacao;
}