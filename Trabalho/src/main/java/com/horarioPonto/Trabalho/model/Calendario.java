package com.horarioPonto.Trabalho.model;

import java.time.*;
import lombok.*;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Builder
@Entity
@Table(name = "CALENDARIO")
public class Calendario {

    @Id
    @EqualsAndHashCode.Include
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "TIPO_DATA_ID")
    private TipoData tipoData;

    private String descricao;

    private LocalDateTime dataEspecial;
}
