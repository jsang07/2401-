package test5;

public class PhoneTest {
    public static void main(String[] args) {
        Phone[] phones = { new Phone("황진이"), new TelePhone("길동이", "내일"),
                new SmartPhone("민국이", "갤러그")};

        for (Phone p : phones) {
            if(p.getClass() == Phone.class){
                p.talk();
            }if(p.getClass() == TelePhone.class){
                ((TelePhone) p).autoAnswering();
            }
            if(p.getClass() == SmartPhone.class){
                ((SmartPhone) p).playGame();
            }

        }
    }
}

