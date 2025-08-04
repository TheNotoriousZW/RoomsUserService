package com.users.userservice.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.users.userservice.model.Organization;

@Repository
public interface organizationRepo extends MongoRepository<Organization, String>{

}
