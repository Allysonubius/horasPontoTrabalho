package Live.model;

import java.time.*;
import lombok.*;

@Data
@Builder
public class Calendario {
    private Long id;
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dataEspecial;
}
