package test;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("원기둥의 밑면 반지름은? ");
        int radius = scanner.nextInt();
        System.out.print("원기둥의 높이는? ");
        int height = scanner.nextInt();
        System.out.println("원기두의 부피는 " + (radius*radius*3.14) * height);
    }
}
