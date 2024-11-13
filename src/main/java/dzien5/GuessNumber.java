package dzien5;
import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(10) + 1;
        int guess;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Zgadnij liczbę od 1 do 10: ");
            guess = scanner.nextInt();
        } while (guess != secretNumber);

        System.out.println("Zgadłeś, gratulacje!");
    }
}
