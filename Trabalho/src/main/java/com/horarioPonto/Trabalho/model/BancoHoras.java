package com.horarioPonto.Trabalho.model;

import lombok.*;
import javax.persistence.*;
import java.io.*;
import java.math.*;
import java.time.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@Entity
@Table(name = "BANCO_HORAS")
public class BancoHoras {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class  BancoHorasId implements Serializable {

        private Long idBancoHoras;

        private Long idMovimentacao;

        private Long idUsuario;
    }
    
    @EmbeddedId
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BancoHorasId id;

    private LocalDateTime dataTrabalhada;

    private BigDecimal quantidadeHoras;
    
    private BigDecimal saldoHoras;

}
