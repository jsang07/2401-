package test.test6;

public class Student implements Human{
    private int age;

    public Student(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("도시락을 먹습니다.");
    }

    public void print() {
        System.out.println("학생입니다");
    }
}
