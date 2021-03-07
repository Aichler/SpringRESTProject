package com.example.project_two.service;

import com.example.project_two.DTO.UserDTO;
import com.example.project_two.JpaRepository.UserRepository;
import com.example.project_two.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService implements UserServiceInterface{
    @Autowired
    UserRepository userRepository;


    public void save(UserDTO userDTO){
        System.out.println("What...oh");
        User user = new User();
                user.setName(userDTO.getName());
//                userDAO.add(user);
        userRepository.save(user);

    }





}
