package com.devcarlos.usuarioAPI.controllers;

import com.devcarlos.usuarioAPI.models.UsuarioEntity;
import com.devcarlos.usuarioAPI.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

        //VOU CHAMAR O REPOSITÓRIO DO USUARIO PARA CHAMAR DADOS DO BANCO
    @Autowired
    UserRepository userRepository;


    // USANDO "MODELanDView PARA RETORNA PAGINA

   @GetMapping("/")
    public ModelAndView listarUsuario(){

       ModelAndView modelAndView = new ModelAndView("usuarios_listar");

       //PERMITI INSERIR UM OBJETO NO HTML ATRAVÉS DO THYMELEAF
       modelAndView.addObject("titulo"," Usuários");

       // CRIEI UMA LISTA PARA RECEBER OS USUARIOS DO BANCO
       List<UsuarioEntity> usuarioEntityList = userRepository.findAll();

       //CRIEI MAIS UM OBJETO DO DO TIPO LISTA PARA ADICNAR ATRAVES OD THYMELEAF
       modelAndView.addObject("listadeusuarios", usuarioEntityList);

       return modelAndView;

   }



   // ATRAVES DO GET EU PEGO E MOSTRO AS INFORMAÇÕES DA PAGINA "USUARIOS ADD
    @GetMapping("/add")
    public String mostrarPgAddUsuario(UsuarioEntity usuarioEntity){

       return "usuarios_add.html";
    }


 // ATRAVES DO POST EU VOU ENVIAR AS INFORMAÇÕES VINDAS DOS FORMS NA PAGINA ADD_USUARIO
    @PostMapping("/add")
    public String AddUsuario(UsuarioEntity usuarioEntity){

       userRepository.save(usuarioEntity);

       return "redirect:/usuarios/";
    }


    // DELETANDO O USUARIO ATRAVEZ DO ID
  @GetMapping("/deletar/{id}")
    public String deletarUsuario(@PathVariable(value = "id") Long id){

        UsuarioEntity usuarioEntity = userRepository.findUsuarioEntityById(id);


        userRepository.delete(usuarioEntity);

       return "redirect:/usuarios/";
    }
}







