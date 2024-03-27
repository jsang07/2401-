package t;

class Line {
    private int length;

    public Line(int length){
        this.length = length;
    }

    public boolean isSameLine(Line otherLine){
        return this.length == otherLine.length;
    }
}

public class Test5 {
    public static void main(String[] args) {
        Line a = new Line(1);
        Line b = new Line(1);

        System.out.println(a.isSameLine(b));
        System.out.println(a==b);
    }
}
