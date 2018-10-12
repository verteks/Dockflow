package com.example.demo.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public enum  SystemRole {
    admin,
    manager;

    SystemRole() {
    }

    @Id
    @GeneratedValue
    @NotNull
    private Long id;
}
