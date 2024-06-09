package com.ejercicio1back.ejercicio_back.controllers;

import com.ejercicio1back.ejercicio_back.entities.Usuario;
import com.ejercicio1back.ejercicio_back.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/")
    public Usuario guardarUsuario(@RequestBody Usuario usuario) throws Exception{

    return usuarioService.guardarUsuario(usuario);
    }

    @GetMapping("/{nombre}")
    public Usuario  obtenerUsuario(@PathVariable("nombre") String nombre) throws Exception{

        return usuarioService.obtenerUsuario(nombre);
    }


}
