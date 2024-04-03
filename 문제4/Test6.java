package test;

import java.util.Arrays;

public class Test6 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int[] revArr = reverse(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(revArr));
    }

    public static int[] reverse(int[] org){
        int[] revArr = new int[5];
        for (int i = org.length - 1, j = 0; i >= 0; i--, j++){
            revArr[j] = org[i];
        }
        return revArr;
    }
}
