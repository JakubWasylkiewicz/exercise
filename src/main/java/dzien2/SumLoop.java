package dzien2;
import java.util.Scanner;
public class SumLoop {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        int sum = 0;
        int number = -1;

        while (number != 0) {
            try {
                System.out.println(" Podaj liczbe (0 zakończy program): ");
                number = Integer.parseInt(skaner.nextLine());
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("To nie jest poprawna liczba!");
            }
        }
        System.out.println("Suma wynosi: " + sum);
    }
}
