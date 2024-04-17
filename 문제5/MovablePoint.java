package test3;

public class MovablePoint extends Point{
    private int xSpeed;
    private int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString(){
        super.toString();
        System.out.println("이동속도 : " + String.valueOf(xSpeed) + ", " + String.valueOf(ySpeed));
        return null;
    }
}
