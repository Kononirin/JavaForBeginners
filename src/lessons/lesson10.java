package lessons;

import java.util.Arrays;

public class lesson10 {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "is";
        String str3 = "fun";
        String space = " ";

        char a = 'a';
        Character aa = 'a';
        Character aaa = new Character('a');

        System.out.println(a == aa);
        System.out.println(aa == aaa);
        System.out.println(aa.equals(aaa));

        String strA = "a";

        //nак сравнивать невозможно, т.к. разные типы данных
        //System.out.println(a == strA);

        System.out.println(str1 + space + str2 + space + str3);

        //в памяти выделили участок для новой переменной
        //и сохранили там строку с конкатенацией переменных
        String str4 = str1 + space + str2 + space + str3;

        System.out.println(str4);

        System.out.println(str4.charAt(0)); //J
        System.out.println(str4.charAt(4)); //пробел
        //ошибка out of bounds
        //System.out.println(str1.charAt(4));

        for (int i = 0; i <= 4; i++) {
            System.out.println(str4.charAt(i));
        }

        for (int i = 0; i < str4.length(); i++) {
            if (str4.charAt(i) == 'a') {
            //аналог записи с массивом array[i]
                System.out.println(str4.charAt(i)); // печатаем букву
                System.out.println(i); // печатаем индекс
            } else {
                System.out.println("Letter is not a");
            }
        }

        for (int i = 0; i < str4.length(); i++) {
            if (str4.charAt(i) == 'a') {
                //аналог записи с массивом array[i]
                System.out.println(str4.charAt(i)); // печатаем букву
                System.out.println(i); // печатаем индекс
            } else {
                System.out.println("Letter is not a");
            }
        }

        for (int i = 0; i < str4.length(); i++) {
            if (str4.charAt(i) >= 'i') {
                System.out.println(str4.charAt(i));
            } else {
                System.out.println(" < i");
            }
        }

        for (int i = 0; i < str4.length(); i++) {
            if (str4.charAt(i) < 'i') {
                System.out.println(str4.charAt(i));
            } else {
                System.out.println(" >= i");
            }
        }

        System.out.println('i' - 1 + 'i' + 'i' + 1); // 315
        System.out.println('i' - 1);                 //104
        System.out.println('i');                     //i
        System.out.println('i' + 1);                 //106

        System.out.println(Character.toString('i' - 1));  //h
        System.out.println('i');                                    //i
        System.out.println(Character.toString('i' + 1));  //j

        //перевели строку в массив букв
        String[] arrayStr = new String[str4.length()];

        for (int i = 0; i < str4.length(); i++) {
            arrayStr[i] = Character.toString(str4.charAt(i));
        }

        System.out.println(Arrays.toString(arrayStr));

        //каждая буква будет типа Чар
        System.out.println(str4.toCharArray());

        //массив Чаров
        System.out.println(Arrays.toString(str4.toCharArray()));

        char[] arrayChar = str4.toCharArray();

        System.out.println(arrayStr[0].equals(arrayChar[0]));

        //лексико-графическое сравнение
        System.out.println(arrayStr[0].compareTo(
                Character.toString(arrayChar[0]))
        ); //получили 0, что означает что они равны

        if (arrayStr[0].compareTo(Character.toString(arrayChar[0])) == 0) {

        }

        System.out.println(str4);
        System.out.println(str4.toLowerCase());
        System.out.println(str4.toUpperCase());
        String str5 = str4.toUpperCase();
        System.out.println(str4.compareToIgnoreCase(str5)); // 0 = равны








    }
}
