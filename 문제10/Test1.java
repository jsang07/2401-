package test;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> animal = new ArrayList<>();

        animal.add("갈매기");
        animal.add("나비");
        animal.add("다람쥐");
        animal.add("라마");

        for(String animals : animal)
            if(animals.length()==2)
                System.out.println(animals);
    }
}