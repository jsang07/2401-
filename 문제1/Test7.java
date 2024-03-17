import java.util.Scanner;

public class Test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = scanner.nextInt();

        boolean both = (num % 4 == 0) && (num % 5 == 0);
        boolean either = (num % 4 == 0) || (num % 5 == 0);
        boolean onlyOne = !both && either;
        System.out.println("4 와 5로 나누어지나요 : " + both);
        System.out.println("4 또는 5로 나누어지나요 : " + either);
        System.out.println("4 나 5중 나누어지지만 두 수 모두로는 나누어지지 않나요 : " + onlyOne);
    }

}
