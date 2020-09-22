package com.fingeso.proyecto.services;

import com.fingeso.proyecto.models.Admin;
import com.fingeso.proyecto.repositories.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(value = "/admin")
public class AdminService {
    @Autowired
    private AdminRepo adminRepo;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Admin> getAll(){
        return this.adminRepo.findAll();
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void create(@RequestBody Admin admin){
        adminRepo.save(admin);
        System.out.println("yata");
    }

}
