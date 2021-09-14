package Live.model;

import lombok.*;

@Data
@Builder
public class Endereco {
    private String endereco;
    private String bairro;
    private String numeroCasa;
    private String cidade;
    private String estado;
}
