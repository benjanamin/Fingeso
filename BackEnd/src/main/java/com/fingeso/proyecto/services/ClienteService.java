package com.fingeso.proyecto.services;

import com.fingeso.proyecto.models.Cliente;
import com.fingeso.proyecto.repositories.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/cliente")
public class ClienteService {
    @Autowired
    private ClientRepo clientRepo;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Cliente> getAll(){
        System.out.println("get all");
        return this.clientRepo.findAll();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void create(@RequestBody Cliente cliente){
        clientRepo.save(cliente);
    }
}
