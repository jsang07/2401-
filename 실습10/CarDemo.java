package pa10;

import java.util.*;

public class CarDemo {
    public static void main(String[] args) {
        List<Car> diselCars = findCars(Car.cars, c -> !c.isGasoline());
        System.out.println("disel car = " + diselCars);

        List<Car> oldCars = findCars(Car.cars, c -> c.getAge() > 10);
        System.out.println("old car = " + oldCars);

        List<Car> oldDiselCars = findCars(Car.cars, c -> c.getAge() > 10 && !c.isGasoline());
        System.out.println("oldDiselCars car = " + oldDiselCars);

        System.out.println("Disel Car = ");
        printCars(diselCars, c -> System.out.printf("%s(%d)", c.getModel(), c.getAge()));
        System.out.println("old Car = ");
        printCars(diselCars, c -> System.out.printf("%s(%d %d)", c.getModel(), c.getAge(), c.getMileage() ));
    }

    public static List<Car> findCars(List<Car> all, CarPredicate cp){
        List<Car> result = new ArrayList<>();

        for (Car car : all) {
            if (cp.test(car))
                result.add(car);
        }
        return result;
    }

    public static void printCars(List<Car> all, CarConsumer cc){
        for (Car car : all) {
            cc.accept(car);
        }
    }
}
