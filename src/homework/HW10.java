package homework;

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

    public static void main(String[] args) {

        String str = "        happy birthday!    ";
        String strEmpty = "";
        String strNull = null;
        String strJohn = "     john jacob smith jr.";

        System.out.println(str);
        System.out.println(capitalizeWords(str));
        System.out.println(capitalizeWords(strEmpty));
        System.out.println(capitalizeWords(strNull));
        System.out.println(capitalizeWords(strJohn));
        System.out.println(capitalizeWords(" "));
    }
}
