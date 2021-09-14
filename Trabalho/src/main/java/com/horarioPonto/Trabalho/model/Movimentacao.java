package Live.model;

import java.io.*;
import java.math.*;
import java.time.*;
import javax.persistence.*;
import lombok.*;

@Data
@Builder
public class Movimentacao {
    
    @Data
    @Embeddable
    public class MovimentacaoId implements Serializable {
        private Long idMovimento;
        private Long idUsuario;
    }

    @EmbeddedId
    private MovimentacaoId id;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;
    private Ocorrencia ocorrencia;
    private Calendario calendario;
}
