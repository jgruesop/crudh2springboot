package com.crud.h2.ceiba.ejercicioH2.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table //Indica que hace referencia a una tabla
@Data  //Crea los getter y setter
@AllArgsConstructor //Crea Constructor con todos los atributos
@NoArgsConstructor //Crea un constructor vacio
public class Usuario {
    @Id  //Indica que es la llave primaria de la tabla
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Especifica que esta llave será autoincremantable (Id)
    private Long id;
    @Column(nullable = false) //Permite asignar propiedades al atributo, indicando que no puede ser nulo
    private String nombre;
    @Column(nullable = false)
    private String apellido;
    @Column(length = 16) //Permite el tamaño de caracteres
    private String telefono;
    @Column(nullable = false)
    private String direccion;
}
