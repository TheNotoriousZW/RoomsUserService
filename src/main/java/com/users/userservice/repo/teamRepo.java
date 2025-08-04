package com.users.userservice.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.users.userservice.model.Team;

@Repository
public interface teamRepo extends MongoRepository<Team, String>{

}
