package com.horarioPonto.Trabalho.Model;

import lombok.*;
import javax.persistence.*;

@Data
@Builder
@Entity
public class JornadaTrabalho {

    @Id
    private long id;
    private String descricao;
}