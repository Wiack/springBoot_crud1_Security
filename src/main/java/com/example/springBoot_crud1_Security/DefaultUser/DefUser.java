package com.example.springBoot_crud1_Security.DefaultUser;

import com.example.springBoot_crud1_Security.model.User;
import com.example.springBoot_crud1_Security.service.RoleService;
import com.example.springBoot_crud1_Security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class DefUser implements CommandLineRunner {
    private RoleService roleService;
    private UserService userService;

    @Autowired
    public DefUser(RoleService roleService, UserService userService) {
        this.roleService = roleService;
        this.userService = userService;
    }

    @Override
    public void run(String... args) {

        User admin = userService.getByEmail("admin@gmail.com");
        if (admin == null) {
            admin = new User(
                    "adminName",
                    "adminLastName",
                    33,
                    "admin@gmail.com",
                    "0000",
                    Collections.singleton(roleService.findByName("ROLE_ADMIN")));

            userService.addUser(admin);
        }
    }
}



