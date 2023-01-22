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

import static by.teachmeskills.strings.document_processing.DocumentProcessing.*;

public class DocumentProcessingDemo {
    public static void main(String[] args) {
        String testNameDocument = "5556-dye-0359-abc-1a2b";
        System.out.println(get4digit(testNameDocument));
        System.out.println(setCharsToAsterisks(testNameDocument));
        System.out.println(getAllCharsSet1(testNameDocument));
        System.out.println(getAllCharsSet2(testNameDocument));
        checkStrForSeq(testNameDocument, "ABD");
        checkBeginningStr(testNameDocument, "556");
        checkEndingStr(testNameDocument, "1a2c");
    }
}
