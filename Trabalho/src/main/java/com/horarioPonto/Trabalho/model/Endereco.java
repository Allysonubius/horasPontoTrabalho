package com.horarioPonto.Trabalho.Model;

import lombok.*;
import javax.persistence.*;

@Data
@Builder
@Entity
public class Endereco {

    @Id
    private Long idEndereco;
    private String endereco;
    private String bairro;
    private String numeroCasa;
    private String cidade;
    private String estado;
}
