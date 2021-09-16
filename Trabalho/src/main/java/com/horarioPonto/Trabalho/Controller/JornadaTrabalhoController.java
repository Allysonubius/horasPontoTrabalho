package com.horarioPonto.Trabalho.Controller;

import com.horarioPonto.Trabalho.Model.*;
import com.horarioPonto.Trabalho.Service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping(value = "/jornada")
public class JornadaTrabalhoController {

    @Autowired
    JornadaTrabalhoService jornadaTrabalhoService;

    @PostMapping
    public JornadaTrabalho createJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalhoService.saveJornada(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> getJornadaList(){
        return  jornadaTrabalhoService.findAll();
    }

    @GetMapping(value ="/{idJornada}")
    public ResponseEntity<JornadaTrabalho> getJornadaById(@PathVariable("idJornada") long idJornada) throws Exception {
        return ResponseEntity.ok(jornadaTrabalhoService.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Not found - ERROR 404")));
    }

    @PutMapping
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalhoService.updateJornada(jornadaTrabalho);
    }

    @DeleteMapping(value ="/{idJornada}")
    public ResponseEntity<JornadaTrabalho> deleteJornadaById(@PathVariable("idJornada") long idJornada) throws Exception {
        jornadaTrabalhoService.deleteJornada(idJornada);
        return (ResponseEntity<JornadaTrabalho>) ResponseEntity.ok();
    }

}
