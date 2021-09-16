package com.horarioPonto.Trabalho.Model;

import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Ocorrencia {

    @Id
    private Long Id;
    private String nome;
    private String descricao;
}
