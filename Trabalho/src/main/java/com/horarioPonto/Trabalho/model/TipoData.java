package com.horarioPonto.Trabalho.Model;

import lombok.*;
import javax.persistence.*;

@Data
@Builder
@Entity
public class TipoData {

    @Id
    private Long id;
    private String descricao;    
}
