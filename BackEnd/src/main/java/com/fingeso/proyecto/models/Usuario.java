package com.fingeso.proyecto.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("usuario")
public class Usuario {
    @Id
    private int id;
    private String nombre;
    private String rut;
    private String telefono;
    private int edad;

    public Usuario(){

    }

    public Usuario(int id, String nombre, String rut, String telefono, int edad){
        this.id = id;
        this.nombre = nombre;
        this.rut = rut;
        this.telefono = telefono;
        this.edad = edad;
    }
    public Usuario(String nombre, String rut, String telefono, int edad){
        this.nombre = nombre;
        this.rut = rut;
        this.telefono = telefono;
        this.edad = edad;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
