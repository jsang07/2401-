package test;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Test3 {
    public static void main(String[] args) {
        String s = "of the people, by the people, for the people";
        try {
            showTokens(s, ", ");
        }catch (NoSuchElementException e){
            System.out.println("끝");
        }
    }
    static void showTokens(String s, String d) {
        StringTokenizer st = new StringTokenizer(s, d);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }


}
