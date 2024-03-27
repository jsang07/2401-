package t;

class Member{
    private String name;
    private String id;
    private String passWord;
    private int age;
    public Member(String name, String id, String passWord, int age){
        this.name = name;
        this.id = id;
        this.passWord = passWord;
        this.age = age;
    }
}
public class Test3 {
    public static void main(String[] args) {
        Member member = new Member("name", "id", "password", 20);
    }
}
