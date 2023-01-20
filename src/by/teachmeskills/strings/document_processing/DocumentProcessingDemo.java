package by.teachmeskills.strings.document_processing;
/*
    Написать программу со следующим функционалом:
        - На вход передать строку (будем считать, что это номер документа). Номер документа имеет формат
         xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.
        - Вывести на экран в одну строку два первых блока по 4 цифры.
        - Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
        - Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
        - Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре
        (реализовать с помощью класса StringBuilder).
        - Проверить содержит ли номер документа последовательность abc и вывести сообщение содержит или нет
        (причем, abc и ABC считается одинаковой последовательностью).
        - Проверить начинается ли номер документа с последовательности 555.
        - Проверить заканчивается ли номер документа на последовательность 1a2b.
        - Все эти методы реализовать в отдельном классе в статических методах, которые на вход
         (входным параметром) будут принимать вводимую на вход программы строку.
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DocumentProcessingDemo {
    public static void main(String[] args) {
        String testNameDocument = "5556-dye-0359-abc-1a2b";
        System.out.println(get4digit(testNameDocument));
        System.out.println(setCharsToAsterisks(testNameDocument));
        System.out.println(getAllCharsSet1(testNameDocument));
        checkStrForSeq(testNameDocument, "ABC");
        checkBeginningStr(testNameDocument, "555");
        checkEndingStr(testNameDocument, "1a2b");
    }


    public static String get4digit(String string) {
        Pattern pattern = Pattern.compile("\\d{4}");
        Matcher mat = pattern.matcher(string);
        String result = "";
        while (mat.find()) {
            result += mat.group() + " ";
        }
        return result;
    }

    public static String setCharsToAsterisks(String string) {
        String repString = "***";
        Pattern pattern = Pattern.compile("[a-z]{3}");
        Matcher mat = pattern.matcher(string);
        return mat.replaceAll(repString);
    }

    public static String getAllCharsSet1(String string) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher mat = pattern.matcher(string);
        String result = "";
        while (mat.find()) {
            result += mat.group().toLowerCase() + "/";
        }
        return result;
    }

    public static String getAllCharsSet2(String string) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher mat = pattern.matcher(string);
        String result = "";
        while (mat.find()) {
            result += mat.group().toLowerCase() + "/";
        }
        return result;
    }

    public static void checkStrForSeq(String string, String seq) {
        if (Pattern.compile(seq.toLowerCase()).matcher(string).find()) {
            System.out.println("The name " + string + " contains sequences: " + seq);
        } else {
            System.out.println("The name " + string + " doesn't contains sequences: " + seq);
        }
    }

    public static void checkBeginningStr(String string, String seq) {
        if (Pattern.compile("^" + seq).matcher(string).find()) {
            //if   (string.startsWith(seq)){
            System.out.println("The name " + string + " starts with a sequence: " + seq);
        } else {
            System.out.println("The name: " + string + " doesn't starts with a sequence: " + seq);
        }

    }

    public static void checkEndingStr(String string, String seq) {
        if (Pattern.compile(seq + "$").matcher(string).find()) {
            System.out.println("The name " + string + " ends with a sequence: " + seq);
        } else {
            System.out.println("The name " + string + " doesn't ends with a sequence: " + seq);
        }
    }


}
