package by.teachmeskills.exceptions.logon_manager;
/*
    Создать класс, в котором будет статический метод.
    - Этот метод принимает на вход три параметра: Login, Password, confirmPassword.
    - Все поля имеют тип данных String.
    - Длина login должна быть меньше 20 символов и не должен содержать пробелы. Если login не соответствует
    этим требованиям, необходимо выбросить WrongLoginException.
    - Длина password должна быть меньше 20 символов, не должен содержать пробел и должен содержать хотя
    бы одну цифру. Также password и confirmPassword должны быть равны. Если password не соответствует этим
    требованиям, необходимо выбросить WrongPasswordException. WrongPasswordException и WrongLoginException -
    пользовательские классы исключения с двумя конструкторами – один по умолчанию, второй принимает сообщение
    исключения и передает его в конструктор класса Exception.
    - Метод возвращает true, если значения верны или false в другом случае.
 */

import by.teachmeskills.exceptions.logon_manager.exception.WrongLoginException;
import by.teachmeskills.exceptions.logon_manager.exception.WrongPasswordException;

import java.util.Scanner;

import static by.teachmeskills.exceptions.logon_manager.LogonManager.getLogin;

public class LogonManagerDemo {
    public static void main(String[] args) {
        final String HELLO_MESSAGE = "Input Login and Password\n" +
                "Login < 20 characters without spaces.\n" +
                "Password < 20 characters without spaces and must contain at least 1 number.";
        final String WELCOME = "WELCOME";
        final String LOGIN = "INPUT LOGIN";
        final String PASSWORD = "INPUT PASSWORD";
        final String RE_PASSWORD = "CONFIRM PASSWORD";
        String login, password, confirmPassword;
        boolean result = false;

        System.out.println(HELLO_MESSAGE);
        System.out.println(LOGIN);
        Scanner sc = new Scanner(System.in);
        login = sc.nextLine();
        System.out.println(PASSWORD);
        password = sc.nextLine();
        System.out.println(RE_PASSWORD);
        confirmPassword = sc.nextLine();

        try {
            result = getLogin(login, password, confirmPassword);
        } catch (WrongPasswordException ex) {
            System.out.println(ex + " " + ex.getPassword());
        } catch (WrongLoginException ex) {
            System.out.println(ex + " " + ex.getLogin());
        }
        if (result) {
            System.out.println(WELCOME);
        }
    }
}
