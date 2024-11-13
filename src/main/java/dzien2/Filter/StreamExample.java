package dzien2.Filter;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Filter greaterThanFive = (int number) -> number > 5;

        numbers.stream()
                .filter(greaterThanFive::test)
                .forEach(System.out::println);
    }
}
