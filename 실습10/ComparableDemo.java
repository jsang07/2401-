package pa10;

import java.util.Arrays;

class Rectangle implements Comparable<Rectangle> {
    private int width, height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int findArea(){
        return width*height;
    }

    @Override
    public String toString() {
        return String.format("사강형[가로=%d, 세로=%d]",width, height);
    }

    @Override
    public int compareTo(Rectangle o) {
        return findArea() - o.findArea();
    }
}

public class ComparableDemo{
    public static void main(String[] args) {
        Rectangle[] rectangles = { new Rectangle(3,5), new Rectangle(2,10),
                new Rectangle(5,5), };

        Arrays.sort(rectangles);

        for (Rectangle r : rectangles) {
            System.out.println(r);
        }
    }
}
