package com.horarioPonto.Trabalho.model;

import javax.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Localidade {

    @Id
    private Long id;
    
    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String descricao;
}
