package com.fingeso.proyecto.models;

import org.springframework.data.annotation.Id;

public class Local {
    @Id
    private int id;
    private String nombre;
    private String direccion;
    private int maximoPersonas;
    private Fila fila;
    private CodigoQR codigo;
    private boolean abierto;

    public Local(){

    }
    public Local(int id, String nombre, String direccion, int maximoPersonas, Fila fila, CodigoQR codigo) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.maximoPersonas = maximoPersonas;
        this.fila = fila;
        this.codigo = codigo;
        this.abierto = false;
    }

    public Local(String nombre, String direccion, int maximoPersonas, Fila fila, CodigoQR codigo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.maximoPersonas = maximoPersonas;
        this.fila = fila;
        this.codigo = codigo;
        this.abierto = false;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getMaximoPersonas() {
        return maximoPersonas;
    }

    public void setMaximoPersonas(int maximoPersonas) {
        this.maximoPersonas = maximoPersonas;
    }

    public Fila getFila() {
        return fila;
    }

    public void setFila(Fila fila) {
        this.fila = fila;
    }

    public CodigoQR getCodigo() {
        return codigo;
    }

    public void setCodigo(CodigoQR codigo) {
        this.codigo = codigo;
    }

    public boolean isAbierto() {
        return abierto;
    }

    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }

    public void abrirFila(){
        this.abierto = true;
    }

    public void cerrarFila(){
        this.abierto = false;
    }

    public void enviarMensaje(String numero){
        
    }
}
