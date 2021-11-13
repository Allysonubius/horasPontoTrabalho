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
@Table(name = "CATEGORIA_USUARIO")
public class CategoriaUsuario {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 50 , max = 250)
    private String descricao;
}
