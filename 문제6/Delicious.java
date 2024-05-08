package test.test2;

public interface Delicious extends Edible, Sweetable{
    @Override
    void eat();

    @Override
    void sweet();
}
