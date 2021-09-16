package com.horarioPonto.Trabalho.Model;

import lombok.*;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class JornadaTrabalho {

    @Id
    @GeneratedValue
    private long id;
    private String descricao;
}