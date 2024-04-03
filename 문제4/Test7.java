package test;

import java.util.Arrays;

public class Test7 {
    public static void main(String[] args) {
        int[] a ={3,2,4,1,5};
        int[] b ={3,2,4,1};
        int[] c ={3,2,4,1,5};
        int[] d ={2,7,1,8,2};

        System.out.println(arrSame(a,c));
    }
    public static boolean arrSame(int[] a, int[]b){
        return Arrays.equals(a,b);
    }
}
