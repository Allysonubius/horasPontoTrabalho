package com.horarioPonto.Trabalho.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import com.horarioPonto.Trabalho.Repository.UsuarioRepository;
import com.horarioPonto.Trabalho.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    
    @Autowired
    UsuarioRepository usuarioRepository;

    //Metodo POST
    @Transactional(rollbackOn = Exception.class)
    public List<Usuario> updateUsuario(List<Usuario> usuarioPost){
        return this.usuarioRepository.saveAll(usuarioPost);
    }

    //Metodo GET
    @Transactional(rollbackOn = Exception.class)
    public List<Usuario> findAll(){
        return usuarioRepository.findAll();
    }

    //Metodo GET por ID
    @Transactional(rollbackOn = Exception.class)
    public Optional<Usuario> getByIdUsuario (Long usuarioId){
        return usuarioRepository.findById(usuarioId);
    }

    //Metodo DELETE por ID
    @Transactional(rollbackOn = Exception.class)
    public Long deleteUsuario (Long usuarioDeleteID){
        this.usuarioRepository.deleteById(usuarioDeleteID);
        return usuarioDeleteID;
    }

}
