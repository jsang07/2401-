package test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test6 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter nowFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
        String formatedDate = now.format(nowFormatter);

        int dayOfMonth = now.getDayOfMonth();

        int dayOfYear = now.getDayOfYear();

        System.out.println(formatedDate);
        System.out.println("오늘은 " + now.getMonthValue() + "월의 " + dayOfMonth + "번째 날");
        System.out.println("오늘은 " + now.getYear() + "년의 " + dayOfYear+ "번째 날");
    }
}
