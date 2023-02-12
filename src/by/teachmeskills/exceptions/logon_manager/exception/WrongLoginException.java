package by.teachmeskills.exceptions.logon_manager.exception;

public class WrongLoginException extends Exception {
    private String login;

    public WrongLoginException() {
    }

    public WrongLoginException(String message, String login) {
        super(message);
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "WrongLoginException{" +
                "login='" + login + '\'' +
                '}';
    }
}
