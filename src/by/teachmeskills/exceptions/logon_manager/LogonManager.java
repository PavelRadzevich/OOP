package by.teachmeskills.exceptions.logon_manager;

import java.util.regex.Pattern;

public final class LogonManager {
    static boolean getLogin(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {
        boolean result = false;
        if (login.length() >= 20 || login.contains(" ")) {
            throw new WrongLoginException("Wrong Login!", login);
        } else if (password.length() >= 20
                || !Pattern.compile("[0-9]]").matcher(password).find()
                || password.contains(" ")) {
            throw new WrongPasswordException("Wrong Password!", password);
        } else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Wrong Confirm Password!", confirmPassword);
        } else result = true;
        return result;
    }
}
