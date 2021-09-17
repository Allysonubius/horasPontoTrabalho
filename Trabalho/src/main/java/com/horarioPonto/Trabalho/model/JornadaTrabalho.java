package com.horarioPonto.Trabalho.model;

import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Table(name = "JORNADA_TRABALHO")
public class JornadaTrabalho  {

    @Id
    private long id;
    private String descricao;
}