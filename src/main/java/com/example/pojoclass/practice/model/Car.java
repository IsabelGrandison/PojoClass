package com.example.pojoclass.practice.model;

public class Car {
    private String make;
    private String model;
    private String color;
    private int year;


    public Car (String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public Integer getYear() {
        return year;
    }
    public void setYear() {
        this.year = year;
    }

    public static void main(String[]args) {
        Car Car1 = new Car( "Honda", "CRV", "Black", 2017);
        System.out.println(Car1.getMake());
        System.out.println(Car1.getModel());
        System.out.println(Car1.getColor());
        System.out.println(Car1.getYear());
        }
    }

