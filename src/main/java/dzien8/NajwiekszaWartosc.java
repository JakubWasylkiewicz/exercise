package dzien8;
import java.util.Random;
import java.util.Scanner;

public class NajwiekszaWartosc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Podaj wielkość tablicy, a ja wypełnię ją liczbami: ");
        int n = scanner.nextInt();
        int[] liczby = new int[n];

        for (int i = 0; i < liczby.length; i++){
            liczby[i] = random.nextInt(1000) +1;
        }
        System.out.print("Wygenerowana tablica: ");
        for (int num : liczby) {
            System.out.print(num + " ");
        }
        System.out.println();

        int max = liczby[0];

        for (int i = 1; i < liczby.length; i++){
            if (liczby[i] > max){
                max = liczby[i];
            }
        }
        System.out.println("Największa liczba w tablicy to " + max);

    }
}
