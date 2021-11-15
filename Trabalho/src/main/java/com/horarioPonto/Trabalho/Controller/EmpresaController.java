package com.horarioPonto.Trabalho.Controller;

import java.util.List;
import java.util.NoSuchElementException;

import com.horarioPonto.Trabalho.Service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.horarioPonto.Trabalho.model.Empresa;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/empresa")
@Api(value = "API REST Empresa")
public class EmpresaController {

    @Autowired
    EmpresaService empresaService;

    @PostMapping(value = "/update")
    @ApiOperation(value = "API REST Realiza a inserção e atualização de Empresa")
    public  ResponseEntity<List<Empresa>> createEmpresa(@RequestBody List<Empresa> empresa) {
        List<Empresa> createEmpresa1 = this.empresaService.updateEmpresa(empresa);
        return ResponseEntity.ok().body(createEmpresa1);
    }

    @GetMapping(value = "/list")
    @ApiOperation(value = "API REST Consulta todas as Empresas")
    public ResponseEntity<List<Empresa>> getEmpresaList(){
        List<Empresa> getEmpresa1 = this.empresaService.findAll();
        return ResponseEntity.ok().body(getEmpresa1);
    }

    @GetMapping(value="/list/{idEmpresa}")
    @ApiOperation(value = "API REST Consulta Empresa por ID")
    public ResponseEntity<Empresa> getByIdEmpresa(@PathVariable("idEmpresa") Long empresaId) throws Exception{
        return ResponseEntity.ok(this.empresaService.getByIdEmpresa(empresaId).orElseThrow(() ->
            new NoSuchElementException("NÂO ENCONTRADO " + empresaId))
        );
    }

    @DeleteMapping(value = "/delete/{idEmpresa}")
    @ApiOperation(value = "API REST Delete uma empresa por Id")
    public void deleteEmpresaById (@PathVariable("idEmpresa") Long idEmpresaDelete) throws Exception{
        try{
            this.empresaService.deleteEmpresa(idEmpresaDelete);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
