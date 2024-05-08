package test.test5;

public class Tv extends Controller{


    public Tv(boolean power) {
        super(power);
    }

    @Override
    void show() {
        if(!power){
            System.out.println(getName()+ "가 꺼졌습니다");
        } else System.out.println(getName() + "가 켜졌습니다");

    }

    @Override
    String getName() {
        return "TV";
    }
}
