package com.accessory.model;

import javax.persistence.*;

@Table
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public  class Accessory extends BaseModel{
    private String name;
    private String description;
    private Double price;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
}
