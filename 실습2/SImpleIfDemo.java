package chap002;

import java.util.Scanner;

public class SImpleIfDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = scanner.nextInt();
		
		if (num % 2 == 0) 
			System.out.println("짝수!");
		else 
			System.out.println("홀수!");
		
		System.out.println("종료");
	}

}
