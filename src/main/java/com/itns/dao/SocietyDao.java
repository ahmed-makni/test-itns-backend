package com.itns.dao;

import com.itns.entities.Society;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
@RepositoryRestResource
public interface SocietyDao extends MongoRepository<Society,String> {


    public Society findByNom(@Param("nom") String nom);

}
