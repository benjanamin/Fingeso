package com.fingeso.proyecto.repositories;


import com.fingeso.proyecto.models.Client;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepo extends MongoRepository<Client, String> {
    Client findClientByPhone(String phone);
    Client findClientByRut(String rut);
    Client findClientByAgeGreaterThan(int age);
    List<Client> findAllByPhoneNotNull();

}
