package com.fingeso.proyecto.models;

import net.glxn.qrgen.QRCode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import sun.security.util.Cache;

@Document("local")
public class Local {
    @Id
    private String id;
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
    public Local(String id, String name, String adress, int maximoPersonas, Fila fila, CodigoQR code) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.maximoPersonas = maximoPersonas;
        this.fila = new Fila();
        this.code = code;
        this.open = false;
    }

    public Local(String name, String adress, int maximoPersonas, Fila fila, CodigoQR code) {
        this.name = name;
        this.adress = adress;
        this.maximoPersonas = maximoPersonas;
        this.fila = new Fila();
        this.code = code;
        this.open = false;
    }

    public Local(String name, String adress){
        this.name = name;
        this.adress = adress;
        this.fila = new Fila();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public void enviarMensaje(String text,String numero){
        Message message = new Message(text,numero);
        message.sendMessage();
    }

    public void addClient(Client client){
        this.fila.add(client);
    }

    public void generarCodigoQR(String text){
        CodigoQR codigoQR = new CodigoQR();
        codigoQR.generarCodigo(text);
    }
}
