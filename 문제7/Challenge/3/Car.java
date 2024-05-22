package challenge3;

import java.util.Objects;

public class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }


    public String toString() {
        return "["+model+"]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model);
    }


}
