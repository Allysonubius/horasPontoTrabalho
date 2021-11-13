package com.horarioPonto.Trabalho.model;

import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@Entity
@Table(name = "NIVEL_ACESSO")
public class NivelAcesso {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    
    @Size(min = 50 , max = 250)
    private String descricao;
}
