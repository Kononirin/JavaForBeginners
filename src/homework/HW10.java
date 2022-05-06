package homework;

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
     * Test Data:
     * “    QA4Everyone   “ → “Лишние пробелы удалены”
     * “QA4Everyone“ → “Пробелов не было”
     * “” → “Строка пустая”
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
     * Test Data:
     *  “    QA4Everyone   “ →  “QA4Everyone“
     * “panda   “ → “pnd”
     */

    public static String removeAlla(String str) {

        if (!isStringNull(str)) {
            if (!str.isEmpty()) {

                //str.replaceAll("[a]","");
                str = str.trim();
                str = str.replace("a","");

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
     * Test Data:
     *  “   3 5 0 4 2 0 9 7 0 6 0 4 0       0 0 0 “ →  “35429764“
     * “ 0000000111“ → “111”
     */

    public static String removeAllZeros(String str) {

        if (!isStringNull(str)) {
            if (!str.isEmpty()) {
                str = str.replace(" ", "");
                str = str.replace("0","");

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
     * Test Data:
     *  “    QA   4  Everyone   “ →  “QA4Everyone“
     * “p a     n d a   “ → “panda”
     */

    public static String removeAllSpaces (String str) {

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
     * Test Data:
     * “Abracadabra” → 5
     * “Homenum Revelio” → 0
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

    public static String emptyString = "";
    public static String nullString = null;

    public static void main(String[] args) {

        String str = "        happy birthday!    ";
        //String strEmpty = "";
        //String strNull = null;
        String strJohn = "     john jacob smith jr.";

        System.out.println(str);
        System.out.println(capitalizeWords(str));
        System.out.println(capitalizeWords(emptyString));
        System.out.println(capitalizeWords(nullString));
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
        System.out.println(deleteSpaces(emptyString));
        System.out.println(deleteSpaces(nullString));

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
        System.out.println(removeAlla(emptyString));
        System.out.println(removeAlla(nullString));

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
        System.out.println(removeAllZeros(emptyString));
        System.out.println(removeAllZeros(nullString));

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
        System.out.println(removeAllSpaces(emptyString));
        System.out.println(removeAllSpaces(nullString));

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
        System.out.println(countA(emptyString));
        System.out.println(countA(nullString));

        task(6);







    }
}
