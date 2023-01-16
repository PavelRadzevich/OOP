package by.teachmeskills.exceptions.logon_manager;

import java.util.regex.Pattern;

public final class LogonManager {
    private String login;
    private String password;
    private String confirmPassword;

    static boolean getLogin(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        boolean result = false;
        if (login.length() >= 20 || Pattern.matches("\\s+", login)) {
            throw new WrongLoginException("Wrong Login!");
        }
        if (password.length() >= 20
                || Pattern.matches("\\s+", password)
                || (!password.equals(confirmPassword))) {
            throw new WrongPasswordException("Wrong Password!");
        }
        return result;
    }
}
