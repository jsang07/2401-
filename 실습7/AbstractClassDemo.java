package test.chap07;

import java.awt.*;

public class AbstractClassDemo {
    public static void main(String[] args) {
        Circle c = new Circle(3);
        c.draw();
        System.out.println("원의 넓이는 " + c.findArea());

        Rectangle r = new Rectangle(3, 4);
        r.draw();
        System.out.println("원의 넓이는 " + r.findArea());
    }
}
