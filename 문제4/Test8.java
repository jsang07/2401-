package test;

import java.util.Scanner;

enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class Test8 {
    public static void printFeeling(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("월요일은 싫다.");
                break;
            case FRIDAY:
                System.out.println("금요일은 좋다.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("최고.");
                break;
            default:
                System.out.println("그저 그렇다.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();

        printFeeling(Day.valueOf(input));
    }
}




