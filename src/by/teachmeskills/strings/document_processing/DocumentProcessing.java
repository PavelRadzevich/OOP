package by.teachmeskills.strings.document_processing;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class DocumentProcessing {
    public static String get4digit(String string) {
        Pattern pattern = Pattern.compile("\\d{4}");
        Matcher mat = pattern.matcher(string);
        StringBuilder result = new StringBuilder();
        while (mat.find()) {
            result.append(mat.group()).append(" ");
        }
        return result.toString();
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
        StringBuilder stringB = new StringBuilder();

        while (mat.find()) {
            stringB.append(mat.group().toLowerCase()).append("/");
        }
        stringB.replace(stringB.length() - 1, stringB.length(), "");
        return stringB.toString();
    }

    public static String getAllCharsSet2(String string) {
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher mat = pattern.matcher(string);
        StringBuilder stringB = new StringBuilder();
        stringB.append("\"Letters:");
        while (mat.find()) {
            stringB.append(mat.group().toLowerCase()).append("/");
        }
        stringB.replace(stringB.length() - 1, stringB.length(), "\"");
        return stringB.toString();
    }

    public static void checkStrForSeq(String string, String seq) {
        //if (Pattern.compile(seq.toLowerCase()).matcher(string).find()) {
        if (string.contains(seq.toLowerCase())) {
            System.out.println("The name " + string + " contains sequences: " + seq);
        } else {
            System.out.println("The name " + string + " doesn't contain sequences: " + seq);
        }
    }

    public static void checkBeginningStr(String string, String seq) {
        //if (Pattern.compile("^" + seq).matcher(string).find()) {
        if (string.startsWith(seq)) {
            System.out.println("The name " + string + " starts with a sequence: " + seq);
        } else {
            System.out.println("The name: " + string + " doesn't start with a sequence: " + seq);
        }

    }

    public static void checkEndingStr(String string, String seq) {
        //if (Pattern.compile(seq + "$").matcher(string).find()) {
        if (string.endsWith(seq)) {
            System.out.println("The name " + string + " ends with a sequence: " + seq);
        } else {
            System.out.println("The name " + string + " doesn't end with a sequence: " + seq);
        }
    }
}
