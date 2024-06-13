package test;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test3 {
    public static void main(String[] args) {
        String result = IntStream.rangeClosed(1, 10)
                .mapToObj(i -> "A" + i)
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}


