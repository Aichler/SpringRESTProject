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




    UserService userService = new UserService();
//    @Autowired
//    private UserRepository userRepository;

//    @GetMapping
//    public List<User> findAllUsers() {
//        // Implement
//        return null;
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<User> findUserById(@PathVariable(value = "id") long id) {
//        // Implement
//        return null;
//    }
//
    @PostMapping(path = "/save", consumes = "application/json", produces = "application/json")
    public UserDTO saveUser(@Validated @RequestBody UserDTO userDTO) {
        UserDTO us = new UserDTO();
        userService.save(userDTO);
//        us.setId(userDTO.getId());
//        us.setName(userDTO.getName());
//
//        // Implement
        System.out.println("What...");
//        System.out.println(us.getId());
        return us;
    }
    @GetMapping("/")
    public String findUserById() {
        // Implement
        System.out.println("What...");
        return "Hello";
    }


}