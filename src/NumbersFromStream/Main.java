package NumbersFromStream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Stream.iterate(8, number -> number + 1)
                .filter(number -> number > 100)
                .filter(number -> number % 5 == 0)
                .map(number -> number * 3)
                .limit(10)
                .collect(Collectors.toList());

        System.out.println(numbers);
    }
}
