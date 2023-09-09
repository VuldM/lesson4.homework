package ru.geekbrains.lesson4.homework;

import java.util.ArrayList;
import java.util.Comparator;

public class Box<T extends Fruit> implements Comparator<Fruit> {

    // Коллекция для хранения фруктов (3c)
    ArrayList<T> fruits;

    public Box() {
        this.fruits = new ArrayList<>();
    }
    public ArrayList<T> getFruits() {
        return fruits;
    }
    public double getWeight() {
        if (fruits.isEmpty()) return 0;
        return fruits.size() * fruits.get(0).
                getWeight();
    }

    public boolean compare(Box<?> other) {
        return Math.abs(getWeight() - other.getWeight()) < 0.001;
    }

       public void combine(Box<T> other) {
        other.getFruits().addAll(fruits);
        fruits.clear();
    }
    public void add(T fruit) {
        fruits.add(fruit);
    }

    public int boxSize(){
        return fruits.size();
    }


    @Override
    public int compare(Fruit o1, Fruit o2) {
        return Double.compare(o1.getWeight(), o2.getWeight());
    }
}
