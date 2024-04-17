package test6;

public class Vehicle {
    String color;
    int speed;

    public Vehicle(String color, int speed){
        this.color = color;
        this.speed = speed;
    }

    public void show(){
        System.out.println(color + " 자동차의 속도 : " + speed);
    }

}
