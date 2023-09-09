package ru.geekbrains.lesson4.homework;

public abstract class Fruit {

    protected final float weight;

    public float getWeight() {
        return weight;
    }

    public Fruit(float weight) {
        this.weight = weight;
    }
    public abstract double calculateWeight();
}
