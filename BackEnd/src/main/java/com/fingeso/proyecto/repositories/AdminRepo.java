package com.fingeso.proyecto.repositories;


import com.fingeso.proyecto.models.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRepo extends MongoRepository<Admin, String> {

    Admin findAdminByRutAndAndPassword(String rut, String password);
    Admin findAdminById(int id);
    Admin findAdminByRut(String rut);
    Admin findAdminByPhone(String phone);
    List<Admin> findAll();
}
