package dzien4.SprawdzanieHasla;

import javax.xml.validation.Validator;

public class InvalidPasswordException extends Exception {
    public InvalidPasswordException(String message) {
        super(message);
    }
}
