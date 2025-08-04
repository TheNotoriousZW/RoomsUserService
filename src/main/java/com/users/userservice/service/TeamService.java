package com.users.userservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.users.userservice.model.Team;
import com.users.userservice.repo.teamRepo;

@Service
public class TeamService {

    @Autowired
    private teamRepo teamRepo;

    public Team createTeam(Team team) {
        return teamRepo.save(team);
    }

    public Team getTeam(String id) {
        return teamRepo.findById(id).orElse(null);
    }

    public Team updateTeam(String id, Team team) {
        Team existingTeam = getTeam(id);
        if (existingTeam == null) {
            return null;
        }
        existingTeam.setUsers(team.getUsers());
        existingTeam.setProjects(team.getProjects());
        return teamRepo.save(existingTeam);
    }

    public Team addUserToTeam(String teamId, String userId) {
        Team team = getTeam(teamId);
        if (team == null) {
            return null;
        }
        team.getUsers().add(userId);
        return teamRepo.save(team);
    }

    public void deleteTeam(String id) {
        teamRepo.deleteById(id);
    }

    public List<Team> getTeams() {
        return teamRepo.findAll();
    }

}
