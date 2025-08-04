package com.users.userservice.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.users.userservice.model.User;

@Repository
public interface userRepo extends MongoRepository<User, String>{
   
    List<User> findByOrganizationId(String organizationId);
}
