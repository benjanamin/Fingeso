package com.fingeso.proyecto.models;

import org.springframework.data.annotation.Id;

public class Mensaje {
    @Id
    private int id;
    private String texto;
    private String numeroDestinatario;
    private String numeroSalida;

    public Mensaje(int id, String texto, String numeroDestinatario, String numeroSalida) {
        this.id = id;
        this.texto = texto;
        this.numeroDestinatario = numeroDestinatario;
        this.numeroSalida = numeroSalida;
    }


}
