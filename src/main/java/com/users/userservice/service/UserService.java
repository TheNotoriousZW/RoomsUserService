package com.users.userservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.users.userservice.model.User;
import com.users.userservice.repo.userRepo;

@Service
public class UserService {

    @Autowired
    private userRepo userRepo;

    public User createUser(User user) {
        return userRepo.save(user);
    }

    public User getUser(String id) {
        return userRepo.findById(id).orElse(null);
    }

    public List<User> getUsers() {
        return userRepo.findAll();
    }

    public User updateUser(String id, User user) {
        User existingUser = getUser(id);
        if (existingUser == null) {
            return null;
        }
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setEmail(user.getEmail());
        existingUser.setRole(user.getRole());
        existingUser.setTeams(user.getTeams());
        existingUser.setBranches(user.getBranches());

        return userRepo.save(existingUser);
    }

    public void deleteUser(String id) {
        userRepo.deleteById(id);
    }

    public List<User> getUsersByOrganization(String organizationId) {
        return userRepo.findByOrganizationId(organizationId);
    }

    public User addBranchToUser(String userId, String branchId) {
        User user = getUser(userId);
        if (user == null) {
            return null;
        }
        user.getBranches().add(branchId);
        return userRepo.save(user);
    }
}
