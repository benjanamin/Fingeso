package com.fingeso.proyecto.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("admin")
public class Admin extends User {
    private Local local;
    private String password;
    public Admin(){

    }
    public Admin(int id, String name, String rut, String phone, int age, Local local, String password){
        super(id, name, rut, phone, age);
        this.local = local;
        this.password = password;
    }
    public Admin(String name, String rut, String phone, int age, Local local, String password){
        super(name, rut, phone, age);
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
