package dzien8;

public class ReverseArray {
    public static void main(String[] args) {
        int[] tablica = {1, 2, 3, 4, 5};
        System.out.println("Orginalna tablica: " + tablica);

        for (int tab : tablica){
            System.out.println( tab + " ");
        }
        System.out.println();

        int start = 0;
        int end = tablica.length -1;

        //zmieniamy elementy

        while (start < end) {
            int temp = tablica[start];
            tablica[start] = tablica[end];
            tablica[end] = temp;
            //przesunięcie wskazników

            start++;
            end--;
        }
        System.out.println("Odwrócona tablica: ");
        for (int tab : tablica) {
            System.out.println(tab + " ");
        }
    }
}
