package abstractChall;

public class Bird extends Countable {


    public Bird(String name, int num) {
        super(name, num);
    }


    void fly(){
        System.out.println(num + "마리 "+ name +"가 날아간다");
    }

    @Override
    public void count() {
        System.out.println(name+"가 2마리 있다.");
    }
}
