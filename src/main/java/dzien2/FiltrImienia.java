package dzien2;
import java.util.Arrays;
import java.util.List;

public class FiltrImienia {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ania", "Kubuś", "Wojtek", "John", "Tom");

        try {
            if(names.isEmpty()) {
                throw new Exception("lista imion jest pusta");
            }
            names.stream()
                    .filter(name ->name.length() > 4)
                    .forEach(System.out::println);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
