package test.test4;

import java.util.Random;

public class Dice {
    private int val;

    Random r = new Random();

    public int roll(){
        val = r.nextInt(1,7);
        return val;
    }
}
