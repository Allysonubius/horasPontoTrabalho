package com.horarioPonto.Trabalho.model;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@Entity
@Table(name = "OCORRENCIA")
public class Ocorrencia {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @NotNull(message = "O campo NOME não deve ser vazio !")
    @Size(min = 50 , max = 250)
    private String nome;
    
    @Size(min = 50 , max = 250)
    private String descricao;
}
