package dzien10;
import java.util.Random;
import java.util.Scanner;

public class LosowaLiczba {
    public static void main(String[] args) {
        Random random = new Random();

        int liczba = random.nextInt(10) + 1;
        int strzal;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Zgadnil liczbe");
            strzal = scanner.nextInt();
        } while (strzal != liczba);
            System.out.println("Zgadłeś!");

    }
}
