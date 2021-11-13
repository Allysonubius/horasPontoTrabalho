package com.horarioPonto.Trabalho.model;

import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
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

    @Size(min = 50 , max = 250)
    private String descricao;

    private BigDecimal tolerancia;

    private LocalDateTime inicioJornada;
    
    private LocalDateTime fimJornada;
}