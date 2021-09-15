package com.horarioPonto.Trabalho.Model;

import java.math.*;
import java.time.*;
import javax.persistence.*;
import lombok.*;

@Data
@Builder
@Entity
public class Usuario {

    @Id
    private Long id;

    @ManyToOne
    private CategoriaUsuario categoriaUsuario;
    private String nome;

    @ManyToOne
    private Empresa empresa;

    @ManyToOne
    private NivelAcesso nivelAcesso;

    @ManyToOne
    private JornadaTrabalho jornadaTrabalho;
    private BigDecimal tolerancia;
    private LocalDateTime inicioJornada;
    private LocalDateTime fimJornada;
}
