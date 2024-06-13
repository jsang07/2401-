package ts;

import java.util.Locale;
import java.util.stream.Stream;

public class SortedDemo {
    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("d2", "a2", "b1", "b3", "c");
        Stream<String> s2 = s1.sorted();
        s2.forEach(System.out::print);


        System.out.println("\n국가 이름 순서");
    }
}
