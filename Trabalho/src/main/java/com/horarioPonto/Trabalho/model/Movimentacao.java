package com.horarioPonto.Trabalho.model;

import java.io.*;
import java.math.*;
import java.time.*;
import javax.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@Entity
@Table(name = "MOVIMENTACAO")
public class Movimentacao {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class MovimentacaoId implements Serializable {
        private Long idMovimento;

        private Long idUsuario;
    }

    @EmbeddedId
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private MovimentacaoId id;

    private LocalDateTime dataEntrada;

    private LocalDateTime dataSaida;

    private BigDecimal periodo;

    @ManyToOne
    @JoinColumn(name = "OCORRENCIA_ID")
    private Ocorrencia ocorrencia;

    @ManyToOne
    @JoinColumn(name = "CALENDARIO_ID")
    private Calendario calendario;
}
