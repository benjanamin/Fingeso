package com.fingeso.proyecto.models;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;

public class Fila {
    @Id
    private int id;
    private ArrayList<Client> listaClients;

    public Fila(){

    }

    public Fila(int id, ArrayList<Client> listaClients) {
        this.id = id;
        this.listaClients = listaClients;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Client> getListaClientes() {
        return listaClients;
    }

    public void setListaClientes(ArrayList<Client> listaClients) {
        this.listaClients = listaClients;
    }

    public void ordenarFila(){

    }

    public void eliminarNumero(int numero){
        if(numero > this.listaClients.size() || this.listaClients.size() == 0){
            return;
        }
        else{
            this.listaClients.remove(numero - 1);
        }
    }

    public void insertar(Client client, int posicion){
        if(this.listaClients.contains(client)){
            this.listaClients.remove(client);
        }
        this.listaClients.add(posicion - 1, client);
    }

    public void agregar(Client client){
        this.listaClients.add(client);
    }
}
