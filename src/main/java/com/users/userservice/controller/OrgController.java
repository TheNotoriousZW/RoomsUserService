package com.users.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.users.userservice.model.Organization;
import com.users.userservice.service.OrgService;

@Controller
public class OrgController {
    
    @Autowired
    private OrgService orgService;

    @QueryMapping
    public Organization createOrganization(@Argument Organization organization) {
        return orgService.createOrganization(organization);
    }

    @QueryMapping
    public Organization getOrganization(@Argument String id) {
        return orgService.getOrganization(id);
    }

    @QueryMapping
    public List<Organization> getOrganizations() {
        return orgService.getOrganizations();
    }

    @MutationMapping
    public Organization updateOrganization(@Argument String id, @Argument Organization organization) {
        return orgService.updateOrganization(id, organization);
    }

    @MutationMapping
    public void deleteOrganization(@Argument String id) {
        orgService.deleteOrganization(id);
    }

}
