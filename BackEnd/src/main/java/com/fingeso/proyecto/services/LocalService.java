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
    public Local getById(@PathVariable(value = "id") String id){
        System.out.println("get localbyid");
        System.out.println(id);
        return localRepo.findByIdEquals(id);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public void create(@RequestBody Local local){
        localRepo.save(local);
        local.generarCodigoQR("http://localhost:8080/#/SolicitarAtencion");
        //Al leer el codigo QR le indica que local quiere solicitar numero
        //local.generarCodigoQR("http://192.168.0.6:8080//#/SolicitarAtencion/"+local.getId()+"/");
    }

    @RequestMapping(value = "/addClient/{idLocal}", method = RequestMethod.POST)
    @ResponseBody
    public void addClientToFila(@PathVariable(value = "idLocal") String id, @RequestBody Client client){
        clientRepo.save(client);

        Local local = localRepo.findByIdEquals(id);

        local.addClient(client);

        local.enviarMensaje("Quedan 5 minutos para su atencion en local",client.getPhone());

        localRepo.deleteById(id);

        localRepo.save(local);
    }

    @RequestMapping(value = "/sendMessage/{localID}/{phone}", method = RequestMethod.GET)
    @ResponseBody
    public void sendMessage(@PathVariable(value ="localID") String id, @PathVariable(value = "phone") String phone){
        localRepo.findByIdEquals(id).enviarMensaje("phone","Quedan 5 minutos");
    }



}
