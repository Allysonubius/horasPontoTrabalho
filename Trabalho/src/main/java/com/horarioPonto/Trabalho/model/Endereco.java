package com.horarioPonto.Trabalho.model;

import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Endereco {

    @Id
    private Long idEndereco;
    private String endereco;
    private String bairro;
    private String numeroCasa;
    private String cidade;
    private String estado;
}
