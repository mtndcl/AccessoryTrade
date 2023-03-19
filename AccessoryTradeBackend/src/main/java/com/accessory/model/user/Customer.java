package com.accessory.model.user;


import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Table
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Customer extends User{

}
