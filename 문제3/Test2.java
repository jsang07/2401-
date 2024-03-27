package t;

class Triangle2{
    private double line;
    private double height;

    public Triangle2(double line, double height){
        this.line = line;
        this.height = height;
    }
    public double findArea(){
        return line * height / 2;
    }

    public boolean isSameArea(Triangle2 otherTriangle) {
        return this.findArea() == otherTriangle.findArea();
    }

}

public class Test2 {
    public static void main(String[] args) {
        Triangle2 t1 = new Triangle2(10.0, 5.0);
        Triangle2 t2 = new Triangle2(5.0, 10.0);
        Triangle2 t3 = new Triangle2(8.0, 8.0);

        System.out.println(t1.isSameArea(t2));
        System.out.println(t1.isSameArea(t3));
    }
}
