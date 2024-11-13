package dzien10;
import java.util.Scanner;
import java.util.Random;
public class ImionaPsow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] przymiotniki = {"mały", "duży", "puszysty", "kochany", "słodki", "szybki"};
        String[] rzeczowniki = {"Pimpek", "Reksio", "Łatka", "Loczek", "Przytulas", "Chichotek"};

        String wybor;
        do {
            String przymiotnik = przymiotniki[random.nextInt(przymiotniki.length)];
            String rzeczownik = rzeczowniki[random.nextInt(rzeczowniki.length)];
            System.out.println("Twoje imię dla zwierzaka to: " + przymiotnik + " " + rzeczownik);
            System.out.print("Czy chcesz inne imię? (tak/nie): ");
            wybor = scanner.nextLine();

        } while (wybor.equalsIgnoreCase("tak"));

        System.out.println("Dziękujemy za skorzystanie z generatora imion!");
        scanner.close();

    }
}
