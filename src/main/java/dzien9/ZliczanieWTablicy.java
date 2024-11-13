package dzien9;
import java.util.Scanner;
import java.util.Random;
public class ZliczanieWTablicy {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        Random random = new Random();
        System.out.print("Podaj wielkość tablicy, a ja wypełnię ją liczbami: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(100) +1;
        }

        System.out.println("Podaj liczbę do zliczenia: ");
        int targetNumber = scanner.nextInt();

        int count = 0;

        for (int number : numbers) {
            if (number == targetNumber) {
                count++;
            }
        }
        System.out.println("Liczba " + targetNumber + " występuje w tablicy " + count + " razy.");
        scanner.close();
    }
}
