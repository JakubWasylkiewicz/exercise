package dzien1.Validator;

public class kalkulatorProsty {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++){
            sum += i;
            if (i > 5) {
                System.out.println("Liczba " + i + "jest większa niż 5");
            }
        }
        System.out.println("Suma wynosi " + sum);
    }
}
