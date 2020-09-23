package com.fingeso.proyecto.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("local")
public class Local {
    @Id
    private int id;
    private String name;
    private String adress;
    private int maximoPersonas;
    private Fila fila;
    private CodigoQR code;
    private boolean open;

    public Local(){
        this.maximoPersonas = 5;
        this.open = false;
        this.fila = new Fila();
    }
    public Local(int id, String name, String adress, int maximoPersonas, Fila fila, CodigoQR code) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.maximoPersonas = maximoPersonas;
        this.fila = fila;
        this.code = code;
        this.open = false;
    }

    public Local(String name, String adress, int maximoPersonas, Fila fila, CodigoQR code) {
        this.name = name;
        this.adress = adress;
        this.maximoPersonas = maximoPersonas;
        this.fila = fila;
        this.code = code;
        this.open = false;
    }

    public Local(String name, String adress){
        this.name = name;
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
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

    public CodigoQR getCode() {
        return code;
    }

    public void setCode(CodigoQR code) {
        this.code = code;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public void abrirFila(){
        this.open = true;
    }

    public void cerrarFila(){
        this.open = false;
    }

    public void enviarMensaje(String numero){
        
    }

    public void addClient(Client client){
        this.fila.add(client);
    }
}
