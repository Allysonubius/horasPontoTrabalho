package com.horarioPonto.Trabalho.model;

import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Empresa {

    @Id
    private Long id;
    private String descricao;
    private String cnpj;
    @ManyToOne
    private Endereco endereco;
    @ManyToOne
    private Telefone telefone;
}
