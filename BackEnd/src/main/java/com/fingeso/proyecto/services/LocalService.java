package com.fingeso.proyecto.services;


import com.fingeso.proyecto.models.Local;
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
    }



}
