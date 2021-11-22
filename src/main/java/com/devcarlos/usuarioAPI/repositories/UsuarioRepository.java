package com.devcarlos.usuarioAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcarlos.usuarioAPI.models.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

}
