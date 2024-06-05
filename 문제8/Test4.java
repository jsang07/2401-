package test;

import java.util.ArrayList;

class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T first() {
        return this.first;
    }

    public U second() {
        return this.second;
    }
}
public class Test4 {
    public static void main(String[] args) {
        Pair<Integer, Integer> p1 = new Pair<>(10,20);
        Pair<Double, Double> p2 = new Pair<>(10.0,20.0);

        System.out.println(p1.first());
        System.out.println(p2.second());
    }
}
