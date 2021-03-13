package com.example.project_two.controller;

import com.example.project_two.DTO.UserDTO;
import com.example.project_two.JpaRepository.UserRepository;
import com.example.project_two.service.UserService;
import com.example.project_two.service.UserServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class UserController {



    final
    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping(path = "/save", consumes = "application/json", produces = "application/json")
    public UserDTO saveUser(@Validated @RequestBody UserDTO userDTO) {

        userService.save(userDTO);

        return userDTO;
    }
    @GetMapping("/")
    public String findUserById() {
        // Implement
        System.out.println("What...");
        return "Hello";
    }


}