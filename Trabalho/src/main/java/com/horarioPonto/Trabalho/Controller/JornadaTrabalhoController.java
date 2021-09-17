package com.horarioPonto.Trabalho.Controller;

import com.horarioPonto.Trabalho.Service.*;
import com.horarioPonto.Trabalho.model.JornadaTrabalho;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.*;

@RestController
@RequestMapping(value = "/jornada")
@Api(value = "API REST Jornada de trabalho")
public class JornadaTrabalhoController {

    @Autowired
    JornadaTrabalhoService jornadaTrabalhoService;

    @PostMapping(value = "/update")
    @ApiOperation(value = "API REST Realiza a inserção e atualização de Jornada de Trabalho")
    public ResponseEntity<List<JornadaTrabalho>> createJornada(@RequestBody List<JornadaTrabalho> jornadaTrabalho) {
        List<JornadaTrabalho> createJornadaTrabalhos = this.jornadaTrabalhoService.createJornada(jornadaTrabalho);
        return ResponseEntity.ok().body(createJornadaTrabalhos);
    }

    @GetMapping(value = "/list")
    @ApiOperation(value = "API REST Consulta todas as Jornada de Trabalho")
    public ResponseEntity<List<JornadaTrabalho>> getJornadaList(){
        List<JornadaTrabalho> getJornadaTrabalho = this.jornadaTrabalhoService.findAll();
        return  ResponseEntity.ok().body(getJornadaTrabalho);
    }

    @GetMapping(value ="/{idJornada}")
    public ResponseEntity<JornadaTrabalho> getJornadaById(@PathVariable("idJornada") Long idJornada) throws Exception {
        return ResponseEntity.ok(jornadaTrabalhoService.getById(idJornada).orElseThrow(() -> new NoSuchElementException("Not found - ERROR 404")));
    }

    @PutMapping(value = "/create" )
    public JornadaTrabalho updateJornada(@RequestBody JornadaTrabalho jornadaTrabalho) {
        return jornadaTrabalhoService.updateJornada(jornadaTrabalho);
    }

    @DeleteMapping(value ="/delete/{idJornada}")
    public void ResponseEntitydeleteJornadaById(@PathVariable("idJornada") Long idJornada) throws Exception {
        try {
            jornadaTrabalhoService.deleteJornada(idJornada);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        ResponseEntity.ok();
    }

}
