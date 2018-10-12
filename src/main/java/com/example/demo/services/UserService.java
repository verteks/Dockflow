package com.example.demo.services;

import com.example.demo.dto.IdDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.dto.UserOutDTO;
import com.example.demo.entities.User;

import java.util.List;

public interface UserService {
        User create(UserDTO userDTO);

        void delete(IdDTO idDTO);

        User update(UserDTO userDTO);

        UserOutDTO getUser(IdDTO idDTO);

        List<User> getAllUsers();

}
