package com.ejercicio1back.ejercicio_back.repositorios;

import com.ejercicio1back.ejercicio_back.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    public Usuario findByNombre(String username);
}
