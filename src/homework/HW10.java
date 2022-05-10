package homework;

import java.util.Arrays;

import static utils.Utils.*;

public class HW10 {

    /**
     * Нaписать алгоритм СapitalizeWords, который принимает на вход
     * предложение с единичным пробелом между словами, и возвращает
     * предложение, в котором все слова написаны с большой буквы
     * "        happy birthday!    " --> "Happy Birthday"
     * "     john jacob smith jr." --> "John Jacob Smith Jr."
     */

    //метод trim убирает пробелы до и после строки
    //пустой String = "";
    //String str = null; - черная дыра, часто выдает ошибки
    //Character.toString(sentence.charAt(0)).toUpperCase(); в
    //данном случае не подходит тк возвращает чар
    public static String capitalizeWords(String sentence) {

        if (sentence != null) {
            sentence = sentence.trim();

            if (sentence.length() != 0) {

                sentence = sentence.substring(0, 1).toUpperCase()
                        + sentence.substring(1);

                for (int i = 1; i < sentence.length(); i++) {
                    if (sentence.charAt(i) == ' ') {
                        sentence = sentence.substring(0, i + 1)
                                + sentence.substring(i + 1, i + 2).toUpperCase()
                                + sentence.substring(i + 2);
                    }
                }

                return sentence;
            }

            return "";
        }

        return "";
    }

    /**
     * 1. Написать метод, который принимает на вход строку.
     * Если строка не пустая (проверить методом из видео),
     * то примените метод по удалению пробелов в начале
     * строки и в конце строки.
     * Догадаться, каким методом из видео можно проверить, были ли пробелы.
     * Если пробелы были,то метод должен вернуть сообщение:
     * “Лишние пробелы удалены”.
     * Если пробелов не было, вернуть сообщение “Пробелов не было”.
     * Если строка пустая, вернуть сообщение “Строка пустая”.
     */

    public static String deleteSpaces(String str) {

        if (!isStringNull(str)) {
            if (!str.isEmpty()) {
                String strTemp = str.trim();
                if (str.length() > strTemp.length()) {

                    return "Лишние пробелы удалены";
                } else if (str.length() == strTemp.length()) {

                    return "Пробелов не было";
                }
            }

            return "Строка пустая";
        }

        return "";
    }

    /**
     * 2. Написать алгоритм RemoveAlla.
     * С помощью методов из видео1, написать алгоритм, который принимает
     * на вход строку. Если строка валидная, то метод удаляет
     * все буквы a из строки, если таковые имеются.
     * Метод возвращает обработанную строку.
     */

    public static String removeAlla(String str) {

        if (!isStringNull(str)) {
            if (!str.isEmpty()) {

                //str.replaceAll("[a]","");
                str = str.trim();
                str = str.replace("a", "");

                return str;
            }

            return "";
        }

        return "";
    }

    /**
     * 3. Написать алгоритм RemoveAllZeros.
     * С помощью методов из видео1,  написать алгоритм,
     * который принимает на вход строку, состоящую из цифр.
     * Если строка валидная, то метод удаляет все пробелы из
     * строки, если таковые имеются. Метод возвращает обработанную
     * строку, в которой нет нулей.
     */

    public static String removeAllZeros(String str) {

        if (!isStringNull(str)) {
            if (!str.isEmpty()) {
                str = str.replace(" ", "");
                str = str.replace("0", "");

                return str;
            }

            return "";
        }

        return "";
    }

    /**
     * 4. Написать алгоритм RemoveAllSpaces.
     * С помощью методов из видео1, написать алгоритм,
     * который принимает на вход строку. Если строка валидная,
     * то метод удаляет все пробелы из строки, если таковые имеются.
     * Метод возвращает обработанную строку.
     */

    public static String removeAllSpaces(String str) {

        if (!isStringNull(str)) {
            if (!str.isEmpty()) {
                str = str.replace(" ", "");

                return str;
            }

            return "";
        }

        return "";
    }

    /**
     * 5. Напишите метод, который принимает на вход строку и считает, сколько
     * букв а или А содержится в строке.
     */

    public static int countA(String str) {

        if (!isStringNull(str)) {
            if (!str.isEmpty()) {
                str = str.toLowerCase();
                int count = 0;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == 'a') {
                        count++;
                    }
                }

                return count;
            }

            return Integer.MIN_VALUE;
        }

        return Integer.MIN_VALUE;
    }

    /**
     * 6. Напишите метод, который принимает на вход текст и проверяет,
     * содержится ли в тексте хотя бы одно слово Java.
     */

    public static boolean isContainSubstr(String str, String substr) {

        if (!isStringNull(str)) {
            if (!str.isEmpty()) {
                if (str.contains(substr)) {

                    return true;
                }

                return false;
            }

            return false;
        }

        return false;
    }

    /**
     * 7. Напишите метод, который принимает на вход строку, и добавляет
     * Кавычки в начале строки, точку и кавычки в конце строки с помощью
     * метода concat()
     */

    public static String plusQuotes(String str) {

        if (!isStringNull(str)) {
            if (!str.isEmpty()) {
                str = str.trim();
                str = str.concat("\"");
                String tmp = "\"";
                str = tmp.concat(str);

                return str;
            }

            return "";
        }

        return "";
    }

    /**
     * 8. Напишите метод, кторый принимает на вход название города и
     * исправляет написание:
     * Test Data:
     * “ташкент” → “Ташкент”
     * “ЧикаГО” → “Чикаго”
     */

    public static String correctTitle(String str) {

        if (!isStringNull(str)) {
            if (!str.isEmpty()) {
                str = str.toUpperCase().substring(0, 1)
                        + str.toLowerCase().substring(1);

                return str;
            }

            return "";

        }

        return "";
    }

//    public static String correctTitle1(String str) {
//
//        if (!isStringNullAndEmpty(str)) {
//            str = str.toUpperCase().substring(0, 1)
//                    + str.toLowerCase().substring(1);
//
//            return str;
//        }
//
//        return "";
//    }

    /**
     * 9. Напишите метод, который принимает на вход строку, и возвращает все,
     * что находится между первой и последней буквой-параметром:
     * Test Data:
     * “Abracadabra”, “b” → “bracadab”
     * “Whippersnapper”, “p” → “ppersnapp”
     */

    public static String cutBetweenSymbol(String str, String symbol) {

        if (!isStringNull(str) && !isStringNull(symbol)) {
            if (!str.isEmpty() && !symbol.isEmpty()) {
                int firstIndex = str.indexOf(symbol);
                int lastIndex = str.lastIndexOf(symbol);
                if (firstIndex != -1 || lastIndex != -1) {
                    str = str.substring(firstIndex, (lastIndex + 1));

                    return str;
                }

                return "";
            }

            return "";
        }

        return "";
    }

    /**
     * 10. Напишите метод, который принимает на вход слово, и возвращает true,
     * если слово начинается и заканчивается на одинаковую букву, и faulse
     * иначе
     * Test Data:
     * “Abracadabra” → true
     * “Whippersnapper” → false
     */

    public static boolean isStartAndEndSameSymbol(String str) {

        if (!isStringNull(str)) {
            if (!str.isEmpty()) {
                str = str.toLowerCase();
                String firstSymbol = str.substring(0, 1);
                String lastSymbol = str.substring(str.length() - 1);
                if (firstSymbol.equals(lastSymbol)) {

                    return true;
                }

                return false;
            }

            return false;
        }

        return false;
    }

    /**
     * 11. Напишите метод, который принимает на вход предложение и возвращает
     * слова из этого предложения в виде массива слов
     * Test Data:
     * “QA for Everyone” → {“QA”, “for”, “Everyone”}
     * “Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}
     */

    public static String[] changeStringToArrayStrings(String str) {

        if (!isStringNull(str)) {
            if (!str.isEmpty()) {

                return str.split(" ");
            }

            return new String[]{};
        }

        return new String[]{};
    }

    /**
     * 12. Написать метод, который принимает на вход предложение, которое
     * состоит из имени, фамилии, отчества и возвращает массив строк:
     * Test Data:
     * “Александр Сергеевич Пушкин” →
     * {“Имя: Александр”, “Отчество: Сергеевич”, “Фамилия: Пушкин”}
     */

    public static String[] arrayTask12(String str) {

        if (!isStringNull(str)) {
            if (!str.isEmpty()) {
                String[] arrFio = {"Имя: ", "Отчество: ", "Фамилия: "};
                String[] arrStrings = str.split(" ");
                for (int i = 0; i < arrStrings.length; i++) {
                    arrStrings[i] = arrFio[i] + arrStrings[i];
                }

                return arrStrings;
            }

            return new String[]{};
        }

        return new String[]{};

    }

    /**
     * 13. Написать метод, который возвращает сумму всех букв слова
     * “abc” → 294
     * “ABC” → 198
     * “123” → 0 (это не буквы)
     */

    public static int sumOfLetters(String str) {

        if (!isStringNull(str)) {
            if (!str.isEmpty()) {
                int sum = 0;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) < 65 || str.charAt(i) > 90
                            && str.charAt(i) < 97 || str.charAt(i) > 122) {

                        return 0;
                    }
                    sum = sum + str.charAt(i);
                }

                return sum;
            }

            return Integer.MIN_VALUE;
        }

        return Integer.MIN_VALUE;
    }

    public static String emptyString = "";
    public static String nullString = null;

    public static void main(String[] args) {

        String str = "        happy birthday!    ";
        String strJohn = "     john jacob smith jr.";

        System.out.println(str);
        System.out.println(capitalizeWords(str));
        System.out.println(capitalizeWords(nullString));
        System.out.println(capitalizeWords(emptyString));
        System.out.println(capitalizeWords(strJohn));
        System.out.println(capitalizeWords(" "));

        task(1);

        /**
         * 1. Написать метод, который принимает на вход строку.
         * Если строка не пустая (проверить методом из видео),
         * то примените метод по удалению пробелов в начале
         * строки и в конце строки.
         * Догадаться, каким методом из видео можно проверить, были ли пробелы.
         * Если пробелы были,то метод должен вернуть сообщение:
         * “Лишние пробелы удалены”.
         * Если пробелов не было, вернуть сообщение “Пробелов не было”.
         * Если строка пустая, вернуть сообщение “Строка пустая”.
         * Test Data:
         * “    QA4Everyone   “ → “Лишние пробелы удалены”
         * “QA4Everyone“ → “Пробелов не было”
         * “” → “Строка пустая”
         */

        String str1 = "    QA4Everyone   ";
        String str1_1 = "QA4Everyone";

        System.out.println(deleteSpaces(str1));
        System.out.println(deleteSpaces(str1_1));
        System.out.println(deleteSpaces(nullString));
        System.out.println(deleteSpaces(emptyString));

        task(2);

        /**
         * 2. Написать алгоритм RemoveAlla.
         * С помощью методов из видео1, написать алгоритм, который принимает
         * на вход строку. Если строка валидная, то метод удаляет
         * все буквы a из строки, если таковые имеются.
         * Метод возвращает обработанную строку.
         * Test Data:
         *  “    QA4Everyone   “ →  “QA4Everyone“
         * “panda   “ → “pnd”
         */

        String str2 = "    QA4Everyone   ";
        String str2_1 = "panda   ";


//        System.out.println(str2_1.replaceAll("[a]",""));
//        System.out.println(str2_1.replace("a",""));

        System.out.println(removeAlla(str2));
        System.out.println(removeAlla(str2_1));
        System.out.println(removeAlla(nullString));
        System.out.println(removeAlla(emptyString));

        task(3);

        /**
         * 3. Написать алгоритм RemoveAllZeros.
         * С помощью методов из видео1,  написать алгоритм,
         * который принимает на вход строку, состоящую из цифр.
         * Если строка валидная, то метод удаляет все пробелы из
         * строки, если таковые имеются. Метод возвращает обработанную
         * строку, в которой нет нулей.
         * Test Data:
         *  “   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 “ →  “35429764“
         * “ 0000000111“ → “111”
         */

        String str3 = "   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 ";
        String str3_1 = " 0000000111";

        System.out.println(removeAllZeros(str3));
        System.out.println(removeAllZeros(str3_1));
        System.out.println(removeAllZeros(nullString));
        System.out.println(removeAllZeros(emptyString));

        task(4);

        /**
         * 4. Написать алгоритм RemoveAllSpaces.
         * С помощью методов из видео1, написать алгоритм,
         * который принимает на вход строку. Если строка валидная,
         * то метод удаляет все пробелы из строки, если таковые имеются.
         * Метод возвращает обработанную строку.
         * Test Data:
         *  “    QA   4  Everyone   “ →  “QA4Everyone“
         * “p a     n d a   “ → “panda”
         */

        String str4 = "    QA   4  Everyone   ";
        String str4_1 = "p a     n d a   ";

        System.out.println(removeAllSpaces(str4));
        System.out.println(removeAllSpaces(str4_1));
        System.out.println(removeAllSpaces(nullString));
        System.out.println(removeAllSpaces(emptyString));

        task(5);

        /**
         * 5. Напишите метод, который принимает на вход строку и считает, сколько
         * букв а или А содержится в строке.
         * Test Data:
         * “Abracadabra” → 5
         * “Homenum Revelio” → 0
         */

        String str5 = "Abracadabra";
        String str5_1 = "Homenum Revelio";

        System.out.println(countA(str5));
        System.out.println(countA(str5_1));
        System.out.println(countA(nullString));
        System.out.println(countA(emptyString));

        task(6);

        /**
         * 6. Напишите метод, который принимает на вход текст и проверяет,
         * содержится ли в тексте хотя бы одно слово Java.
         */

        String str6 =
                "As of March 2022, Java 18 is the latest version, while Java 17,\n" +
                        " 11 and 8 are the current long-term support (LTS) versions.\n" +
                        " Oracle released the last zero-cost public update for the legacy\n" +
                        " version Java 8 LTS in January 2019 for commercial use, although\n" +
                        " it will otherwise still support Java 8 with public updates for\n" +
                        " personal use indefinitely. Other vendors have begun to offer\n" +
                        " zero-cost builds of OpenJDK 8 and 11 that are still receiving\n" +
                        " security and other upgrades.";

        String str6_1 =
                "As a decrepit father takes delight\n" +
                        " To see his active child do deeds of youth,\n" +
                        " So I, made lame by fortune’s dearest spite,\n" +
                        " Take all my comfort of thy worth and truth.\n" +
                        " For whether beauty, birth, or wealth, or wit,\n" +
                        " Or any of these all, or all, or more,\n" +
                        " Entitled in thy parts do crownèd sit,\n" +
                        " I make my love engrafted to this store.\n" +
                        " So then I am not lame, poor, nor despised,\n" +
                        " Whilst that this shadow doth such substance give\n" +
                        " That I in thy abundance am sufficed,\n" +
                        " And by a part of all thy glory live.\n" +
                        " Look what is best, that best I wish in thee.\n" +
                        " This wish I have; then ten times happy me.";

        String str6_2 = "Java";

        System.out.println(isContainSubstr(nullString, str6_2));
        System.out.println(isContainSubstr(emptyString, str6_2));
        System.out.println(isContainSubstr(str6_1, str6_2));
        System.out.println(isContainSubstr(str6, str6_2));

        task(7);

        /**
         * 7. Напишите метод, который принимает на вход строку, и добавляет
         * Кавычки в начале строки, точку и кавычки в конце строки с помощью
         * метода concat()
         * Test Data:
         * “One” → ““One.””
         * “    TWO  “ → ““TWO.””
         */

        String str7 = "One";
        String str7_1 = "    TWO  ";

        System.out.println(plusQuotes(str7));
        System.out.println(plusQuotes(str7_1));
        System.out.println(plusQuotes(nullString));
        System.out.println(plusQuotes(emptyString));

        task(8);

        /**
         * 8. Напишите метод, кторый принимает на вход название города и
         * исправляет написание:
         * Test Data:
         * “ташкент” → “Ташкент”
         * “ЧикаГО” → “Чикаго”
         */

        String str8 = "ташкент";
        String str8_1 = "ЧикаГО";

        System.out.println(correctTitle(str8));
        System.out.println(correctTitle(str8_1));
        System.out.println(correctTitle(nullString));
        System.out.println(correctTitle(emptyString));

//        System.out.println(correctTitle1(str8));
//        System.out.println(correctTitle1(str8_1));
//        System.out.println(correctTitle1(nullString));
//        System.out.println(correctTitle1(emptyString));

        task(9);

        /**
         * 9. Напишите метод, который принимает на вход строку, и возвращает все,
         * что находится между первой и последней буквой-параметром:
         * Test Data:
         * “Abracadabra”, “b” → “bracadab”
         * “Whippersnapper”, “p” → “ppersnapp”
         */

        String str9 = "Abracadabra";
        String symbol = "b";
        String symbol1 = "e";
        String str9_1 = "Whippersnapper";

        System.out.println(cutBetweenSymbol(str9, "b"));
        System.out.println(cutBetweenSymbol(str9, "e"));
        System.out.println(cutBetweenSymbol(str9_1, "p"));
        System.out.println(cutBetweenSymbol(nullString, "b"));
        System.out.println(cutBetweenSymbol(emptyString, "b"));

        task(10);

        /**
         * 10. Напишите метод, который принимает на вход слово, и возвращает
         * true, если слово начинается и заканчивается на одинаковую букву,
         * и faulse иначе
         * Test Data:
         * 	“Abracadabra” → true
         * 	“Whippersnapper” → false
         */

        String str10 = "Abracadabra";
        String str10_1 = "Whippersnapper";

        System.out.println(isStartAndEndSameSymbol(str10));
        System.out.println(isStartAndEndSameSymbol(str10_1));
        System.out.println(isStartAndEndSameSymbol(nullString));
        System.out.println(isStartAndEndSameSymbol(emptyString));

        task(11);

        /**
         * 11. Напишите метод, который принимает на вход предложение и
         * возвращает слова из этого предложения в виде массива слов
         * Test Data:
         * “QA for Everyone” → {“QA”, “for”, “Everyone”}
         * “Александр Сергеевич Пушкин” → {“Александр”, “Сергеевич”, “Пушкин”}
         */

        String str11 = "QA for Everyone";
        String str11_1 = "Александр Сергеевич Пушкин";

        System.out.println(Arrays.toString(changeStringToArrayStrings(str11)));
        System.out.println(Arrays.toString(changeStringToArrayStrings(
                str11_1)));
        System.out.println(Arrays.toString(changeStringToArrayStrings(
                nullString)));
        System.out.println(Arrays.toString(changeStringToArrayStrings(
                emptyString)));


        task(12);

        /**
         * 12. Написать метод, который принимает на вход предложение, которое
         * состоит из имени, фамилии, отчества и возвращает массив строк:
         * Test Data:
         * “Александр Сергеевич Пушкин” →
         * {“Имя: Александр”, “Отчество: Сергеевич”, “Фамилия: Пушкин”}
         */

        String str12 = "Александр Сергеевич Пушкин";

        System.out.println(Arrays.toString(arrayTask12(str12)));
        System.out.println(Arrays.toString(arrayTask12(nullString)));
        System.out.println(Arrays.toString(arrayTask12(emptyString)));

        task(13);

        /**
         * 13. Написать метод, который возвращает сумму всех букв слова
         * “abc” → 294
         * “ABC” → 198
         * “123” → 0 (это не буквы)
         */

        String str13 = "abc";
        String str13_1 = "ABC";
        String str13_2 = "123";

        System.out.println(sumOfLetters(str13));
        System.out.println(sumOfLetters(str13_1));
        System.out.println(sumOfLetters(str13_2));
        System.out.println(sumOfLetters(nullString));
        System.out.println(sumOfLetters(emptyString));
    }
}
