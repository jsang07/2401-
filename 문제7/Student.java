package test.test2;

public class Student {
    private String name;

    public Student(String name){
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "학생[" + name + "]";
    }
}
