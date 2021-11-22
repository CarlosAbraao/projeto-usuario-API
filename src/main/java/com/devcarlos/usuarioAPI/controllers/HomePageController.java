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
		
		UsuarioEntity usuarioEntity = new UsuarioEntity();
		usuarioEntity.setNome("carlos");
		usuarioEntity.setIdade(10);
		
		userRepository.save(usuarioEntity);
		
		
		return "index";
	}

}
