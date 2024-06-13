package pa10;
import java.util.*;
public class Car {
    private String model; private boolean gasoline;
    private int age; private int mileage;

    public Car(String model, boolean gasoline, int age, int mileage) {
        this.model = model;
        this.gasoline = gasoline;
        this.age = age;
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }


    public boolean isGasoline() {
        return gasoline;
    }


    public int getAge() {
        return age;
    }

    public int getMileage() {
        return mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", gasoline=" + gasoline +
                ", age=" + age +
                ", mileage=" + mileage +
                '}';
    }

    public static final List<Car> cars = Arrays.asList(
      new Car("소나타", true, 18, 210000),
      new Car("그랜저", true, 21, 210000),
      new Car("아반테", true, 12, 210000),
      new Car("그랜저", false, 18, 210000),
      new Car("쏘렌토", true, 15, 210000),
      new Car("코란도", false, 6, 210000),
      new Car("싼타페", false, 10, 210000),
      new Car("소나타", false, 1, 210000),
      new Car("아반테", true, 2, 210000),
      new Car("에쿠스", true, 5, 210000)
    );
}
