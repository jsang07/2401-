package test;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 1;
        System.out.print("팩토리얼 값을 구한 정수 : ");
        int n = scanner.nextInt();

        while(n > 0){
            result *= n;
            n--;
        }

//        while (true){
//            if (n == 0){
//                break;
//            }
//            result *= n;
//            n--;
//        }

        System.out.println(result);
    }
}
