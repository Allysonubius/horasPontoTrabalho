package com.horarioPonto.Trabalho.Repository;

import com.horarioPonto.Trabalho.Model.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.jpa.repository.config.*;
import org.springframework.stereotype.*;

@Repository
public interface JornadaTrabalhoRepository extends JpaRepository<JornadaTrabalho, Long> {

}
