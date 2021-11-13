package com.horarioPonto.Trabalho.model;

import java.time.*;
import lombok.*;
import javax.persistence.*;
import javax.validation.constraints.Size;

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

    @Size(min = 50 , max = 250)
    private String descricao;

    private LocalDateTime dataEspecial;
}
