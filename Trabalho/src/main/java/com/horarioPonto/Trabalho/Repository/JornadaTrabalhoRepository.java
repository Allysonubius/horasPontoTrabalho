package com.horarioPonto.Trabalho.Repository;

import com.horarioPonto.Trabalho.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface JornadaTrabalhoRepository extends JpaRepository<JornadaTrabalho, Long> {

}
