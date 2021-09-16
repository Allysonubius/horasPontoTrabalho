package com.horarioPonto.Trabalho.Model;

import lombok.*;
import javax.persistence.*;
import java.io.*;
import java.math.*;
import java.time.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
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

    @Id
    @EmbeddedId
    private BancoHorasId id;
    private LocalDateTime dataTrabalhada;
    private BigDecimal quantidadeHoras;
    private BigDecimal saldoHoras;

}
