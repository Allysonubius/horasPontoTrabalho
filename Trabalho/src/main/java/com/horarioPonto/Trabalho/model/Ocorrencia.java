package Live.model;

import lombok.*;

@Data
@Builder
public class Ocorrencia {
    private Long Id;
    private String nome;
    private String descricao;
}
