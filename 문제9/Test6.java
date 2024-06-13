package test;

import java.util.function.Supplier;
class Animal {
    public void sound() {
        System.out.println("ㅁㅁㄲㄲ ...");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("멍멍");
    }
}


public class Test6 {
    public static void soundAnimal(Supplier<Animal> s) {
        s.get().sound();
    }

    public static void main(String[] args) {
        Animal[] animalsList = { new Animal(), new Dog() };
        for (Animal animal : animalsList) {
            Supplier<Animal> dSupplier3 = () -> animal;
            soundAnimal(dSupplier3);
        }
    }
}
