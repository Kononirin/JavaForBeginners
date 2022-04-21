package hw8;

import java.util.Arrays;

import static utils.Utils.line;
import static utils.Utils.task;

public class HW8 {

    /**
     * Написать метод, который принимает на вход 5 целых чисел,
     * и возвращает массив из этих же чисел
     */

    public static int[] arrayInt (int a, int b, int c, int d, int e){

        int[] array = {a, b, c, d, e};

        return array;
    }

    /**
     * Написать метод, который принимает на вход 5 чисел типа double,
     * и возвращает массив из этих же чисел
     */

    public static double[] arrayDouble (double a, double b, double c, double d,
                                        double e){

        double[] array = {a, b, c, d, e};

        return array;
    }

    /**
     * Написать метод, который принимает на вход 5 слов,
     * и возвращает массив из этих слов
     */

    public static String[] arrayString (String a, String b, String c, String d,
                                        String e){

        String[] array = {a, b, c, d, e};

        return array;
    }

    /**
     * Написать метод, который принимает на вход массив целых чисел,
     * и возвращает массив тех же чисел, умноженных на 2.5
     */

    public static double[] arrayMultiplication(int[] array) {

        double[] arrayMultyD = new double[array.length];

        for (int i = 0; i < array.length;i++) {
            arrayMultyD[i] = array[i] * 2.5;
        }

        return arrayMultyD;
    }

    public static void main(String[] args) {

        task(4);

        /**
         * Импортировать статичные методы класса Utils,
         * которые вы будете использовать во время выполнения HW8
         */

        task(5);

        /**
         * Создать объекты типа Integer, Double, String
         * и присвоить им такие же значения, как и переменным класса HW8_1
         */

        Integer one8 = 1;
        Double two8 = 2.0;
        String name8 = new String ("Ira");

        task(6);

        /**
         * Сравнить переменные соответствующих типов из классов HW8_1 и HW8
         * и распечатать результат сравнения в виде таблички:
         * HW8	 		|HW8_1			|areEquals?
         * ____________________________________________
         * Double d = …	|Double d_1 = …		| true or false
         * ……
         */

        boolean isIntegerEqual = one8.equals(HW8_1.one8_1);
        boolean isDoubleEqual = two8.equals(HW8_1.two8_1);
        boolean isStringEqual = name8.equals(HW8_1.name8_1);

        line();

        System.out.println(one8.equals(HW8_1.one8_1));
        System.out.println(two8.equals(HW8_1.two8_1));
        System.out.println(name8.equals(HW8_1.name8_1));

        line();

        System.out.println(isIntegerEqual);
        System.out.println(isDoubleEqual);
        System.out.println(isStringEqual);

        line();

        String line = "-----------------------------------------";

        System.out.println(line);
        System.out.println("|\tHW8\t\t" + "|\tHW8_1\t"
                + "|\tareEquals?\t|");
        System.out.println(line);
        System.out.println("|\t" + one8 + "\t\t" + "|\t" + HW8_1.one8_1
                + "\t\t|\t" + isIntegerEqual + "\t\t|");
        System.out.println(line);
        System.out.println("|\t" + two8 + "\t\t" + "|\t" + HW8_1.two8_1
                + "\t\t|\t" + isDoubleEqual + "\t\t|");
        System.out.println(line);
        System.out.println("|\t" + name8 + "\t\t" + "|\t" + HW8_1.name8_1
                + "\t\t|\t" + isStringEqual + "\t\t|");
        System.out.println(line);

        task(7);

        /**
         * Написать метод, который принимает на вход 5 целых чисел,
         * и возвращает массив из этих же чисел
         */

        int[] arrayI1 = arrayInt(1,2,3,4,5);

        int[] arrayI2 = arrayInt(Integer.MAX_VALUE,0,0,0,
                Integer.MIN_VALUE);

        int[] arrayI3 = arrayInt(-1, -2, -3, -4, -5);

        System.out.println(Arrays.toString(arrayI1));

        System.out.println(Arrays.toString(arrayI2));

        System.out.println(Arrays.toString(arrayI3));

        task(8);

        /**
         * Написать метод, который принимает на вход 5 чисел типа double,
         * и возвращает массив из этих же чисел
         */

        double[] arrayD1 = arrayDouble(1.0,2.0,3.0,4.0,5.0);
        double[] arrayD2 = arrayDouble(Double.MAX_VALUE,0.0,0.0,0.0,
                Double.MAX_VALUE);
        double[] arrayD3 = arrayDouble(-1.0,-2.0,-3.0,-4.0,
                -5.0);

        System.out.println(Arrays.toString(arrayD1));

        System.out.println(Arrays.toString(arrayD2));

        System.out.println(Arrays.toString(arrayD3));

        task(9);

        /**
         * Написать метод, который принимает на вход 5 слов,
         * и возвращает массив из этих слов
         */

        String[] arrayS1 = arrayString("Hi", "Hello", "Bye",
                "Welcome", "Sorry");

        System.out.println(Arrays.toString(arrayS1));

        task(10);

        /**
         * Написать метод, который принимает на вход массив целых чисел,
         * и возвращает массив тех же чисел, умноженных на 2.5
         */

        System.out.println(Arrays.toString(arrayMultiplication(arrayI1)));








    }

}
