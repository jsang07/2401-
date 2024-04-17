package test2;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person("길동이", 22);
        Student student = new Student("황진이",23,100);
        ForeignStudent foreignStudent  = new ForeignStudent("Amy",30,200,"U.S.A");
        
        Person[] people = {person, student, foreignStudent};

        for (Person p : people) {
            p.show();
        }

    }
}
