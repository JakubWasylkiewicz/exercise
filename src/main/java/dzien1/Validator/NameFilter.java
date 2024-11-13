package dzien1.Validator;

import java.util.Arrays;
import java.util.List;

public class NameFilter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Anna", "Kuba", "Michał", "Antek");
        try {
            if (names.isEmpty()){
                throw new Exception("Lista imion jest pusta!");

            }
            names.stream()
                    .filter(name -> name.length() > 3)
                    .forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
