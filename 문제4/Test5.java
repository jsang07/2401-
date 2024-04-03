package test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] counts = new int[10];
        System.out.println("숫자를 10개 입력하세요 : ");

        int totalInputs = 0;
        while (totalInputs < 10) {
            int number = scanner.nextInt();
            if (number >= 0 && number <= 99) {
                counts[number / 10]++;
                totalInputs++;
            }
        }

        for (int i = 0; i < counts.length; i++) {
            System.out.printf("%2d ~ %2d : ", i * 10, i * 10 + 9);
            for (int j = 0; j < counts[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

