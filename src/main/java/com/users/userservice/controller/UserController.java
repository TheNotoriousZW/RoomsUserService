package com.users.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.users.userservice.model.User;
import com.users.userservice.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;
    
    @QueryMapping
    public User createUser(@Argument User user) {
        return userService.createUser(user);
    }

    @QueryMapping
    public User getUser(@Argument String id) {
        return userService.getUser(id);
    }

    @QueryMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @MutationMapping
    public User updateUser(@Argument String id, @Argument User user) {
        return userService.updateUser(id, user);
    }

    @MutationMapping
    public void deleteUser(@Argument String id) {
        userService.deleteUser(id);
    }

    @QueryMapping
    public List<User> getUsersByOrganization(@Argument String organizationId) { 
        return userService.getUsersByOrganization(organizationId);
    }

    @MutationMapping
    public User addBranchToUser(@Argument String userId, @Argument String branchId) {
        return userService.addBranchToUser(userId, branchId);
    }
    
}
