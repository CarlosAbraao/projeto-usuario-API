package com.devcarlos.usuarioAPI.controllers;


import com.devcarlos.usuarioAPI.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


import com.devcarlos.usuarioAPI.models.UsuarioEntity;



@Controller
public class HomePageController {
	
    @Autowired
	UserRepository userRepository;

	@GetMapping("/")
	public String HomePage() {
		// INSERE UM USUARIO NO BANCO SEMPRE QUE O USUARIO CARREGAR A PÁGINA (OU SEJA FAZER UM GET DE ALGO)
		// SE FOR CRIAR VARIOS USUARIOS É MELHOR CRIAR UMA LISTA DE USUARIOS
		// TODA VEZ QUE O USUARIO FAZ O GET DA PÁGINA A INFORMAÇÃO É REPETIDA NO BANCO

		UsuarioEntity usuarioEntity = new UsuarioEntity();
		usuarioEntity.setNome("carlos");
		usuarioEntity.setIdade(10);
		
		userRepository.save(usuarioEntity);
		
		
		return "index";
	}

}
