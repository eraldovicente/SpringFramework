package com.andres.curso.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andres.curso.springboot.webapp.springboot_web.models.User;
import com.andres.curso.springboot.webapp.springboot_web.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {
 
    @GetMapping("/details")
    public UserDto details() {
        
        User user = new User("Andres", "Guzman");

        UserDto userDto = new UserDto();
        userDto.setUser(user);

        return userDto;
    }

    @GetMapping("/list")
    public List<User> list() {
        User user = new User("Andres", "Gusman");
        User user2 = new User("Pepe", "Doe");
        User user3 = new User("Jhon", "Doe");

        List<User> users = Arrays.asList(user, user2, user3); 

        // List<User> users = new ArrayList<>();
        // users.add(user);
        // users.add(user2);
        // users.add(user3);
        
        return users;
    }

    @GetMapping("/details-map")
    public Map<String, Object> detailsMap() {

        User user = new User("Eraldo", "Vicente");

        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hola Mundo Spring Boot");
        body.put("user", user);

        return body;
    }
}
  