package com.example.demo.controllers;

import com.example.demo.dto.UserDTO;
import com.example.demo.entities.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {


    @Autowired
    UserService userService;

    @GetMapping(path = "/createUser")
    public ResponseEntity<String> createUser(@RequestParam UserDTO userDTO) {

        if (userDTO == null) {
            HttpHeaders responseHeaders = new HttpHeaders();
            responseHeaders.set("User", "Empty content");
            return new ResponseEntity<String>("Couldn't create a user", responseHeaders, HttpStatus.NO_CONTENT);
        }
        userService.create(userDTO);

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("User", "All is ok");
        return new ResponseEntity<String>("User has been created", responseHeaders, HttpStatus.OK);
    }

    @GetMapping(path = "/getAllUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

}
