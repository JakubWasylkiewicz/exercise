package dzien8;
import java.util.Scanner;
public class SumN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj wartość liczby n: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n ; i++){
            sum += i;

        }
        System.out.println("Suma wynosi " + sum);
    }
}
