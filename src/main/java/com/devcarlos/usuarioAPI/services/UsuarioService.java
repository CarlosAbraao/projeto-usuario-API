package com.devcarlos.usuarioAPI.services;

import com.devcarlos.usuarioAPI.models.UsuarioEntity;
import com.devcarlos.usuarioAPI.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    UserRepository userRepository;
// RETONANDO Os SERVIÇOs DO USUARIOS
    public List<UsuarioEntity> findAll(){
        return userRepository.findAll();
    }

    public Boolean save(UsuarioEntity usuarioEntity) {
        UsuarioEntity usuarioEncontrado = findUsuarioByEmail(usuarioEntity.getEmail());
        if(usuarioEncontrado == null){
            userRepository.save(usuarioEntity);
            return true;
        }
return false;

    }

    public UsuarioEntity findUsuarioEntityById(Long id) {
       return userRepository.findUsuarioEntityById(id);
    }

    public void delete(UsuarioEntity usuarioEntity) {
        userRepository.delete(usuarioEntity);
    }

    public UsuarioEntity findUsuarioByEmail(String email){

        UsuarioEntity usuarioEntity = userRepository.findByEmail(email);
        return usuarioEntity;

    }
}
