package com.lab5.task2;

public class Airplane {

    private String model;
    private int capacity;
    private int range;

    public Airplane(String model, int capacity, int range) {
        this.model = model;
        this.capacity = capacity;
        this.range = range;
    }


    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRange() {
        return range;
    }

    public void printInfo() {
        System.out.println("модель: " + getModel() + " | вместимость: " + getCapacity() + " чел | дальность: " + getRange() + " км");
    }
}