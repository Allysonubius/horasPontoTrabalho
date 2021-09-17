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

    @Autowired
    public JornadaTrabalhoService(JornadaTrabalhoRepository jornadaTrabalhoRepository){
    }

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    @Transactional(rollbackOn = Exception.class)
    public List<JornadaTrabalho> findAll(){
        return jornadaTrabalhoRepository.findAll();
    }

    @Transactional(rollbackOn = Exception.class)
    public Optional<JornadaTrabalho> getById(long idJornada) {
        return jornadaTrabalhoRepository.findById(idJornada);
    }

    @Transactional(rollbackOn = Exception.class)
    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    @Transactional(rollbackOn = Exception.class)
    public void deleteJornada(long idJornada) {
        jornadaTrabalhoRepository.deleteById(idJornada);
    }

}
