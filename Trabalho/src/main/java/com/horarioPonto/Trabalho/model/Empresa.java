package Live.model;

import lombok.*;

@Data
@Builder
public class Empresa {
    private Long id;
    private String descricao;
    private String cnpj;
    private Endereco endereco;
    private Telefone telefone;
}
