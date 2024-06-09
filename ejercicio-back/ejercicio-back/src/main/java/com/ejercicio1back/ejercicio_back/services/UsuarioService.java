package com.ejercicio1back.ejercicio_back.services;

import com.ejercicio1back.ejercicio_back.entities.Usuario;

public interface UsuarioService {

    public Usuario guardarUsuario(Usuario usuario) throws Exception;
    public Usuario obtenerUsuario(String username);
}
