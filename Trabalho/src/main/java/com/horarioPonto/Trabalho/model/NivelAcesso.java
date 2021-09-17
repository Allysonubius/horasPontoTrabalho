package com.horarioPonto.Trabalho.model;

import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Table(name = "NIVEL_ACESSO")
public class NivelAcesso {

    @Id
    private String id;
    private String descricao;
}
