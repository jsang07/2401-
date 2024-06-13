package test;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test9 {
    public static void main(String[] args) {
        Stream<int[]> pythagoreanTriples = IntStream.rangeClosed(1, 100)
                .boxed()
                .flatMap(a -> IntStream.rangeClosed(a, 100)
                        .filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
                        .mapToObj(b -> new int[]{a, b, (int) Math.sqrt(a * a + b * b)})
                );

        pythagoreanTriples.limit(5)
                .forEach(triple -> System.out.printf("(%d, %d, %d)%n", triple[0], triple[1], triple[2]));
    }
}
