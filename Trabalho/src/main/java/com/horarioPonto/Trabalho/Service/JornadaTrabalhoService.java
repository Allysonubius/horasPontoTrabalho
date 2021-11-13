package com.horarioPonto.Trabalho.Service;

import com.horarioPonto.Trabalho.Repository.*;
import com.horarioPonto.Trabalho.model.JornadaTrabalho;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import java.util.*;
import javax.transaction.Transactional;

@Service
public class JornadaTrabalhoService {

    @Autowired
    JornadaTrabalhoRepository jornadaTrabalhoRepository;
    
    // METODO POST
    @Transactional(rollbackOn = Exception.class)
    public List<JornadaTrabalho> updateJornada(List<JornadaTrabalho> jornadaTrabalhoPost) {
        return this.jornadaTrabalhoRepository.saveAll(jornadaTrabalhoPost);
    }

    // METODO GET
    @Transactional(rollbackOn = Exception.class)
    public List<JornadaTrabalho> findAll(){
        return jornadaTrabalhoRepository.findAll();
    }
    
    // METODO GET por ID
    @Transactional(rollbackOn = Exception.class)
    public Optional<JornadaTrabalho> getById(long idJornada) {
        return jornadaTrabalhoRepository.findById(idJornada);
    }

    // METODO DELETE por ID
    @Transactional(rollbackOn = Exception.class)
    public void deleteJornada(Long jornadaTrabalhoDelete) {
        jornadaTrabalhoRepository.deleteById(jornadaTrabalhoDelete);
    }
}
