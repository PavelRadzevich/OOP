package by.teachmeskills.exceptions.logon_manager;

public class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
        super(message);
    }
}
