package ru.avk.lesson1;

public class Sorting {
    public static void main(String[] args) {
        BoxFruit<Apple> appleBoxFruit = new BoxFruit<>(new Apple(), new Apple(), new Apple());
        BoxFruit<Orange> oranges = new BoxFruit<>(new Orange(), new Orange());

        BoxFruit<Orange>orangeBoxFruit = new BoxFruit<>(new Orange());
        orangeBoxFruit.add(new Orange());

        appleBoxFruit.add(new Apple());
        appleBoxFruit.add(new Apple());
        appleBoxFruit.add(new Apple());
        appleBoxFruit.add(new Apple());
        appleBoxFruit.add(new Apple());
        appleBoxFruit.add(new Apple());

        oranges.add(new Orange());
        oranges.add(new Orange());
        oranges.add(new Orange());
        oranges.add(new Orange());
//        oranges.add(new Orange())

//         oranges.transferFruit(orangeBoxFruit);

        System.out.println("Вес корзины  с апельсинами: " + orangeBoxFruit.getWeight());
        System.out.println("Вес имеющихся апельсинов: " + oranges.getWeight());
        System.out.println("Вес корзины  с ябоками: " + appleBoxFruit.getWeight());
        System.out.println("Вес имеющихся яблок: ");
        
        System.out.println("Корзины по весу равны ? :" + appleBoxFruit.equalsToWeight(oranges));
    }
}
