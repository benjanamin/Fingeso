package com.fingeso.proyecto.models;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;

public class Fila {
    @Id
    private String id;
    private ArrayList<Client> clientsList;

    public Fila(){
        clientsList = new ArrayList<Client>();
    }

    public Fila(String id, ArrayList<Client> clientsList) {
        this.id = id;
        this.clientsList = clientsList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Client> getClientsList() {
        return clientsList;
    }

    public void setClientsList(ArrayList<Client> clientsList) {
        this.clientsList = clientsList;
    }

    public void orderFila(){

    }

    public void deleteNumber(int number){
        if(number > this.clientsList.size() || this.clientsList.size() == 0){
            return;
        }
        else{
            this.clientsList.remove(number - 1);
        }
    }

    public void insert(Client client, int position){
        if(this.clientsList.contains(client)){
            this.clientsList.remove(client);
        }
        this.clientsList.add(position - 1, client);
    }

    public void add(Client client){
        this.clientsList.add(client);
    }
}
