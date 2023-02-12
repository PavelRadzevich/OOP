package by.teachmeskills.exceptions.logon_manager.exception;

public class WrongPasswordException extends Exception {
    private String password;

    public WrongPasswordException() {
    }

    public WrongPasswordException(String message, String password) {
        super(message);
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "WrongPasswordException{" +
                "password='" + password + '\'' +
                '}';
    }
}
