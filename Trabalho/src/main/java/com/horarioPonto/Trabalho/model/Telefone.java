package com.horarioPonto.Trabalho.Model;

import lombok.*;
import javax.persistence.*;

@Builder
@Data
@Entity
public class Telefone {

    @Id
    private Long idTelefone;
    private String celular;
    private String telefone;
}
