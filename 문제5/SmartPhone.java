package test5;

public class SmartPhone extends Phone{
    private String game;

    public SmartPhone(String owner, String game) {
        super(owner);
        this.owner = owner;
        this.game = game;
    }

    public void playGame(){
        System.out.println(owner+"가 " + game + " 게임을 하는 중이다.");
    }



}
