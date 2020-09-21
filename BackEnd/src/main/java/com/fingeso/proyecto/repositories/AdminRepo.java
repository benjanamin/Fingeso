package com.fingeso.proyecto.repositories;


import com.fingeso.proyecto.models.Administrador;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRepo extends MongoRepository<Administrador, String> {

    Administrador findAdministradorByRutAndAndPassword(String rut, String password);
    Administrador findAdministradorById(int id);
    Administrador findAdministradorByRut(String rut);
    Administrador findAdministradorByTelefono(String telefono);
    List<Administrador> findAll();
}
