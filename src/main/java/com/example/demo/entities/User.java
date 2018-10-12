package com.example.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Entity
public class User {
    public User(){}

    public User(String name, String password){
    this.name = name;
    this.password=password;
    }

    @Id
    @GeneratedValue
    @NotNull
    UUID id;

    @NotNull
    String name;

    @NotNull
    String password;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
