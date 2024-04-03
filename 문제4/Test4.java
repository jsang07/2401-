package test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true){
            System.out.print("URL을 입력하세요 : ");
            String url = in.nextLine();
            if (url.equals("bye")){
                break;
            }
            boolean endsWithCom = url.endsWith("com");
            boolean containsJava = url.contains("java");
            if (endsWithCom){
                System.out.println(url + "은 'com' 으로 끝납니다.");
            }
            if (containsJava){
                System.out.println(url + "은 'java' 를 포함합니다.");
            }
        }
    }
}
