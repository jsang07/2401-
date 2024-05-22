package test;

import java.util.Arrays;
import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 : ");
        String proverb = scanner.nextLine();

        String[] words = proverb.split(" ");

        System.out.println("단어개수 : " + words.length);

        Arrays.sort(words);

        System.out.print("정렬된 토큰 : ");
        for (int i = 0; i<words.length; i++){
            System.out.print(words[i]);
            if(i < words.length -1){
                System.out.print(", ");
            }
        }
    }
}
