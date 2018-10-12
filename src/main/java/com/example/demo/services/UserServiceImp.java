package com.example.demo.services;

import com.example.demo.dto.IdDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.dto.UserOutDTO;
import com.example.demo.entities.User;
import com.example.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class UserServiceImp implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User create(UserDTO userDTO) {
        User user = new User();

        user.setName(userDTO.getName());
        user.setPassword(userDTO.getPassword());

        return userRepository.save(user);
    }

    @Override
    public void delete(IdDTO idDTO) {

    }

    @Override
    public User update(UserDTO UserDTO) {
        return null;
    }

    @Override
    public UserOutDTO getUser(IdDTO idDTO) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
