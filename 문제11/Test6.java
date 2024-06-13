package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Population {
    private String city;
    private double population;

    public Population(String city, double population) {
        this.city = city;
        this.population = population;
    }

    public String getCity() {
        return city;
    }

    public double getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return city + "(" + population + ")";
    }
}

public class Test6 {
    public static void main(String[] args) {

        List<String> cities = Arrays.asList("서울", "워싱턴", "베이징", "파리", "마드리드", "런던");

        List<Double> populations = Arrays.asList(973.7, 693.2, 2115.0, 224.4, 326.5, 853.9);

        Stream<Population> populationStream = IntStream.range(0, cities.size())
                .mapToObj(i -> new Population(cities.get(i), populations.get(i)));

        List<Population> filteredPopulations = populationStream.filter(p -> p.getPopulation() > 300.0)
                .collect(Collectors.toList());

        filteredPopulations.forEach(System.out::println);
    }
}

