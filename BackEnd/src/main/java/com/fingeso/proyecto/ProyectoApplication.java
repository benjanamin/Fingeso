package com.fingeso.proyecto;

import com.fingeso.proyecto.models.Message;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoApplication {

    public static void main(String[] args) {
        Message message = new Message("We know who you are, i know everything about you","56994366508");
        message.sendMessage();
        SpringApplication.run(ProyectoApplication.class, args);

    }

}
