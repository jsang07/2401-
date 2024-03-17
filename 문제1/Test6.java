import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("화씨온도를 입력하세요 : ");
        double f = scanner.nextDouble();
        double c = (f -32) * 5 / 9;
        System.out.println("섭씨 온도 : " + c);
    }
}
