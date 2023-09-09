package ru.geekbrains.lesson4.homework;

public class Apple extends Fruit {
    private String variety;

    public Apple(String variety) {
        super(1f);
        this.variety = variety;
    }

    @Override
    public double calculateWeight() {
        return weight;
    }
}
