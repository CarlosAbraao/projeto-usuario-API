package com.devcarlos.usuarioAPI.repositories;

import com.devcarlos.usuarioAPI.models.AcessoEntity;
import com.devcarlos.usuarioAPI.models.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AcessoRepository extends JpaRepository<AcessoEntity, Long> {
	


}
