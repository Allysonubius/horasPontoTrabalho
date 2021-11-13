package com.horarioPonto.Trabalho.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@Entity
@Table(name = "LOCALIDADE")
public class Localidade {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "NIVEL_ACESSO_ID")
    private NivelAcesso nivelAcesso;

    @Size(min = 50 , max = 250)
    private String descricao;
}
