package Dzien6;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
public class Polindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj rozmiar tablicy: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("musi być większa niż 0.");
            return;
        }
        int[] tablica = new int[size];
        System.out.println("podaj liczby do zapełnienia tablicy : ");

        for (int i = 0; i < size; i++) {
            System.out.println("Element " + (i + 1) + ": ");
            tablica[i] = scanner.nextInt();
        }
        if( isPalindrome(tablica)) {
            System.out.println("Tablica jest palindromem");
        } else{
            System.out.println("Tablica nie jest palindromem");
        }

    }
    public static boolean isPalindrome(int[] tablica) {
        int length = tablica.length;
        for (int i = 0; i < length / 2; i++){
            if (tablica[i] != tablica[length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
