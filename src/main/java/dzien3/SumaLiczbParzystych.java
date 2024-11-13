package dzien3;

public class SumaLiczbParzystych {
    public static void main(String[] args) {
        int sum = 0;
        for (int i =1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Suma liczb parzystych od 1 do 100 wynosi: " + sum);
    }
}
