package com.horarioPonto.Trabalho.model;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@Entity
@Table(name = "ENDERECO_EMPRESA")
public class EnderecoEmpresa {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEndereco;

    @NotNull(message = "Campo ENDEREÇO não deve ser vazio !")
    @Size(min = 50 , max = 250)
    private String endereco;

    @NotNull(message = "Campo BAIRRO não deve ser vazio !")
    @Size(min = 50 , max = 150)
    private String bairro;

    @NotNull(message = "Campo NUMERO CASA não deve ser vazio !")
    @Size(min = 10 , max = 10)
    private String numeroCasa;

    @Size(min = 50 , max = 150)
    private String complemento;

    @NotNull(message = "Campo CIDADE não deve ser vazio !")
    @Size(min = 50 , max = 70)
    private String cidade;
    
    @NotNull(message = "Campo ESTADO não deve ser vazio !")
    @Size(min = 50 , max = 100)
    private String estado;
}
