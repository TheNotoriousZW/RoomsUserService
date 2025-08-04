package com.users.userservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import com.users.userservice.model.Team;
import com.users.userservice.service.TeamService;


@Controller
public class TeamController {

    @Autowired
    private TeamService teamService;

    @QueryMapping
    public Team createTeam(@Argument Team team) {
        return teamService.createTeam(team);
    }

    @QueryMapping
    public Team getTeam(@Argument String id) {
        return teamService.getTeam(id);
    }

    @QueryMapping
    public List<Team> getTeams() {
        return teamService.getTeams();
    }

    @MutationMapping
    public Team updateTeam(@Argument String id, @Argument Team team) {
        return teamService.updateTeam(id, team);
    }

    @MutationMapping
    public void deleteTeam(@Argument String id) {
        teamService.deleteTeam(id);
    }

        

    
}
