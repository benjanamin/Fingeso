package com.fingeso.proyecto.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("client")
public class Client extends User {
    public Client() {
    }

    public Client(int id, String name, String rut, String phone, int age) {
        super(id, name, rut, phone, age);
    }

    public Client(String name, String rut, String phone, int age) {
        super(name, rut, phone, age);
    }
}
