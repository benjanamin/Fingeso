package com.fingeso.proyecto.repositories;


import com.fingeso.proyecto.models.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepo extends MongoRepository<Cliente, String> {
    Cliente findClienteByTelefono(String telefono);
    Cliente findClienteByRut(String rut);
    Cliente findClienteByEdadGreaterThan(int edad);
    List<Cliente> findAllByTelefonoNotNull();

}
