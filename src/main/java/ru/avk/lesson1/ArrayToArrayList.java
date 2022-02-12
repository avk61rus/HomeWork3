package ru.avk.lesson1;

import java.util.ArrayList;

class ArrayToArrayList {

    public static void main(String[] args) {
        String[] arr = {"Один  ", "Два   ", "Три   ", "Четыре ", "Пять    ", "Шесть  "};
        changeElement(0, 5);
        changeElement1( arr,3, 4);
        arrToList();
        arrToList1(arr);
    }

    public static void changeElement(int a, int b) {
        String c = null, d = null;
        String[] arr = {"Один  ", "Два   ", "Три   ", "Четыре ", "Пять    ", "Шесть  "};
        System.out.println("\n  0      1      2      3      4      5 ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (i == a) c = arr[i];
            else if (i == b) d = arr[i];
        }
        System.out.println();
        arr[a] = d;
        arr[b] = c;
        for (String s : arr) System.out.print(s + " ");
        System.out.println();
    }

    public static void changeElement1(Object[] arr, int a, int b) {
        Object temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        for (Object o : arr) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    public static void arrToList() {
        String[] arr = {"Один  ", "Два   ", "Три   ", "Четыре ", "Пять    ", "Шесть  "};
        ArrayList<String> al = new ArrayList<>();
        System.out.print("\n Содержимое массива String[] arr: " + "" + " ");
        for (int i = 0; i < arr.length; i++) {
            al.add(i, arr[i]);
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        System.out.print("  Содержимое списка ArrayList v.1:" + al + "\n");
    }

    public static <T> ArrayList<T> arrToList1(T[] arr) {
        ArrayList<T> aL = new ArrayList<T>(arr.length);
        for (T t : arr) aL.add(t);
        System.out.println("  Содержимое списка ArrayList v.2: " + aL + "\n");
        return aL;
    }
}

