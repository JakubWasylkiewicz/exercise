package dzien2;

public class KalkulatorProsty {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 15 ;i++ ) {
            sum += i;
            if (i >10) {
                System.out.println("Liczba " + i + " jest większa niż 10");
            }
        }
        System.out.println("Suma wynosi: "+sum);
    }
}
