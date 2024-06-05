package test;
class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}

public class Test1 {
    public static void main(String[] args) {
        MyDate d = new MyDate(2035, 12, 25); // MyDate 객체 생성
        System.out.printf("%d년 %d월 %d일\n", d.getYear(), d.getMonth(), d.getDay());
    }
}
