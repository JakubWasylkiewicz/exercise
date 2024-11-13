package dzien3;

public class SortowanieBabelkowe {
    public static void main(String[] args) {
        int[] liczby = {5,3,7,9,2};

        for (int i = 0; i < liczby.length - 1; i++) {
            for (int j = 0; j < liczby.length - 1; j++) {
                if (liczby[j] > liczby[j + 1]) {
                    int temp = liczby[j];
                    liczby[j] = liczby[j + 1];
                    liczby[j + 1] = temp;
                }
            }
        }

        System.out.println("Posortowana tablica:");

        for (int liczba : liczby) {
            System.out.println( liczba + " ");
        }
    }
}
