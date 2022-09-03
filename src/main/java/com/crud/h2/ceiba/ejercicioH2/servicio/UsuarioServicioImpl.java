package com.crud.h2.ceiba.ejercicioH2.servicio;

import com.crud.h2.ceiba.ejercicioH2.modelo.Usuario;
import com.crud.h2.ceiba.ejercicioH2.repositorio.UsuarioRepositorio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UsuarioServicioImpl implements UsuarioServicio{

    private final UsuarioRepositorio usuarioRepositorio;


    @Override
    public ArrayList<Usuario> todos() {
        return (ArrayList<Usuario>) usuarioRepositorio.findAll();
    }

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepositorio.save(usuario);
    }

    @Override
    public Optional<Usuario> obtenerUsuario(long idUsuario) {
        return Optional.ofNullable(usuarioRepositorio.findById(idUsuario).orElseThrow(() -> {
            throw new RuntimeException();
        }));
    }

    @Override
    public boolean eliminarUsuario(Long id) {
        try {
            Optional<Usuario> usuario = obtenerUsuario(id);
            usuarioRepositorio.delete(usuario.get());
            return true;
        } catch (Exception e){
            e.getMessage();
            return false;
        }

    }
}
