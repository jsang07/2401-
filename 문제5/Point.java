package test3;

public class Point {
    private int x;
    private int y;

    public Point(int x,int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        System.out.println("좌표 : " + String.valueOf(x) + ", " + String.valueOf(y));
        return null;
    }
}
