package dzien1.Validator;

public class PasswordValidator {
    public static void main(String[] args) {
        String password = "ab123";

        Validator validator = (String pwd) -> {
            if (pwd.length() < 6) {
                throw  new Exception("Hasło musi mieć przynajmniej 13 znaków...");
            }
        };
        try {
            validator.validate(password);
            System.out.println("Dobre hasło, brawo!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
