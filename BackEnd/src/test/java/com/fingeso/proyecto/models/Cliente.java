package com.fingeso.proyecto.models;

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
