package com.example.lab2.data.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

//@Entity
//@DiscriminatorValue(value = "smartphone")
public class Smartphone extends Product {

    //@Column(name = "manufacturer")
    private String manufacturer;

    //@Column(name = "model")
    private String model;

    //@Column(name = "ram")
    private int ram;

    //@Column(name = "hdd")
    private int hdd;

    //@Column(name = "camera")
    private int camera;

    public Smartphone() {}

    public Smartphone(String description, String photoUrl, String manufacturer, String model, int ram, int hdd, int camera) {
        super(description, photoUrl);
        this.manufacturer = manufacturer;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
        this.camera = camera;
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

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Smartphone smartphone) {
            return this.getId() == smartphone.getId();
        } else return false;
    }
}