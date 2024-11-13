package dzien3;

public class WypisywanieLiczbZTablicy {
    public static void main(String[] args) {
        int[] liczby = {10, 20, 30, 40,50};

        for (int i = 0; i < liczby.length; i++) {
            System.out.println("Liczba " + i + ":" + liczby[i]);
        }
    }
}
