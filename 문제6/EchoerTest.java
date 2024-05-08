package test.test8;

import java.util.Scanner;

abstract class Echoer{
    void start(){
        System.out.println("시작합니다.");
    }

    abstract void echo();

    void stop(){
        System.out.println("종료합니다.");
    }
}

public class EchoerTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Echoer e = new Echoer() {
            @Override
            void echo() {
                String s = "";
                while (!s.equals("fin")) {
                    s = in.nextLine();
                    System.out.println(s);
                }
            }
        };
        e.start();
        e.echo();
        e.stop();
    }
}
