package test;

import java.util.Scanner;

public class FactorialMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("팩토리얼 값을 구한 정수 : ");

        int result = factorial(scanner.nextInt());

        System.out.println(result);
    }

    static  int factorial(int x){
        int r = 1;
        while(x > 0){
            r *= x;
            x--;
        }
        return r;
    }
}
