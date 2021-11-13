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
@Table(name = "TELEFONE")
public class Telefone {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idTelefone;

    @Size(min = 50 , max = 250)
    private String celular;
    
    @Size(min = 50 , max = 250)
    private String telefone;
}
