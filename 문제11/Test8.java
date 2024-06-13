package test;

import java.util.*;
import java.util.stream.Collectors;

class Nation {
    private String name;
    private boolean isIsland;
    private int gdpRank;

    public Nation(String name, boolean isIsland, int gdpRank) {
        this.name = name;
        this.isIsland = isIsland;
        this.gdpRank = gdpRank;
    }

    public String getName() {
        return name;
    }

    public boolean isIsland() {
        return isIsland;
    }

    public int getGdpRank() {
        return gdpRank;
    }

    @Override
    public String toString() {
        return name;
    }

    public static List<Nation> nations = Arrays.asList(
            new Nation("ROK", false, 10),
            new Nation("USA", false, 1),
            new Nation("China", false, 2),
            new Nation("Morocco", false, 60),
            new Nation("United Kingdom", true, 7),
            new Nation("New Zealand", true, 50),
            new Nation("Philippines", true, 40),
            new Nation("Sri Lanka", true, 70)
    );
}

public class Test8 {
    public static void main(String[] args) {
        Map<String, Map<String, List<Nation>>> groupedNations = Nation.nations.stream()
                .collect(Collectors.groupingBy(
                        nation -> nation.isIsland() ? "ISLAND" : "LAND",
                        Collectors.groupingBy(
                                nation -> nation.getGdpRank() <= 12 ? "선진국" : "개도국"
                        )
                ));

        System.out.println(groupedNations);
    }
}