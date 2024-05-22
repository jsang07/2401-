package test;

public class Test5 {
    public static void main(String[] args) {
        show(new String("멘붕"));
        show(new StringBuilder("meltdown"));
        show(new StringBuffer("!@#"));
        // show(new Date());

    }

    static void show(String s){
        System.out.println(s);
    }

    static void show(StringBuilder s){
        System.out.println(s);
    }

    static void show(StringBuffer s){
        System.out.println(s);
    }
}
