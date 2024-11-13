package Dzien6;
import java.util.Scanner;

public class SredniaOcen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę uczniów: ");
        int liczbaStudentow = scanner.nextInt();

        if (liczbaStudentow <= 0) {
            System.out.println("za mała ilość studentów");
            return;
        }
        double[] oceny = new double[liczbaStudentow];
        double sum = 0;
        for (int i = 0; i < liczbaStudentow; i++){
            System.out.println("podaj ocenę ucznia " + (i + 1) + ": ");
            oceny[i] = scanner.nextDouble();
            sum += oceny[i];
        }
        double srednia = sum / liczbaStudentow;
        System.out.println("Średnia ocen wynosi: "+ srednia);

        int powyzejSredniej = 0;
        for (double ocena :oceny) {
            if (ocena > srednia){
                powyzejSredniej++;
            }
        }
        System.out.println("Liczba ocen powyżej średniej: " + powyzejSredniej);
    }
}
