package test;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.OptionalDouble;

public class Test5 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

        OptionalDouble average = stream.mapToInt(Integer::intValue).average();
        average.ifPresent(avg -> System.out.println("원소에 대한 평균: " + avg));

        stream = Stream.of(1, 2, 3, 4, 5);

        OptionalDouble squareAverage = stream.mapToInt(i -> i * i).average();
        squareAverage.ifPresent(avg -> System.out.println("원소의 제곱 값에 대한 평균: " + avg));

        stream = Stream.of(1, 2, 3, 4, 5);

        String joined = stream.map(String::valueOf).collect(Collectors.joining("-"));
        System.out.println("원소를 하이픈('-')으로 연결한 문자열: " + joined);
    }
}
