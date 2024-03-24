package test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("철수 : ");
        String cheolsu = scanner.next();

        System.out.print("영희 : ");
        String younghee = scanner.next();

        if(cheolsu.equals(younghee)){
            System.out.println("무승부입니다");
        } else if (cheolsu.equals("s") && younghee.equals("p")) {
            System.out.println("철수 : 승!");
        } else if (cheolsu.equals("r") && younghee.equals("s")) {
            System.out.println("철수 : 승!");
        } else if (cheolsu.equals("p") && younghee.equals("r")){
            System.out.println("철수 : 승!");
        } else {
            System.out.println("영희 : 승!");
        }
    }
}
