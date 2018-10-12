package com.example.demo.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

//роли доступа на редактирование документа
@Entity
public enum AccessRole {
    create, //включает чтение
    read,
    change; //включает чтение


    @ManyToOne
    private UserType usertype;

    @Id
    @GeneratedValue
    @NotNull
    private Long id;
}
