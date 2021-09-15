package com.horarioPonto.Trabalho.Model;

import java.time.*;
import lombok.*;
import javax.persistence.*;

@Data
@Builder
@Entity
public class Calendario {

    @Id
    private Long id;
    private TipoData tipoData;
    private String descricao;
    private LocalDateTime dataEspecial;
}
