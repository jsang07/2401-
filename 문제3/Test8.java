package t;

class Dice{
    private int face = 6;
    public double roll(){
        return Math.random();
    }
}

public class Test8 {
    public static void main(String[] args) {
        Dice d = new Dice();
        System.out.println("주사위의 숫자 : " + d.roll());
    }
}
