package dzien3;
import java.util.Random;
import java.util.Scanner;
public class ZgadnijLiczbe {
    public static void main(String[] args) {
        Random random = new Random();
        int sekretnyNumer = random.nextInt(10) + 1;
        int zgadnij;
        Scanner skaner = new Scanner(System.in);
        do {
            System.out.println("Zgadnij liczbę od 1 do 10: ");
            zgadnij = skaner.nextInt();
        } while (zgadnij != sekretnyNumer);
        System.out.println("Gratulacje, zgadłeś!");
    }
}
