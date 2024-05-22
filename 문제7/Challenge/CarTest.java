package challenge;

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car("그랜저");
        Car yourCar = new Car("그랜저");

        if(!myCar.equals(yourCar)){
            System.out.println("내 자동차는 " + myCar.toString() + ", 너 자동차는 " + yourCar.toString() + "로 모델이 다르다.");
        }
    }
}
