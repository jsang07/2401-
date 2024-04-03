package test;

import java.lang.reflect.Array;

public class Test2 {
    public static void main(String[] args) {

        System.out.println(sumExceptFirst(1, 2, 3, 4));
        int[] arr = {2,3};
        System.out.println(sumExceptFirst(1, arr));
        System.out.println(sumExceptFirst(1, 2, 3, 4, 5));
    }

    static int sumExceptFirst(int... v){
        int sum = 0;
        for (int i =1 ; i < v.length; i++) {
            sum += v[i];
        }
        return sum;
    }

    static int sumExceptFirst(int v, int arr[]){
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
}
