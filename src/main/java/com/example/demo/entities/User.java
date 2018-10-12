package com.example.demo.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


//пользователи, которых заводит админ. логин, пароль, бизнес-роль

@Entity
public class User extends Human {

    public User(){

    }

    public User(String login, String password, @NotNull String name, @NotNull UserType userType) {
        super(login, password);
        this.name = name;
        this.userType = userType;
    }

    @Id
    @GeneratedValue
    @NotNull
    private Long id;

    @Column
    @NotNull
    private String name;

    @ManyToOne
    private CustomFlow custompath;

    @ManyToOne
    private Document document;

    @Column
    @NotNull
    private UserType userType;

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
