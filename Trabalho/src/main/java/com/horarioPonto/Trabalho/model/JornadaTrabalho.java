package com.horarioPonto.Trabalho.model;

import lombok.*;
import java.sql.Time;
import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@Entity
@Table(name = "JORNADA_TRABALHO")
public class JornadaTrabalho  {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 1, max = 50)
    private String descricao;
    
    private Time tolerancia;

    private Time inicioJornada;
    
    private Time fimJornada;
}