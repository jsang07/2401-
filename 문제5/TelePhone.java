package test5;

public class TelePhone extends Phone{

    private String when;

    public TelePhone(String owner, String when) {
        super(owner);
        this.owner = owner;
        this.when = when;
    }

    public void autoAnswering(){
        System.out.println(owner+"가 없다." + when + " 전화 줄래.");
    }
}
