package com.example.lab2.data.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

//@Entity
//@DiscriminatorValue(value = "monitor")
public class Monitor extends Product {
    //@Column(name = "manufacturer")
    private String manufacturer;

    //@Column(name = "model")
    private String model;

    //@Column(name = "inches")
    private double inches;

    protected Monitor() {}

    public Monitor(String description, String photoUrl, String manufacturer, String model, double inches) {
        super(description, photoUrl);
        this.manufacturer = manufacturer;
        this.model = model;
        this.inches = inches;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getInches() {
        return inches;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }
}