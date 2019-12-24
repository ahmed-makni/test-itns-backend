package com.itns.dao;

import com.itns.entities.Besoin;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin("*")
@RepositoryRestResource

public interface BesoinDao extends MongoRepository<Besoin,String> {

}
