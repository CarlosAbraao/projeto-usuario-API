package com.devcarlos.usuarioAPI.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    // NESSE EXEMPLO ESTOU USANDO O TIPO "STRING" PARA RETORNAR A PAGINA.
   @GetMapping("/")
    public String listarUsuarios(){
        return "usuarios_listar";
    }

    @PutMapping("/add")
    public String adicionarUsuarios(){
        return "usuarios_add";
    }
}
