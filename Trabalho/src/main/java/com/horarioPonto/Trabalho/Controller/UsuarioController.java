package com.horarioPonto.Trabalho.Controller;

import java.util.List;
import java.util.NoSuchElementException;
import com.horarioPonto.Trabalho.Service.UsuarioService;
import com.horarioPonto.Trabalho.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/usuario")
@Api(value = "API REST Usuario")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @PostMapping(value = "/update")
    @ApiOperation(value = "API REST Realiza a inserção e atualização de Usuarios")
    public ResponseEntity<List<Usuario>> createUsuario(@RequestBody List<Usuario> usuarios){
        List<Usuario> createUsuarios = this.usuarioService.updateUsuario(usuarios);
        return ResponseEntity.ok().body(createUsuarios);
    }

    @GetMapping(value = "/list")
    @ApiOperation(value = "API REST Consulta de todos usuarios")
    public ResponseEntity<List<Usuario>> getUsuarioList(){
        List<Usuario> getUsuarios = this.usuarioService.findAll();
        return ResponseEntity.ok().body(getUsuarios);
    }
    
    @GetMapping(value = "/list/{idUsuario}")
    @ApiOperation(value = "API REST Consulta de usuarios por ID")
    public ResponseEntity<Usuario> getUsuarioId(@PathVariable("idUsuario") Long idUsuarios) throws Exception{
        return ResponseEntity.ok(this.usuarioService.getByIdUsuario(idUsuarios).orElseThrow(() ->
            new NoSuchElementException("Não encontrado"))
        );
    }

    @DeleteMapping(value = "/delete/{idUsuario}")
    @ApiOperation(value = "API REST Deleta uma Usuario por ID")
    public void deleteUsuarioId(@PathVariable("idUsuario") Long idUsuarioDelete) throws Exception{
        try{
            this.usuarioService.deleteUsuario(idUsuarioDelete);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
