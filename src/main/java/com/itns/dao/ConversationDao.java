package com.itns.dao;

import com.itns.entities.Conversation;
import com.itns.entities.Society;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin("*")
@RepositoryRestResource

public interface ConversationDao extends MongoRepository<Conversation,String> {
}
