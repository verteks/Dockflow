package com.example.demo.entities;

import javax.persistence.Entity;

@Entity
public enum StatusDoc {
    crestedby("created by"),
    changedby("changed by"),
    checkedby("checked by"),
    movedfrom("moved from"),
    closedby("closed by");

    String StatusDoc;

    private StatusDoc(String StatusDoc){
        this.StatusDoc = StatusDoc;
    }

    public String getStatusDoc(){
        return StatusDoc;
    }
}
