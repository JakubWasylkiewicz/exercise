package dzien2.SprawdzamHaslo;

public class PasswordValidator {
    public static void main(String[] args) {
        String haslo = "qwe1234";
        Validator validator = (String pwd) -> {
            if (pwd.length() < 8) {
                throw new Exception("Hasło musi mieć co najmniej 6 znaków");
            }
        };
        try {
            validator.validate(haslo);
            System.out.println("Hasło jest poprawne");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
