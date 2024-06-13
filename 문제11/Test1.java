package test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("갈매기", "나비", "다람쥐", "라마");

        List<String> filteredWords = words.stream()
                .filter(word -> word.length() == 2)
                .collect(Collectors.toList());

        filteredWords.forEach(System.out::println);
    }
}