package test.test5;

public abstract class Controller {
    boolean power;

    public Controller(boolean power) {
        this.power = power;
    }

    abstract void show();

    abstract String getName();
}
