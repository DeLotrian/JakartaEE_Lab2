package com.example.lab2.data.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

//@Entity
//@DiscriminatorValue("car")
public class Car extends Product {
    //@Column(name = "make")
    private String make;

    //@Column(name = "model")
    private String model;

    //@Column(name = "year")
    private int year;

    //@Column(name = "mileage")
    private int mileage;

    //@Column(name = "price")
    private double price;

    public Car() {}

    public Car(String description, String photoUrl, String make, String model, int year, int mileage, double price) {
        super(description, photoUrl);
        this.make = make;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Car car) {
            return this.getId() == car.getId();
        } else return false;
    }

    @Override
    public String toString() {
        return "Car{ " +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                " }";
    }
}
