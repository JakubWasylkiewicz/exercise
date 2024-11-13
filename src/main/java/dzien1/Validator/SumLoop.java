package dzien1.Validator;

import java.util.Scanner;

public class SumLoop {
    public static void main(String[] args) {
        Scanner skaner = new Scanner(System.in);
        int sum = 0;
        int number = -1;
        while (number != 0) {
            try {
                System.out.println("Podaj liczbę (0 aby zkaończyć): ");
                number = Integer.parseInt(skaner.nextLine());
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Podałeś nieprawidłową liczbę...brawo...przecież to nie jest liczba..");
            }
        }
        System.out.println("Suma wynosi " + sum);
    }
}
