package chap2;
import java.util.Scanner;
public class Rectangle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double w, h, area;
		
		System.out.print("직사각형의 가로 길이를 입력하세요: ");
		w = in.nextInt();
		System.out.print("직사각형의 세로 길이를 입력하세요: ");
		h = in.nextInt();
		area = w * h;
		System.out.print("직사각형의 넓이는 " + area + "입니다");
	}
}
