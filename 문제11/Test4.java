package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Nation {
    private String name;
    private boolean isLand;

    public Nation(String name, boolean isLand) {
        this.name = name;
        this.isLand = isLand;
    }

    public String getName() {
        return name;
    }

    public boolean isLand() {
        return isLand;
    }

    public static List<Nation> nations = Arrays.asList(
            new Nation("대한민국", true),
            new Nation("미국", true),
            new Nation("일본", false),
            new Nation("프랑스", true),
            new Nation("영국", false),
            new Nation("독일", true)
    );
}

public class Test4 {
    public static void main(String[] args) {
        String result = Nation.nations.stream()
                .filter(Nation::isLand)
                .map(Nation::getName)
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}