package com.itns.dao;

import com.itns.entities.Propect;
import com.itns.entities.Society;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin("*")
@RepositoryRestResource

public interface PropectDao extends MongoRepository<Propect,String> {

    public Propect findByNom(String nom);
}

