package com.horarioPonto.Trabalho.model;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@Entity
@Table(name = "EMPRESA")
public class Empresa {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Size(min = 50 , max = 250)
    private String descricao;

    @NotEmpty(message = "O Campo CNPJ não pode ser vazio !")
    @Size(min=13 ,max = 13)
    private String cnpj;

    @ManyToOne
    @JoinColumn(name = "ENDERECO_ID")
    @NotFound(action = NotFoundAction.IGNORE)
    private EnderecoEmpresa endereco;

    @ManyToOne
    @JoinColumn(name = "TELEFONE_ID")
    @NotFound(action = NotFoundAction.IGNORE)
    private Telefone telefone;
}
