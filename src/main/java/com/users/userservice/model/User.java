package com.users.userservice.model;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.users.userservice.model.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document(collection = "users")
@AllArgsConstructor
@NoArgsConstructor
@Component
public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Role role;
    private List<String> teams;
    private List<String> branches;
    private String organizationId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
