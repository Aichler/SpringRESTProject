package com.example.project_two.service;

import com.example.project_two.DTO.UserDTO;
import com.example.project_two.JpaRepository.UserRepository;
import com.example.project_two.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServiceInterface{

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserService() {
    }

    public void save(UserDTO userDTO){
        System.out.println("What...oh");
        User user = new User();
                user.setName(userDTO.getName());
//                userDAO.add(user);
        userRepository.save(user);

    }





}
