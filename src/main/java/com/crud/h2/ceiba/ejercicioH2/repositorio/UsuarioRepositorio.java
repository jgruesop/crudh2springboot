package com.crud.h2.ceiba.ejercicioH2.repositorio;

import com.crud.h2.ceiba.ejercicioH2.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

}
