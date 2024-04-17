package test2;

public class ForeignStudent extends Student{

    String nation;

    public ForeignStudent(String name, int age, int stuNum, String nation) {
        super(name, age, stuNum);
        this.name = name;
        this.age = age;
        this.stuNum = stuNum;
        this.nation = nation;
    }

    @Override
    public void show() {
        System.out.println("학생[이름 : " + name + ", 나이 : " + age + ", 학번 : " + stuNum + ", 학번 : " + nation + "]");
    }
}
