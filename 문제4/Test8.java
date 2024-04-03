package test;

import java.util.Scanner;

enum Day{
    SUNDAY("일요일") , MONDAY("싫다"), TUSEDAY("화요일"), WENDSDAY("수요일"), THURSDAY("목요일"), FRIDAY("금요일"), SATURDAY("토요일");

    private String day;
    Day(String day){
        this.day = day;
    }

    public String toString(){
        return day;
    }
}

public class Test8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String day = in.nextLine().toLowerCase();

        switch (day){
            case "monday" :
                System.out.println(day);
                System.out.println(Day.MONDAY+ "은 싫다");
                break;
        }

    }

    static void feel(String day){
        System.out.println(day);
    }
}
