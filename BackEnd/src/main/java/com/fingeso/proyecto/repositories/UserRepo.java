package com.fingeso.proyecto.repositories;

import com.fingeso.proyecto.models.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<Usuario, String> {

}
