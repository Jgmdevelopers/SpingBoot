package com.cursojava.curso1.controllers;

import com.cursojava.curso1.model.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    @RequestMapping(value = "usuario/{id}")
    public Usuario getusuario() {
        Usuario usuario = new Usuario();
        usuario.setId(23L);
        usuario.setNombre("gabriel");
        usuario.setApellido("Molina");
        usuario.setEmail("gabrielmolina@gmail.com");
        usuario.setTelefono("2901412447");

        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getusuarios() {
        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setId(123L);
        usuario.setNombre("jorge");
        usuario.setApellido("Lopez");
        usuario.setEmail("JorgeLopez@gmail.com");
        usuario.setTelefono("2901412446");


        Usuario usuario1 = new Usuario();
        usuario1.setId(23L);
        usuario1.setNombre("Rafael");
        usuario1.setApellido("Lokote");
        usuario1.setEmail("rafa@gmail.com");
        usuario1.setTelefono("2901452447");

        usuarios.add(usuario);
        usuarios.add(usuario1);

        return usuarios;
    }
}
