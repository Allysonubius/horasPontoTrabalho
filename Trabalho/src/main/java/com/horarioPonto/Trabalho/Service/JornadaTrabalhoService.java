package com.horarioPonto.Trabalho.Service;

import com.horarioPonto.Trabalho.Model.*;
import com.horarioPonto.Trabalho.Repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import java.util.*;

@Service
public class JornadaTrabalhoService {

    @Autowired
    JornadaTrabalhoRepository jornadaTrabalhoRepository;

    @Autowired
    public JornadaTrabalhoService(JornadaTrabalhoRepository jornadaTrabalhoRepository){
    }

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> findAll(){
        return jornadaTrabalhoRepository.findAll();
    }

    public Optional<JornadaTrabalho> getById(long idJornada) {
        return jornadaTrabalhoRepository.findById(idJornada);
    }

    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public void deleteJornada(long idJornada) {
        jornadaTrabalhoRepository.deleteById(idJornada);
    }

}
