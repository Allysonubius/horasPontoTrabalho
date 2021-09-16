package com.horarioPonto.Trabalho.Model;

import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class TipoData {

    @Id
    private Long id;
    private String descricao;    
}
