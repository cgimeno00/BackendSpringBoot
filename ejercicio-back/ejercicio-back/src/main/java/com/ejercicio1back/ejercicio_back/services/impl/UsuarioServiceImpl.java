package com.ejercicio1back.ejercicio_back.services.impl;

import com.ejercicio1back.ejercicio_back.entities.Usuario;
import com.ejercicio1back.ejercicio_back.repositorios.UsuarioRepository;
import com.ejercicio1back.ejercicio_back.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;


    @Override
    public Usuario guardarUsuario(Usuario usuario) throws Exception{
        Usuario usuarioLocal=usuarioRepository.findByNombre(usuario.getNombre());
        if (usuarioLocal!=null){
            System.out.println("El usuario ya existe");
            throw new Exception("El usuario ya existe");

        }
        else{
            usuarioLocal=usuarioRepository.save(usuario);
        }
        return usuarioLocal;
    }

    @Override
    public Usuario obtenerUsuario(String nombre) {
        return usuarioRepository.findByNombre(nombre);
    }
}
