package com.crud.h2.ceiba.ejercicioH2.controlador;

import com.crud.h2.ceiba.ejercicioH2.modelo.Usuario;
import com.crud.h2.ceiba.ejercicioH2.servicio.UsuarioServicio;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/usuarios") //Ruta para las pruebas y accede al controlador
@RequiredArgsConstructor  //Es la misma manera de @AllArgsContructor
public class UsuarioControlador {

    private final UsuarioServicio usuarioServicio;

    @GetMapping("/listar")
    public ArrayList<Usuario> listarUsuarios(){
        return usuarioServicio.todos();
    }

    @PostMapping("/save")  // Para crear
    public Usuario guardarUsuario(@RequestBody Usuario usuario){
        return usuarioServicio.guardarUsuario(usuario);
       // return new ResponseEntity(usuarioServicio.guardarUsuario(usuario), HttpStatus.CREATED);
    }

    @GetMapping("/{id}") // Para obtener recursos
    public ResponseEntity obtenerUsuario(@PathVariable("id") Long idUsuario){
        return new ResponseEntity(usuarioServicio.obtenerUsuario(idUsuario), HttpStatus.OK);
    }

    @DeleteMapping("/{id}") // Para eliminar el recurso
    public String eliminarUsuario(@PathVariable("id") long idUsuario) {
        if (usuarioServicio.eliminarUsuario(idUsuario)) {
            //return new ResponseEntity(HttpStatus.OK);
            return "El usuario fue eliminado exitosamente";
        } else {
            //return new ResponseEntity(HttpStatus.NOT_FOUND);
            return "Error al eliminar el usuario";
        }
    }
}
