package dzien11.ZapisDoLibreOffice;
import org.jopendocument.dom.spreadsheet.Sheet;
import org.jopendocument.dom.spreadsheet.SpreadSheet;
import java.io.File;
import java.io.IOException;

public class ZapisDanychODS {
    public static void main(String[] args) {
        try {
            //nowy plik .ods
            File plik = new File("dane.ods");
            SpreadSheet dokument = SpreadSheet.create(1, 10, 10); //tu jeden arkusz 10 na 10

            Sheet arkusz = dokument.getSheet(0); //pobieranie arkusza

            arkusz.setValueAt("Name", 0, 0);
            arkusz.setValueAt("Surname", 0, 1);
            arkusz.setValueAt("Jakub", 1, 0);
            arkusz.setValueAt("Wasylkiewicz", 1,1); //Wpisywanie danych

            dokument.saveAs(plik); //zapis

            System.out.println("Plik .ods zapisany");
        } catch (Exception e) {
            System.err.println("Błąd zapisu pliku .ods: " + e.getMessage());
        }
    }
}
