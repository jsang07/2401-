package t;

class Car{
    private String color = "";

    private static int CarNum = 0;
    private static int RedCarNum = 0;

    public Car(String color){
        this.color = color;
        CarNum++;
        if(this.color.equals("red") || this.color.equals("RED")){
            RedCarNum++;
        }
    }

    public static int getNumOfCar(){
        return CarNum;
    }

    public static int getNumOfRedCar(){
        return RedCarNum;
    }
}

public class Test4 {
    public static void main(String[] args) {
        Car c1 = new Car("red");
        Car c2 = new Car("blue");
        Car c3 = new Car("RED");

        System.out.printf("자동차 수 : %d, 빨간색 자동차 수: %d", Car.getNumOfCar(), Car.getNumOfRedCar());
    }
}
