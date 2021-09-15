package com.horarioPonto.Trabalho.Model;

import lombok.*;
import javax.persistence.*;

@Data
@Builder
@Entity
public class NivelAcesso {

    @Id
    private String id;
    private String descricao;
}
