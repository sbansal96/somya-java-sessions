package com.company.session1;

public class Car {

    private String make;
    private String model;
    private int year;

    public Car() {

    }

    public Car(String make, String model, int year) {
        this.make = make;
        this.setModel(model);
        this.year = year;
    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    private void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
