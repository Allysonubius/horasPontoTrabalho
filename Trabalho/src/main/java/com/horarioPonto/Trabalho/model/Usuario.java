package Live.model;

import java.time.*;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

import com.ibm.icu.math.*;
import lombok.*;

@Data
@Builder
public class Usuario {
    
    private Long id;

    @ManyToOne
    private CategoriaUsuario categoriaUsuario;
    private String nome;

    @ManyToOne
    private Empresa empresa;

    @ManyToOne
    private NivelAcesso nivelAcesso;

    @ManyToOne
    private JornadaTrabalho jornadaTrabalho;
    private BigDecimal tolerancia;    
    private LocalDateTime inicioJornada;
    private LocalDateTime fimJornada;
}
