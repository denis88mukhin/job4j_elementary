package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid = true;
        if (name.isEmpty() || isUpperLatinLetter(name.codePointAt(0)) || Character.isDigit(name.codePointAt(0))) {
            valid = false;
        } else {
            for (int i = 1; i < name.length(); i++) {
                int code = name.codePointAt(i);
                if (!isUpperLatinLetter(code) && !isLowerLatinLetter(code) && !isSpecialSymbol(code) && !Character.isDigit(code)) {
                    valid = false;
                    break;
                }
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        boolean valid = false;
        if (code == 36 || code == 95) {
            valid = true;
        }
        return valid;
    }

    public static boolean isUpperLatinLetter(int code) {
        boolean valid = true;
        if (code < 65 || code > 90) {
            valid = false;
        }
        return valid;
    }

    public static boolean isLowerLatinLetter(int code) {
        boolean valid = true;
        if (code < 97 || code > 122) {
            valid = false;
        }
        return valid;
    }
}
