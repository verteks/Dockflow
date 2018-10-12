package com.example.demo.entities;

import javax.persistence.*;

//роли доступа на редактирование документа
@Entity
public enum AccessRole {
    create, //включает чтение
    read,
    change; //включает чтение


    @ManyToOne
    private UserType usertype;
}
