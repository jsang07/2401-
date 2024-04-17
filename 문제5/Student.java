package test2;

public class Student extends Person{
    int stuNum;

    public Student(String name, int age, int stuNum) {
        super(name, age);
        this.name = name;
        this.age = age;
        this.stuNum = stuNum;
    }

    @Override
    public void show(){
        System.out.println("학생[이름 : " + name + ", 나이 : " + age + ", 학번 : " + stuNum + "]");
    }
}
