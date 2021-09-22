package com.horarioPonto.Trabalho.model;

import javax.persistence.*;
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

    private String nome;

    @ManyToOne
    @JoinColumn(name = "EMPRESA_ID")
    private Empresa empresa;
    
    private String cpf;

    @ManyToOne
    @JoinColumn(name = "ENDERECO_EMPRESA_ID")
    private EnderecoUsuario enderecoUsuario;

    @ManyToOne
    @JoinColumn(name = "NIVEL_ACESSO_ID")
    private NivelAcesso nivelAcesso;

    @ManyToOne
    @JoinColumn(name = "JORNADA_TRABALHO_ID")
    private JornadaTrabalho jornadaTrabalho;
}
