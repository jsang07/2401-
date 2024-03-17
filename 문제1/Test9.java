import java.util.Scanner;

public class Test9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("전공 이수 학점 : ");
        int major = scanner.nextInt();
        System.out.print("교양 이수 학점 : ");
        int g = scanner.nextInt();
        System.out.print("일반 이수 학점 : ");
        int general = scanner.nextInt();
        if(major+g+general >= 140 && major >= 70 && (g >= 30 && general>= 30 || g+general >= 80) ){
                System.out.println("졸업 가능");
        } else {
            System.out.println("fail");
        }
    }
}
