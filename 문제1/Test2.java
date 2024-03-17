package test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : " );
        int num = scanner.nextInt();
        System.out.println(num + "의 제곱은 " + num*num);
    }
}
