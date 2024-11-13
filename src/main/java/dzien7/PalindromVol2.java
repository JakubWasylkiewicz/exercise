package dzien7;
import java.util.Scanner;
import java.util.Random;
public class PalindromVol2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość tablicy: ");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Długość tablicy nie może równać się zero");
            return;
        }
        int[] tablica = new int[size];
        System.out.println("Tablica wypełania się automatycznie: ");


        for (int i = 0; i < tablica.length; i++){
            tablica[i] = random.nextInt(100);
        }
        for (int number : tablica){
            System.out.println(number + " ");
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
