package com.example.mypress.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "app_user")
@Entity
public class User {
    @Id
    Long id;
    String username;
    String password;
    String email;
}
