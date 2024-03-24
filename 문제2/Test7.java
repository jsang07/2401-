package test;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        String c = input("철수");
        String y = input("영희");
        whosWin(y,c);
    }

    static String input(String name){
        System.out.print(name + " : " );
        String s = new Scanner(System.in).next();
        return s;
    }

    static void whosWin(String y, String c){
        if(c.equals(y)){
            System.out.println("무승부입니다");
        } else if (c.equals("s") && y.equals("p")) {
            System.out.println("철수 : 승!");
        } else if (c.equals("r") && y.equals("s")) {
            System.out.println("철수 : 승!");
        } else if (c.equals("p") && y.equals("r")){
            System.out.println("철수 : 승!");
        } else {
            System.out.println("영희 : 승!");
        }
    }
}
