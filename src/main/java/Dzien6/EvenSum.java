package Dzien6;
import java.util.Scanner;
public class EvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę n: ");

        int n = scanner.nextInt();

        if ( n <= 0 ){
            System.out.println("Liczba musi być większa od 0!");
            return;

        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Suma liczb parzystych od 1 do " + n + " = " + sum);
    }
}
