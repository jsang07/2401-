package chap002;

public class BreakDemo {
	public static void main(String[] args) {
		int i = 1;
		int j = 5;
		while(true) {
			System.out.println(i++);
			if(i == j) break;
		}
	}
}
