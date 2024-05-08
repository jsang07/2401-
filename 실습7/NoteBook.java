package test.chap07;

public class NoteBook extends Computer implements Portable{
    @Override
    public void inMyBag() {
        System.out.println("노트북은 가방에 있다.");
    }

    public void turnOn(){
        System.out.println("노트북을 켠다");
    }
    public void turnOff(){
        System.out.println("노트북을 끈다");
    }

    public static void main(String[] args) {
        NoteBook n = new NoteBook();
        n.turnOn();
        n.turnOff();
        n.inMyBag();
    }

}
