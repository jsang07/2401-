package test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("나이를 입력하세요 : ");
        int age = scanner.nextInt();
        if(age >= 19){
            System.out.println("성년");
        } else {
            System.out.println("미성년");
        }
    }
}
