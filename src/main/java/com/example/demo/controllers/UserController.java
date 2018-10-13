package com.example.demo.controllers;

import com.example.demo.dto.IdDTO;
import com.example.demo.dto.UserDTO;
import com.example.demo.entities.SysUser;
import com.example.demo.entities.User;
import com.example.demo.services.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/sysUsers")
public class UserController {


    @Autowired
    SysUserService sysUserService;

    @PostMapping
    public ResponseEntity<String> createUser(@RequestBody UserDTO userDTO) {

        if (userDTO == null) {
            HttpHeaders responseHeaders = new HttpHeaders();
            responseHeaders.set("User", "Empty content");
            return new ResponseEntity<String>("Couldn't create a user", responseHeaders, HttpStatus.NO_CONTENT);
        }

        sysUserService.create(userDTO);

        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("User", "All is ok");
        return new ResponseEntity<String>("User has been created", responseHeaders, HttpStatus.OK);
    }
    @DeleteMapping
    public ResponseEntity<String> deleteUser(@RequestBody IdDTO idDTO) {

        if (idDTO == null) {
            HttpHeaders responseHeaders = new HttpHeaders();
            responseHeaders.set("User", "Empty content");
            return new ResponseEntity<String>("Couldn't delete a user", responseHeaders, HttpStatus.NO_CONTENT);
        }

        sysUserService.delete(idDTO);
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("User", "All is ok");
        return new ResponseEntity<String>("User has been deleted", responseHeaders, HttpStatus.OK);
    }

    @GetMapping(path = "/getAllUsers")
    public List<SysUser> getAllUsers(){
        return sysUserService.getAllUsers();
    }

}
