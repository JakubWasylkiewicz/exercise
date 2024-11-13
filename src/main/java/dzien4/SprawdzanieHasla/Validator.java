package dzien4.SprawdzanieHasla;

public interface Validator {
    void validate(String password) throws InvalidPasswordException;
}
