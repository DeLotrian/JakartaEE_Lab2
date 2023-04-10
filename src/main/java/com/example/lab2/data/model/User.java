package com.example.lab2.data.model;

import com.example.lab2.utils.Constants;

import javax.persistence.*;
import java.io.Serializable;


//@Entity
//@Table(name = Constants.USERS_TABLE)
public class User implements Serializable {
    //@Id
    //@GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String name;

    private String email;

    public User() { }

    public User(Integer id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //@Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
