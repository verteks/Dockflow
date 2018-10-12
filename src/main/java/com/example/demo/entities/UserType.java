package com.example.demo.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;


//бизнес-роль пользователя - директор, секретарь, бухгалтер. хранит роли доступа работы с документом
@Entity
public class UserType {
    public UserType(){

    }

    public UserType(String name) {
        this.name = name;
    }

    public UserType(String name, List<AccessRole> accessRoles) {
        this.name = name;
        this.accessRoles = accessRoles;
    }

    @ManyToOne
    private AbstractFlow abstractpath;


    @Id
    @GeneratedValue
    @NotNull
    private Long id;

    @Column
    @NotNull
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "usertype", cascade = CascadeType.ALL)
    private List<AccessRole> accessRoles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<AccessRole> getAccessRoles() {
        return accessRoles;
    }

    public void setAccessRoles(List<AccessRole> accessRoles) {
        this.accessRoles = accessRoles;
    }
}
