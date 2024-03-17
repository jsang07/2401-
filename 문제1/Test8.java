import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        System.out.print("0~999 사이의 숫자를 입력하세요 : ");
        int num = scanner.nextInt();

        int sum = 0;
        sum += num / 100;
        sum += (num % 100) / 10;
        sum += num % 10;
        System.out.println("각 자랏수의 합 = " + sum);
    }
}
