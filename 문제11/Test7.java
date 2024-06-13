package test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test7 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("민국", "지우", "하준", "지우", "하준", "지우");

        Map<String, Long> frequencyMap = names.stream()
                .collect(Collectors.groupingBy(name -> name, Collectors.counting()));

        System.out.println(frequencyMap);
    }
}
