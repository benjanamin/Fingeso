package com.fingeso.proyecto.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.annotation.Generated;

@Document("usuario")
public class User {
    @Id
    private String id;
    private String name;
    private String rut;
    private String phone;
    private int age;

    public User(){

    }

    public User(String id, String name, String rut, String phone, int age){
        this.id = id;
        this.name = name;
        this.rut = rut;
        this.phone = phone;
        this.age = age;
    }
    public User(String name, String rut, String phone, int age){
        this.name = name;
        this.rut = rut;
        this.phone = phone;
        this.age = age;
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

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
