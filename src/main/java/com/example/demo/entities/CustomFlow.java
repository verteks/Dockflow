package com.example.demo.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

//упорядоченный список, состоящий из списка юзеров, с учетом шаблона абстрактного флоу
@Entity
public class CustomFlow {

    public CustomFlow(){

    }


    public CustomFlow(AbstractFlow templateFlow, List<User> customPath, List<Document> documents) {
        this.templateFlow = templateFlow;
        this.customPath = customPath;
        Documents = documents;
    }

    @Id
    @GeneratedValue
    @NotNull
    private Long id;




    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private AbstractFlow templateFlow;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "custompath", cascade = CascadeType.ALL)
    private List<User> customPath;

    @OneToMany (fetch = FetchType.LAZY, mappedBy = "docflow", cascade = CascadeType.ALL)
    private List<Document> Documents;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AbstractFlow getTemplateFlow() {
        return templateFlow;
    }

    public void setTemplateFlow(AbstractFlow templateFlow) {
        this.templateFlow = templateFlow;
    }

    public List<User> getCustomPath() {
        return customPath;
    }

    public void setCustomPath(List<User> customPath) {
        this.customPath = customPath;
    }

    public List<Document> getDocuments() {
        return Documents;
    }

    public void setDocuments(List<Document> documents) {
        Documents = documents;
    }
}
