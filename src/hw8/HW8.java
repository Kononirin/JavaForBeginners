package hw8;

import java.util.Arrays;

import static utils.Utils.*;

public class HW8 {

    /**
     * 7. Написать метод, который принимает на вход 5 целых чисел,
     * и возвращает массив из этих же чисел
     */

    public static int[] arrayInt(int a, int b, int c, int d, int e) {

        int[] array = {a, b, c, d, e};

        return array;
    }

    /**
     * 8. Написать метод, который принимает на вход 5 чисел типа double,
     * и возвращает массив из этих же чисел
     */

    public static double[] arrayDouble(double a, double b, double c, double d,
                                       double e) {

        double[] array = {a, b, c, d, e};

        return array;
    }

    /**
     * 9. Написать метод, который принимает на вход 5 слов,
     * и возвращает массив из этих слов
     */

    public static String[] arrayString(String a, String b, String c, String d,
                                       String e) {

        String[] array = {a, b, c, d, e};

        return array;
    }

    /**
     * 10. Написать метод, который принимает на вход массив целых чисел,
     * и возвращает массив тех же чисел, умноженных на 2.5
     */

    public static double[] arrayMultiplication(int[] array, double a) {

        if (array.length != 0) {
            double[] arrayMultyD = new double[array.length];

            for (int i = 0; i < array.length; i++) {
                arrayMultyD[i] = array[i] * a;
            }

            return arrayMultyD;
        } else {
            System.out.println("Array is empty");
        }
        return new double[0];
    }

    /**
     * 11. Написать метод, который принимает на вход массив
     * целых положительных чисел,  и возвращает количество
     * четных чисел в этом массиве
     */

    public static int countOfElements(int[] array) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static String countOfElements1(int[] array) {
        if (array.length != 0) {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    return "Array have negative number";
                } else if (array[i] % 2 == 0) {
                    count++;
                }
            }
            String count1;
            count1 = String.valueOf(count);
            return count1;
        } else return "Array is empty";
    }

//    public static void countOfElements(int[] array) {
//        if (array.length != 0) {
//            int count = 0;
//            for (int i = 0; i < array.length; i++) {
//                if (array[i] < 0) {
//                    break;
//                } else if (array[i] % 2 == 0) {
//                     count++;
//                }
//            }
//            System.out.println(count);
//        } else {
//            System.out.println("Array is empty");
//        }
//    }


//    public static void countOfElements(int[] array) {
//        if (array.length != 0) {
//
//            for (int i = 0; i < array.length; i++) {
//                if (array[i] > 0) {
//                    array[i] = array[i];
//                } else if (array[i] < 0) {
//                    System.out.println("Some elements of array not positive");
//                    //break;
//                }
//            }
//            int count = 0;
//            for (int j = 0; j < array.length; j++) {
//                if(array[j] % 2 == 0) {
//                    count++;
//                }
//            }
//            System.out.println(count);
//        } else {
//            System.out.println("Array is empty");
//        }
//    }

//    public static int countOfElements(int[] array) {
//        if (array.length != 0) {
//
//            for (int i = 0; i < array.length; i++) {
//                if (array[i] > 0) {
//                    array[i] = array[i];
//                } else if (array[i] < 0) {
//                    System.out.println("Some elements of array not positive");
//                }
//            }
//            int count = 0;
//            for (int j = 0; j < array.length; j++) {
//                if(array[j] % 2 == 0) {
//                    count++;
//                }
//            }
//            return count;
//        } else {
//            System.out.println("Array is empty");
//            return
//        }
//    }

    /**
     * 12. Написать метод, который принимает на вход массив
     * целых положительных чисел,
     * и возвращает массив нечетных чисел
     */

//    public static int[] arrayOfNegatives(int[] array) {
//
//        int count = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] %2 == 0) {
//                count++;
//            }
//        }
//
//        int[] arrayNegative = new int[array.length];
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 != 0) {
//                arrayNegative[i] = array[i];
//            }
//        }
//    }
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
        String name8 = new String("Ira");

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

        printLine();

        System.out.println(one8.equals(HW8_1.one8_1));
        System.out.println(two8.equals(HW8_1.two8_1));
        System.out.println(name8.equals(HW8_1.name8_1));

        printLine();

        System.out.println(isIntegerEqual);
        System.out.println(isDoubleEqual);
        System.out.println(isStringEqual);

        printLine();

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

        int[] arrayI1 = arrayInt(1, 2, 3, 4, 5);

        int[] arrayI2 = arrayInt(Integer.MAX_VALUE, 0, 0, 0,
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

        double[] arrayD1 = arrayDouble(1.0, 2.0, 3.0, 4.0, 5.0);
        double[] arrayD2 = arrayDouble(Double.MAX_VALUE, 0.0, 0.0, 0.0,
                Double.MAX_VALUE);
        double[] arrayD3 = arrayDouble(-1.0, -2.0, -3.0, -4.0,
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

        int[] emptyArray = new int[0];

        System.out.println(Arrays.toString(arrayMultiplication(arrayI1,
                2.5)));

        System.out.println(Arrays.toString(arrayMultiplication(arrayI1,
                3.5)));

        System.out.println(Arrays.toString(arrayMultiplication(arrayI1,
                0)));

        System.out.println(Arrays.toString(arrayMultiplication(arrayI1,
                -2.5)));

        printLine();

        System.out.println(Arrays.toString(arrayMultiplication(emptyArray,
                2.5)));

        task(11);

        /**
         * 11. Написать метод, который принимает на вход массив
         * целых положительных чисел,  и возвращает количество
         * четных чисел в этом массиве
         */

        int[] arrayTask11 = {1, 2, 3, 4, 5, 6};

        int[] arrayTask11_1 = new int[0];

        int[] arrayTask11_2 = {1, 2, -3, 4, 5, 6};

        System.out.println(countOfElements1(arrayTask11));

        System.out.println(countOfElements1(arrayTask11_1));

        System.out.println(countOfElements1(arrayTask11_2));

        printLine();

        if (checkForEmptyArray(arrayTask11)) {
            if (checkPositiveNumbers(arrayTask11)) {
                System.out.println(countOfElements(arrayTask11));
            } else {
                System.out.println("Array have negative number");
            }
        } else {
            System.out.println("Array is empty");
        }

        if (checkForEmptyArray(arrayTask11_1)) {
            if (checkPositiveNumbers(arrayTask11_1)) {
                System.out.println(countOfElements(arrayTask11_1));
            } else {
                System.out.println("Array have negative number");
            }
        } else {
            System.out.println("Array is empty");
        }

        if (checkForEmptyArray(arrayTask11_2)) {
            if (checkPositiveNumbers(arrayTask11_2)) {
                System.out.println(countOfElements(arrayTask11_2));
            } else {
                System.out.println("Array have negative number");
            }
        } else {
            System.out.println("Array is empty");
        }



        task(12);

        /** 12. Написать метод, который принимает на вход массив
         * целых положительных чисел,
         * и возвращает массив нечетных чисел
         */


    }

}
