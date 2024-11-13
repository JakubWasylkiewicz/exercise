package dzien4.SprawdzanieHasla;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner skaner = new Scanner(System.in);
        System.out.print("Podaj Hasło: ");
        String password = skaner.nextLine();

        PasswordValidator passwordValidator = new PasswordValidator();

        try {
            passwordValidator.validate(password);
        } catch (InvalidPasswordException e) {
            System.out.println("błąd: " + e.getMessage());
        }
    }
}
