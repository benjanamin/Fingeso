package com.fingeso.proyecto.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("cliente")
public class Cliente extends Usuario{
    public Cliente() {
    }

    public Cliente(int id, String nombre, String rut, String telefono, int edad) {
        super(id, nombre, rut, telefono, edad);
    }

    public Cliente(String nombre, String rut, String telefono, int edad) {
        super(nombre, rut, telefono, edad);
    }
}
