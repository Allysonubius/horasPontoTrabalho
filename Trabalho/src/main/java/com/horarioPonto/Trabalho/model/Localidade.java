package Live.model;

import javax.persistence.*;
import lombok.*;

@Data
@Builder
public class Localidade {
    private Long id;
    
    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String descricao;
}
