package com.devcarlos.usuarioAPI.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {


    public String listarUsuarios(){
        return "usuarios_listar";
    }
}
