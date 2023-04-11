package com.example.lab2.data.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

//@Entity
//@DiscriminatorValue(value = "laptop")
public class Laptop extends Product {

    //@Column(name = "manufacturer")
    private String manufacturer;

    //@Column(name = "model")
    private String model;

    //@Column(name = "ram")
    private int ram;

    //@Column(name = "hdd")
    private int hdd;

    protected Laptop() {}

    public Laptop(String description, String photoUrl, String manufacturer, String model, int ram, int hdd) {
        super(description, photoUrl);
        this.manufacturer = manufacturer;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
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

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Laptop laptop) {
            return this.getId() == laptop.getId();
        } else return false;
    }
}