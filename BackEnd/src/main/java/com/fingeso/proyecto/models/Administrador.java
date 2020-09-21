package com.fingeso.proyecto.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("administrador")
public class Administrador extends Usuario{
    private Local local;
    private String password;
    public Administrador(){

    }
    public Administrador(int id, String nombre, String rut, String telefono, int edad,Local local, String password){
        super(id, nombre, rut, telefono, edad);
        this.local = local;
        this.password = password;
    }
    public Administrador( String nombre, String rut, String telefono, int edad,Local local, String password){
        super(nombre, rut, telefono, edad);
        this.local = local;
        this.password = password;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
