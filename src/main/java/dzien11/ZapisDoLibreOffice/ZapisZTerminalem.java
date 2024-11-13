package dzien11.ZapisDoLibreOffice;

import org.jopendocument.dom.spreadsheet.Sheet;
import org.jopendocument.dom.spreadsheet.SpreadSheet;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ZapisZTerminalem {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    try {
        // Tworzymy nowy plik .ods
        File plik = new File("dane.ods");
        SpreadSheet dokument = SpreadSheet.create(1, 100, 10); // Jeden arkusz, 10 wierszy i 10 kolumn

        // Pobieramy pierwszy arkusz z dokumentu
        Sheet arkusz = dokument.getSheet(0);

        // Wpisujemy nagłówki kolumn
        arkusz.setValueAt("Imię", 0, 0);
        arkusz.setValueAt("Nazwisko", 1, 0);
        arkusz.setValueAt("Email",2, 0);

        int wiersz = 1;
        boolean kontynuuj = true;

        while (kontynuuj) {

            // Pobieramy dane od użytkownika
            System.out.print("Wprowadź imię: ");
            String imie = scanner.nextLine();

            System.out.print("Wprowadź nazwisko: ");
            String nazwisko = scanner.nextLine();

            System.out.print("Wprowadż mail: ");
            String email = scanner.nextLine();

            // Wpisujemy dane do arkusza
            arkusz.setValueAt(imie,0, wiersz);
            arkusz.setValueAt(nazwisko,1, wiersz);
            arkusz.setValueAt(email,2, wiersz );

            wiersz++;

            System.out.println("chcesz dodać kolejny wiersz? (tak/nie): ");
            String odpowiedz = scanner.nextLine();
            kontynuuj = odpowiedz.equalsIgnoreCase("tak");

        }

        // Zapisujemy dokument na dysk
        dokument.saveAs(plik);

        System.out.println("Plik .ods zapisany pomyślnie!");
    } catch (IOException e) {
        System.err.println("Wystąpił błąd podczas zapisu pliku .ods: " + e.getMessage());
    } finally {
        scanner.close();
    }
}
}
