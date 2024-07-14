package com.example.mypress.service;

import com.example.mypress.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User save ( User user);
}
