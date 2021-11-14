package com.horarioPonto.Trabalho.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.validator.constraints.br.CPF;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@Entity
@Table(name = "USUARIO")
public class Usuario {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "CATEGORIA_USUARIO_ID")
    private CategoriaUsuario categoriaUsuario;


    @NotNull(message = "O campo NOME não deve ser vazio !")
    @Size(min = 50 , max = 250)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "EMPRESA_ID")
    private Empresa empresa;
    
    @NotEmpty(message = "O campo CPF não deve ser vazio !")
    @Size(min = 11 , max = 11)
    @CPF(groups = Usuario.class)
    private String cpf;

    @ManyToOne
    @JoinColumn(name = "ENDERECO_ID")
    @NotFound(action = NotFoundAction.IGNORE)
    private EnderecoUsuario enderecoUsuario;

    @ManyToOne
    @JoinColumn(name = "NIVEL_ACESSO_ID")
    private NivelAcesso nivelAcesso;

    @ManyToOne
    @JoinColumn(name = "JORNADA_TRABALHO_ID")
    private JornadaTrabalho jornadaTrabalho;
}
