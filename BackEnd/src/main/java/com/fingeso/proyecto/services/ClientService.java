package com.fingeso.proyecto.services;

import com.fingeso.proyecto.models.Client;
import com.fingeso.proyecto.repositories.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/client")
public class ClientService {
    @Autowired
    private ClientRepo clientRepo;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Client> getAll(){
        System.out.println("get all");
        return this.clientRepo.findAll();
    }

    @RequestMapping(value = "/getByPhone", method = RequestMethod.GET)
    @ResponseBody
    public Client getByPhone(String phone){
        System.out.println("get all");
        return this.clientRepo.findClientByPhone(phone);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void create(@RequestBody Client client){
        clientRepo.save(client);
    }

}
