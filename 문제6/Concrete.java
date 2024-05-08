package test.test1;

public class Concrete extends Abstract{
    private int j;
    private int i;

    public Concrete(int i, int j) {
        super(i);
        this.i = i;
        this.j = j;
    }

    @Override
    public void show(){
        System.out.println("i = " + i + ", j = " + j);
    }
}
