package test;

class Max<T extends Comparable<T>> {
    public T max(T a, T b) {
        if (a.compareTo(b) >= 0) {
            return a;
        } else {
            return b;
        }
    }
}

public class Test6 {
    public static void main(String[] args) {
        Max<Double> n = new Max<>();
        System.out.println(n.max(10.0, 8.0)); 
        System.out.println(n.max(5.0, 8.0));

        Max<String> s = new Max<>();
        System.out.println(s.max("Hello", "Hi"));
        System.out.println(s.max("Good", "morning"));
    }
}
