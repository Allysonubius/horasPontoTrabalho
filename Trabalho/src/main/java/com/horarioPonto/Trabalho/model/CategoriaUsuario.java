package com.horarioPonto.Trabalho.Model;

import lombok.*;
import javax.persistence.*;

@Data
@Builder
@Entity
public class CategoriaUsuario {

    @Id
    private long id;
    private String descricao;
}
