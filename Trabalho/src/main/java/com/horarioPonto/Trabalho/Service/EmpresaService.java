package com.horarioPonto.Trabalho.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.horarioPonto.Trabalho.Repository.EmpresaRespository;

import com.horarioPonto.Trabalho.model.Empresa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {

    @Autowired
    EmpresaRespository empresaRespository;

    // METODO POST
    @Transactional(rollbackOn = Exception.class)
    public List<Empresa> updateEmpresa(List<Empresa> empresaPost){
        return this.empresaRespository.saveAll(empresaPost);
    }

    // METODO GET
    @Transactional(rollbackOn = Exception.class)
    public List<Empresa> findAll(){
        return empresaRespository.findAll();
    }

    // METODO GET por ID
    @Transactional(rollbackOn = Exception.class)
    public Optional<Empresa> getByIdEmpresa(Long empresaId){
        return empresaRespository.findById(empresaId);
    }

    // METODO DELETE por ID
    @Transactional(rollbackOn = Exception.class)
    public void deleteEmpresa(Long empresaDelete){
        empresaRespository.deleteById(empresaDelete);
    }
}
