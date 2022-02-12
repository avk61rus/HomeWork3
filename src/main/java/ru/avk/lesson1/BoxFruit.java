package ru.avk.lesson1;

import java.util.ArrayList;
import java.util.List;

public class BoxFruit<F extends Fruit> {
    List<F> fruits;

    public BoxFruit() {
        this.fruits = new ArrayList<>();
    }

    public BoxFruit(List<F> fruits) {
        this.fruits = new ArrayList<>();
    }

    public BoxFruit(F... fruits) {
        this.fruits = new ArrayList<>();
    }

    public BoxFruit(F fruits) {
        this.fruits = new ArrayList<>();
    }
    public void add(F fruit) {
        this.fruits.add(fruit);
    }

    public double getWeight() {
        double weight = 0.0;
        for (F fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean equalsToWeight(BoxFruit another) {
        return Math.abs(getWeight() - another.getWeight()) < 0.0001;
    }

    public void transferFruit(BoxFruit<? super F> another) {
        if (this == another) return;
        another.getFruits().addAll(fruits);
        fruits.clear();
    }

    public List<F> getFruits() {
        return fruits;
    }

    public void setFruits(List<F> fruits) {
        this.fruits = fruits;
    }
}
