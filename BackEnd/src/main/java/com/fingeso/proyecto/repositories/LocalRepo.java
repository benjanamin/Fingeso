package com.fingeso.proyecto.repositories;

import com.fingeso.proyecto.models.Local;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocalRepo extends MongoRepository<Local, String> {
    Local findByIdEquals(int id);


}
