package test;

public class Test9 {
    public static void main(String[] args) {
        foo("안녕", 1);
        foo("안녕하세요", 1,2);
        foo("잘 있어");
    }
    static void foo(String s){
        System.out.println(s);
    }
    static void foo(String s, int x){
        System.out.println(s + " " + x);
    }
    static void foo(String s, int x, int y){
        System.out.println(s + " " + x + " " + y);
    }
}
