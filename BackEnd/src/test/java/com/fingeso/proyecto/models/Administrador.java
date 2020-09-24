package com.fingeso.proyecto.models;

public class Administrador extends User {
    private Local local;
    public Administrador(){

    }
    public Administrador(String id, String nombre, String rut, String telefono, int edad,Local local){
        super(id, nombre, rut, telefono, edad);
        this.local = local;
    }
    public Administrador( String nombre, String rut, String telefono, int edad,Local local){
        super(nombre, rut, telefono, edad);
        this.local = local;
    }


}
