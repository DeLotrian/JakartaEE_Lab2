package com.example.lab2.data.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

//@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "product_type")
public abstract class Product implements Serializable {

    //@Id
    //@Column(name = "id", updatable = false, nullable = false)
    private Long id = System.currentTimeMillis();

    //@Column(name = "description")
    private String description;

    //@Column(name = "photo_url")
    private String photoUrl;

    public Product() {}

    public Product(String description, String photoUrl) {
        this.description = description;
        this.photoUrl = photoUrl;
    }

    //@Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Product pr) {
            return Objects.equals(this.id, pr.id);
        } else return false;
    }
}
