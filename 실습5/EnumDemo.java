package string;

enum Gender {MALE,FEMALE}

public class EnumDemo {
    public static void main(String[] args) {
        Gender gender = Gender.FEMALE;
        if(gender == Gender.MALE)
            System.out.println(Gender.MALE + "는 병역 의무가 있다.");
        else
            System.out.println(Gender.FEMALE + "은 병역 의무가 없다.");
    }
}
