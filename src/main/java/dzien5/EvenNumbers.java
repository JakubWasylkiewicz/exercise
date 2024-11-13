package dzien5;

public class EvenNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Suma liczb parzystych wynosi " + sum);
    }
}
