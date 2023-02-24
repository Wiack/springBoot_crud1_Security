package com.example.springBoot_crud1_Security.service;

import com.example.springBoot_crud1_Security.model.Role;

import java.util.List;

public interface RoleService {
    Role findByName(String name);

    List<Role> findAll();

}
