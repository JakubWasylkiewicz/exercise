package dzien7;
import java.util.Scanner;
public class SumaLiczbParzystych {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę n (musi być większa niż zero): ");
        int n = scanner.nextInt();

        if (n <= 0 ) {
            System.out.println("n nie może równać się zero");
            return;
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("suma luczb parzystych wynosi " + sum);
    }
}
