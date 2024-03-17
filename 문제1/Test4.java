package test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("초 단위 정수를 입력하세요:");
        int time = scanner.nextInt();

        int hour = time / (60 * 60);
        int minute = time / 60;
        int second = time % 60;

        System.out.println(hour + "시간, " + minute + "분, " + second + "초입니다.");
        scanner.close();
    }
}
