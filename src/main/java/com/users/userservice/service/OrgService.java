package com.users.userservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.users.userservice.model.Organization;
import com.users.userservice.repo.organizationRepo;

@Service
public class OrgService {

    @Autowired
    private organizationRepo organizationRepo;

    public Organization createOrganization(Organization organization) {
        return organizationRepo.save(organization);
    }

    public Organization getOrganization(String id) {
        return organizationRepo.findById(id).orElse(null);
    }

    public List<Organization> getOrganizations() {
        return organizationRepo.findAll();
    }

    public Organization updateOrganization(String id, Organization organization) {
        Organization existingOrganization = getOrganization(id);
        if (existingOrganization == null) {
            return null;
        }           
        existingOrganization.setUsers(organization.getUsers());
        existingOrganization.setTeams(organization.getTeams());
        return organizationRepo.save(existingOrganization);
    }

    public void deleteOrganization(String id) {
        organizationRepo.deleteById(id);
    }

    
}
