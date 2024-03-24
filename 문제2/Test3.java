package test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.print("양의 정수를 입력하세요 : ");
            number = scanner.nextInt();

            if (number <= 0) break;

            if (number % 2 == 0) {
                sum += number;
            }
        } while (true);

        System.out.println("입력한 양의 정수 중에서 짝수의 합은 " + sum);
    }
}
