package com.accessory.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name= "earrings")
public class Earrings extends BaseModel {
    private String dddd;
    public String getDddd() {
        return dddd;
    }
    public void setDddd(String dddd) {
        this.dddd = dddd;
    }
}
