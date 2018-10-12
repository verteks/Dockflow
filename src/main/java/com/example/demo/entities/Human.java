package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class Human {

    public Human(){

    }

    public Human(String login, String password) {
        this.login = login;
        this.password = password;
    }



    @Column
    @NotNull
    private String login;

    @Column
    @NotNull
    private String password;





    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
