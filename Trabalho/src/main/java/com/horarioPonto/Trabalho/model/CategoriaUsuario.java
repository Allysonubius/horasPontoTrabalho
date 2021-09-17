package com.horarioPonto.Trabalho.model;

import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Table(name = "CATEGORIA_USUARIO")
public class CategoriaUsuario {

    @Id
    private long id;
    private String descricao;
}
