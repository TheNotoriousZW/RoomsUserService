package com.users.userservice.model;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document(collection = "teams")
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Team {

    
    @Id
    private String id;
    private String name;
    private List<User> users;
    private LocalDateTime createdAt;
    private String organizationId;
    private List<String> projects;
}
