package dzien4;
import java.util.Scanner;

public class LoopSum {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        int sum = 0;
        int liczba = -1;

        while (liczba != 0 ) {
            try {
                System.out.println("Podaj liczbę (zero kończy program): ");
                liczba = Integer.parseInt(skaner.nextLine());
                sum += liczba;
            } catch (NumberFormatException e) {
                System.out.println("To nie liczba");
            }
        }
        System.out.println("Suma wynosi " + sum);
    }
}
