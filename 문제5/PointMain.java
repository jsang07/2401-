package test3;

public class PointMain {
    public static void main(String[] args) {
        Point point = new Point(5,5);
        point.toString();

        MovablePoint movablePoint = new MovablePoint(3,3,10, 10);
        movablePoint.toString();
    }
}
