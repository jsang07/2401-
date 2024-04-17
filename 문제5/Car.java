package test6;

public class Car extends Vehicle{
    int displacement;
    int gears;

    public Car(String color, int speed, int displacement, int gears) {
        super(color, speed);
        this.color = color;
        this.speed = speed;
        this.displacement = displacement;
        this.gears = gears;
    }

    @Override
    public void show() {
        System.out.println(color + " 자동차의 속도 : " + speed + ", 배기량 : " + displacement + ", 기어 단수 : " + gears);
    }
}
