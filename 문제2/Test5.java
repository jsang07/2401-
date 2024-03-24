package test;

public class Test5 {
    public static void main(String[] args) {
        for (int a = 1; a <= 20; a++) {
            for (int b = a; b <= 20; b++) {
                double c = Math.sqrt(a * a + b * b);

                if (c % 1 == 0 && a + b + c <= 20) {
                    System.out.println("a: " + a + ", b: " + b + ", c: " + (int)c);
                }
            }
        }
    }
}
