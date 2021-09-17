package com.horarioPonto.Trabalho.model;

import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Table(name = "OCORRENCIA")
public class Ocorrencia {

    @Id
    private Long Id;
    private String nome;
    private String descricao;
}
