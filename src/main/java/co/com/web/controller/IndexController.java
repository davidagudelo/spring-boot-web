package co.com.web.controller;

import co.com.web.app.model.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/web")
public class IndexController {

    @GetMapping(value = "/index")
    public  ModelAndView  index(ModelAndView model){
       model.addObject("titulo","Hola Mundo with model and view ");
       model.setViewName("index");
        return model;
    }

    @RequestMapping("/perfil")
    public String perfil(Model model){
        Usuario usuario = Usuario.builder().nombre("Juan").apellido("David").build();
        model.addAttribute("titulo","perfil de usuario: ".concat(usuario.getNombre() + usuario.getApellido()));
        model.addAttribute("usuario",usuario);
        return "perfil";

    }

    @RequestMapping("/listar")
    public String listar(Model model){
        Usuario usuario = Usuario.builder().nombre("Juan").apellido("Agudelo").email("").build();
        Usuario usuario2 = Usuario.builder().nombre("Andres").apellido("Herrera").email("").build();
        Usuario usuario3 = Usuario.builder().nombre("Yeison").apellido("Perez").email("").build();
        Usuario usuario4 = Usuario.builder().nombre("Monica").apellido("Correa").email("").build();
        List<Usuario> usuarios = Arrays.asList(usuario,usuario2,usuario3,usuario4);
        model.addAttribute("titulo","Listado de usuarios  ");
        model.addAttribute("usuarios",usuarios);

       System.out.println( usuarios.toString());
        return "listar";

    }





}
