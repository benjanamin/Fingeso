package com.fingeso.proyecto.services;


import com.fingeso.proyecto.models.Client;
import com.fingeso.proyecto.models.Local;
import com.fingeso.proyecto.repositories.ClientRepo;
import com.fingeso.proyecto.repositories.LocalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/local")
public class LocalService {
    @Autowired
    private LocalRepo localRepo;

    @Autowired
    private ClientRepo clientRepo;
    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Local> getAll(){
        System.out.println("get all");
        return this.localRepo.findAll();
    }
    @RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Local getById(@PathVariable(value = "id") int id){
        System.out.println("get localbyid");
        System.out.println(id);
        return localRepo.findByIdEquals(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void create(@RequestBody Local local){
        localRepo.save(local);
        local.generarCodigoQR("localhost:8080");
    }


    @RequestMapping(value = "/addClient/{idLocal}/{phone}", method = RequestMethod.POST)
    @ResponseBody
    public void addClientToFila(@PathVariable(value = "idLocal") int id,@PathVariable(value = "phone") String phone){
        Client client = clientRepo.findClientByPhone(phone);
        Local local = localRepo.findByIdEquals(id);
        local.addClient(client);
        localRepo.save(local);
    }



}
