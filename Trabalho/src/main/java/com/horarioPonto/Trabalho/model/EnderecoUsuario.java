package com.horarioPonto.Trabalho.model;

import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@Entity
@Table(name = "ENDERECO_USUARIO")
public class EnderecoUsuario {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEndereco;

    private String endereco;

    private String bairro;

    private String numeroCasa;

    private String cidade;
    
    private String estado;
}
