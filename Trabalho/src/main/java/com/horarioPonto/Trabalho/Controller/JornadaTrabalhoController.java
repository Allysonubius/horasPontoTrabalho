package com.horarioPonto.Trabalho.Controller;

import com.horarioPonto.Trabalho.Model.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jornada")
public class JornadaTrabalhoController {

    JornadaTrabalho JornadaTrabalhoService;

    @PostMapping
    public JornadaTrabalho createJornada() {
        return null;
    }
}
