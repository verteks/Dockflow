package com.example.demo.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

//упорядоченный список, состоящий из бизнес-ролей
@Entity
public class AbstractFlow {
    public AbstractFlow(){

    }

    public AbstractFlow(String templateName, List<UserType> abstractPath) {
        this.templateName = templateName;
        this.abstractPath = abstractPath;
    }

    public AbstractFlow(String templateName) {
        this.templateName = templateName;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public List<UserType> getAbstractPath() {
        return abstractPath;
    }

    public void setAbstractPath(List<UserType> abstractPath) {
        this.abstractPath = abstractPath;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }




    @Id
    @GeneratedValue
    @NotNull
    private Long id;

    @NotNull
    @Column
    private String templateName;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "abstractpath", cascade = CascadeType.ALL)
    private List<UserType> abstractPath;

    @ManyToOne
    private CustomFlow customflow;
}
