package com.crud.h2.ceiba.ejercicioH2.servicio;

import com.crud.h2.ceiba.ejercicioH2.modelo.Usuario;

import java.util.ArrayList;
import java.util.Optional;

public interface UsuarioServicio {

    ArrayList<Usuario> todos();
    Usuario guardarUsuario(Usuario usuario);
    Optional<Usuario> obtenerUsuario(long idUsuario);
    boolean eliminarUsuario(Long id);
}
