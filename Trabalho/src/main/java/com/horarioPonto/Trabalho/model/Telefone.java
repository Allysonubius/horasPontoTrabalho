package com.horarioPonto.Trabalho.model;

import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Table(name = "TELEFONE")
public class Telefone {

    @Id
    private Long idTelefone;
    private String celular;
    private String telefone;
}
