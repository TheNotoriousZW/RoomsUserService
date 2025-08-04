package com.users.userservice.model;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "organizations")
@Component
public class Organization {
    @Id
    private String id;
    private String name;
    private List<User> users;
    private List<Team> teams;
    private LocalDateTime createdAt;

}
