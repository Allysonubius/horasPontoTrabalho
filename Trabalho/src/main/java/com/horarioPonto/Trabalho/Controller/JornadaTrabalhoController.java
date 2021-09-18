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
        List<JornadaTrabalho> createJornadaTrabalhos = this.jornadaTrabalhoService.updateJornada(jornadaTrabalho);
        return ResponseEntity.ok().body(createJornadaTrabalhos);
    }

    @GetMapping(value = "/list")
    @ApiOperation(value = "API REST Consulta todas as Jornada de Trabalho")
    public ResponseEntity<List<JornadaTrabalho>> getJornadaList(){
        List<JornadaTrabalho> getJornadaTrabalho = this.jornadaTrabalhoService.findAll();
        return  ResponseEntity.ok().body(getJornadaTrabalho);
    }

    @GetMapping(value ="/list/{idJornada}")
    @ApiOperation(value = "API REST Consulta Jornada de trabalho por Id")
    public ResponseEntity<JornadaTrabalho> getJornadaById(@PathVariable("idJornada") Long idJornada) throws Exception {
        return ResponseEntity.ok(this.jornadaTrabalhoService.getById(idJornada).orElseThrow(() -> 
            new NoSuchElementException("Não encontrado" ))
        );
    }

    @DeleteMapping(value ="/delete/{idJornada}")
    @ApiOperation(value = "API REST Deleta uma Jornada de Trabalho por Id")
    public void deleteJornadaById(@PathVariable("idJornada") Long idJornada) throws Exception {
        try {
            this.jornadaTrabalhoService.deleteJornada(idJornada);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        ResponseEntity.ok();
    }

}
