package dzien4.SprawdzanieHasla;

public class PasswordValidator implements Validator {
    @Override

    public void validate(String password) throws InvalidPasswordException {
        if (password.length() < 8) {
            throw new InvalidPasswordException("hasło musi mieć co najmniej 8 znaków. ");
        }
        System.out.println("hasło zaakceptowane");
    }
}
