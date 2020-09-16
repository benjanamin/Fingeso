package com.fingeso.proyecto.models;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;

public class Fila {
    @Id
    private int id;
    private ArrayList<Cliente> listaClientes;

    public Fila(){

    }

    public Fila(int id, ArrayList<Cliente> listaClientes) {
        this.id = id;
        this.listaClientes = listaClientes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public void ordenarFila(){

    }

    public void eliminarNumero(int numero){
        if(numero > this.listaClientes.size() || this.listaClientes.size() == 0){
            return;
        }
        else{
            this.listaClientes.remove(numero - 1);
        }
    }

    public void insertar(Cliente cliente,int posicion){
        if(this.listaClientes.contains(cliente)){
            this.listaClientes.remove(cliente);
        }
        this.listaClientes.add(posicion - 1, cliente);
    }

    public void agregar(Cliente cliente){
        this.listaClientes.add(cliente);
    }
}
