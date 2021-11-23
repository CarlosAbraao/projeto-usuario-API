package com.devcarlos.usuarioAPI.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devcarlos.usuarioAPI.models.UsuarioEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UsuarioEntity, Long> {
	


}
