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

    public static double[] arrayMultyNumber(int[] array, double a) {

        double[] arrayMultyNumber = new double[array.length];

        for (int i = 0; i < array.length; i++) {
            arrayMultyNumber[i] = array[i] * a;
        }
        return arrayMultyNumber;
    }


    public static double[] arrayMultiplication(int[] array, double a) {

        if (checkForEmptyArray(array)) {

            return arrayMultyNumber(array, a);
        }

        return new double[]{};
    }

    /**
     * 11. Написать метод, который принимает на вход массив
     * целых положительных чисел,  и возвращает количество
     * четных чисел в этом массиве
     */

    public static int countEvenElements(int[] array) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static int countOddElements(int[] array) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count++;
            }
        }

        return count;
    }

    public static int array11(int[] array) {

        if (checkForEmptyArray(array)) {
            if (checkPositiveNumbers(array)) {

                return countEvenElements(array);

            }

            return -1;
        }

        return -1;
    }

    // этот метод неверен, т.к. возвращает стринг, а по условиям задачи нужно
    // вернуть числовое значение (инт)
//    public static String countOfElements1(int[] array) {
//        if (array.length != 0) {
//            int count = 0;
//            for (int i = 0; i < array.length; i++) {
//                if (array[i] < 0) {
//                    return "Array have negative number";
//                } else if (array[i] % 2 == 0) {
//                    count++;
//                }
//            }
//            String count1;
//            count1 = String.valueOf(count);
//            return count1;
//        } else return "Array is empty";
//    }

    /**
     * 12. Написать метод, который принимает на вход массив
     * целых положительных чисел,
     * и возвращает массив нечетных чисел
     */

    public static int[] arrayOddNumbers(int[] array) {

        int[] arrayOdd = new int[countOddElements(array)];

        int number = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                arrayOdd[number] = array[i];
                number++;
            }
        }

        return arrayOdd;
    }

    public static int[] arrayEvenNumbers(int[] array) {

        int[] arrayEven = new int[countEvenElements(array)];

        int number = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayEven[number] = array[i];
                number++;
            }
        }

        return arrayEven;
    }

    public static int[] array12(int[] array) {

        if (checkPositiveNumbers(array)) {
            if (checkPositiveNumbers(array)) {

                return arrayOddNumbers(array);
            }

            return new int[]{};
        }

        return new int[]{};
    }

    public static int[] array12_1(int[] array) {

        if (checkPositiveNumbers(array)) {
            if (checkPositiveNumbers(array)) {

                return arrayEvenNumbers(array);
            }

            return new int[]{};
        }

        return new int[]{};
    }

    /**
     * 13. Написать метод, который принимает на вход массив целых чисел,
     * и возвращает массив значений true или false, если числа больше 10
     */

    public static boolean[] isNumMoreTen(int[] array) {

        boolean[] isNumMoreTen = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            isNumMoreTen[i] = (array[i] > 10);
        }

        return isNumMoreTen;
    }

    public static boolean[] isElementMoreDigit(int[] array, int digit) {

        boolean[] isElementMoreDigit = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            isElementMoreDigit[i] = (array[i] > digit);
        }

        return isElementMoreDigit;
    }

    public static boolean[] isElementLessDigit(int[] array, int digit) {

        boolean[] isElementLessDigit = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            isElementLessDigit[i] = (array[i] < digit);
        }

        return isElementLessDigit;
    }

    public static boolean[] array13(int[] array) {

        if (checkForEmptyArray(array)) {

            return isNumMoreTen(array);
        }

        return new boolean[]{};
    }

    public static boolean[] array13_1(int[] array) {

        if (checkForEmptyArray(array)) {

            return isElementMoreDigit(array, 20);
        }

        return new boolean[]{};
    }

    public static boolean[] array13_2(int[] array) {

        if (checkForEmptyArray(array)) {

            return isElementLessDigit(array, 20);
        }

        return new boolean[]{};
    }

    /**
     * 14. Написать метод, который принимает на вход массив слов,
     * и возвращает строку, состоящую из этих слов
     */

    public static String makeString(String[] array) {

        String newString = "";

        for (int i = 0; i < array.length; i++) {
            newString = newString + (array[i] + " ");
        }

        return newString;
    }

    /**
     * 15. Написать метод, который принимает массив целых чисел
     * и считает сумму чисел во второй половине массива
     */

    public static int sumOfSecondHalf(int[] array) {

        int length = lengthArray(array);
        int secondHalf = length / 2;

        int sum = 0;

        for (int i = secondHalf; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static int array15(int[] array) {

        if (checkForEmptyArray(array)) {

            return sumOfSecondHalf(array);
        }

        return Integer.MIN_VALUE;
    }

    /**
     * 16. Написать метод, который принимает на вход целое положительные
     * число в пределах от 1 до 10 исключительно, и возвращает таблицу
     * умножения на это число в виде массива
     * Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}
     */

    public static int[] multiplicationTable(int a) {

        if (a > 1 && a < 10) {
            int[] multiTable = new int[11];

            for (int i = 0; i < 11; i++) {
                multiTable[i] = a * i;
            }

            return multiTable;
        }

        return new int[]{};
    }

    /**
     * 17. Написать метод, который принимает массив целых чисел
     * и возвращает массив четных чисел, если четных чисел больше,
     * или массив нечетных чисел, если нечетных чисел больше.
     */

    public static int[] arrayEvenOrOdd1(int[] array) {

        int countEven = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countEven++;
            }
        }

        int length = lengthArray(array);
        int countOdd = length - countEven;

        int[] arrayEven = new int[countEven];
        int[] arrayOdd = new int[countOdd];
        int[] arrayEmpty = new int[0];

        int number = 0;

        if (countEven == countOdd) {
            return arrayEmpty;
        } else if (countOdd > countEven) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 != 0) {
                    arrayOdd[number] = array[i];
                    number++;
                }
            }
            return arrayOdd;
        } else if (countEven > countOdd) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    arrayEven[number] = array[i];
                    number++;
                }
            }
        }
        return arrayEven;
    }

    public static int[] arrayEvenOrOdd(int[] array) {

        int countEven = countEvenElements(array);
        int countOdd = countOddElements(array);


        if (countEven == countOdd) {

            return new int[]{};
        } else if (countEven < countOdd) {

            return arrayOddNumbers(array);
        } else

            return arrayEvenNumbers(array);
    }

    public static int[] array17(int[] array) {

        if (checkForEmptyArray(array)) {

            return arrayEvenOrOdd(array);
        }

        return new int[]{};
    }

    /**
     * 18. Написать метод, который принимает на вход длину массива
     * и генерирует массив случайных положительных чисел
     * от 0 до 100 исключительно.
     */

    public static int[] arrayRandom18(int length) {

        int[] randomArr = new int[length];

        for (int i = 0; i < randomArr.length; i++) {
            randomArr[i] = randomNumInclusive(100, 0);
        }

        return randomArr;
    }

    //randomArr[i] = ((int)(Math.random() * 99) + 1);
    //randomArr[i] = (int)(Math.random() * 101);

    /**
     * 19. Написать метод, который принимает на вход длину массива l
     * и количество знаков d (однозначные, двузначные, трехзначные
     * и тд числа), и генерирует массив случайных целых положительных
     * чисел длины l, в котором все числа имеют количество знаков d
     */

    public static int[] arrayRandom19(int length, int digit) {

        int[] randomArr = new int[length];

        for (int i = 0; i < randomArr.length; i++) {
            if (digit < 1 || digit > 5) {

                return new int[]{};
            } else if (digit == 1) {
                randomArr[i] = (int) (Math.random() * 10);
            } else if (digit == 2) {
                randomArr[i] = ((int) (Math.random() * 90) + 10);
            } else if (digit == 3) {
                randomArr[i] = ((int) (Math.random() * 900) + 100);
            } else if (digit == 4) {
                randomArr[i] = ((int) (Math.random() * 9000) + 1000);
            } else if (digit == 5) {
                randomArr[i] = ((int) (Math.random() * 90000) + 10000);
            }
        }

        return randomArr;
    }

    //проверка на длину массива нецелесообразна, т.к. при передаче
    //в параметры длину 0 - метод вернет пустой массив, как и при проверке
    public static int[] arrayRandom19_1(int length, int digit) {

        int[] randomArr = new int[length];

        if (checkForEmptyArray(randomArr)) {
            for (int i = 0; i < randomArr.length; i++) {
                if (digit < 1 || digit > 5) {
                    return randomArr = new int[0];
                } else if (digit == 1) {
                    randomArr[i] = (int) (Math.random() * 10);
                } else if (digit == 2) {
                    randomArr[i] = ((int) (Math.random() * 90) + 10);
                } else if (digit == 3) {
                    randomArr[i] = ((int) (Math.random() * 900) + 100);
                } else if (digit == 4) {
                    randomArr[i] = ((int) (Math.random() * 9000) + 1000);
                } else if (digit == 5) {
                    randomArr[i] = ((int) (Math.random() * 90000) + 10000);
                }
            }
            return randomArr;
        }

        return new int[]{};
    }

    /**
     * 20. Написать метод, который принимает на вход массив
     * целых положительных чисел, и возвращает массив
     * только двузначных чисел.
     * Проверить работу метода на массиве из задания 18.
     */

    //решение Ирины
    public static int[] createDoubleDigitsArray(int[] array) {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 9 && array[i] < 100) {
                count++;
            }
        }

        int[] newArray = new int[count];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 9 && array[i] < 100) {
                newArray[newArray.length - count] = array[i];
                count--;
            }
        }

        return newArray;
    }

    /**
     * 21. Написать метод, который принимает на вход массив
     * целых положительных двузначных чисел, и возвращает массив
     * разниц между десятками и единицами
     */

    public static int[] differenceBetweenTenAndOne(int[] array) {

        if (array.length != 0) {
            int[] arr = new int[array.length];

            for (int i = 0; i < array.length; i++) {
                //arr[i] = array[i] / 10 * 10 - array[i] % 10;
                arr[i] = Math.abs(array[i] / 10 - array[i] % 10);
            }

            return arr;
        }

        return new int[]{};
    }

    /**
     * 22. Написать метод, который принимает массив из 11 целых
     * положительных чисел от 0 до 9, и возвращает массив,
     * который содержит номер телефона, состоящий из этих чисел,
     * и название страны, которой номер принадлежит.
     * Например:
     * method({1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7}) ->
     * {“1(800)123-45-67”, “USA”}
     */

    public static String[] getPhoneNumber(int[] array) {
        if (array == null || array.length == 0) {

            return null;
        }

        String[] arrayPhoneNumber = new String[2];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                arrayPhoneNumber[0] = "" + "\"" + array[0] + "(" + array[1]
                        + array[2] + array[3] + ")" + array[4] + array[5]
                        + array[6] + "-" + array[7] + array[8] + "-"
                        + array[9] + array[10] + "\"";

                if (array[0] == 1) {
                    arrayPhoneNumber[1] = "\"USA\"";
                } else if (array[0] == 2) {
                    arrayPhoneNumber[1] = "\"Canada\"";
                } else if (array[0] == 3) {
                    arrayPhoneNumber[1] = "\"China\"";
                } else if (array[0] == 4) {
                    arrayPhoneNumber[1] = "\"Australia\"";
                } else if (array[0] == 5) {
                    arrayPhoneNumber[1] = "\"New Zeland\"";
                } else if (array[0] == 6) {
                    arrayPhoneNumber[1] = "\"Germany\"";
                } else if (array[0] == 7) {
                    arrayPhoneNumber[1] = "\"Switzerland\"";
                } else if (array[0] == 8) {
                    arrayPhoneNumber[1] = "\"France\"";
                } else if (array[0] == 9) {
                    arrayPhoneNumber[1] = "\"Japan\"";
                }
            } else {

                return null;
            }
        }

        return arrayPhoneNumber;
    }

    /**
     * 23. Написать метод, который принимает массив целых положительных
     * чисел больше 0, и возвращает массив уникальных чисел.
     */

    public static int[] arrayOfUniqueDigits(int[] array) {
        if (checkForEmptyArray(array)) {
            int[] arrUnique;
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        array[i] = Integer.MIN_VALUE;
                    }
                }
            }
            for (int i = 0; i < array.length; i++) {
                if (array[i] == Integer.MIN_VALUE) {
                    count++;
                }
            }
            arrUnique = new int[(array.length - count)];
            count = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] != Integer.MIN_VALUE) {
                    arrUnique[count] = array[i];
                    count++;
                }
            }

            return arrUnique;
        }

        return new int[]{};
    }

    /**
     * 24. Написать метод, который принимает на вход массив целых
     * положительных чисел, и возвращает количество уникальных и
     * неуникальных элементов в этом массиве
     */

    //решение Ирины
    public static int[] countUniqueNonUnique(int[] array) {
        int n = 0;

        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] >= 0) {
                    for (int j = i + 1; j < array.length; j++) {
                        if (array[i] == array[j]) {
                            array[j] = -1;
                            n++;
                        }
                    }
                }
            }

            return new int[]{array.length - n, n};
        }

        return new int[]{};
    }

    /**
     * 25. Написать метод, который принимает на вход массив целых
     * положительных чисел, и 2 целых положительных числа
     * (значения индексов). Метод возвращает массив, который
     * содержит только числа из первого массива
     * в промежутке между индексами.
     * Например:
     * method({1, 2, 3, 4, 5}, 1, 3) -> {2, 3, 4}
     */

    public static int[] subArray(int[] array, int start, int end) {

        if (array.length == 0 || start < 0
                || end > (array.length - 1) || start > end) {

            return new int[]{};
        }

        //int count = 0;

        if (checkPositiveNumbers(array)) {

//            for (int i = start; i < end; i++) {
//                count++;
//            }

            int[] subArr = new int[(end-start) + 1];

            int j = 0;

            for (int i = start; i <= end; i++) {
                subArr[j] = array[i];
                j++;
            }

            return subArr;
        }

        return new int[]{};

    }

    /**
     * 26. Написать метод, который принимает на вход 2 массива int[] и
     * возвращает объединенный массив уникальных неповторяющихся элементов
     */

    public static int[] getUniqueArray(int[] array, int[] array1) {
        if (array == null || array1 == null
                || (array1.length == 0 && array.length == 0)) {

            return null;
        } else {
            int[] arrayUnique = new int[array.length + array1.length];
            for (int i = 0; i < array.length; i++) {
                arrayUnique[i] = array[i];
            }
            for (int i = 0; i < array1.length; i++) {
                arrayUnique[array.length + i] = array1[i];
            }

            return arrayOfUniqueDigits(arrayUnique);
        }
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


        int[] arrayTestTask7 = {1, 2, 3, 4, 5};

        int[] arrayTestTask7_1 = {2147483647, 0, 0, 0, -2147483648};

        int[] arrayTestTask7_2 = {-1, -2, -3, -4, -5};

        int[] arrayTestTask7_3 = {1, 2, 3, 11, 5};

        System.out.println(verifyTwoArrays(arrayI1, arrayTestTask7));
        System.out.println(verifyTwoArrays(arrayI1, arrayTestTask7_3));
        System.out.println(verifyTwoArrays(arrayI2, arrayTestTask7_1));
        System.out.println(verifyTwoArrays(arrayI3, arrayTestTask7_2));

        task(8);

        /**
         * Написать метод, который принимает на вход 5 чисел типа double,
         * и возвращает массив из этих же чисел
         */

        double[] arrayD1 = arrayDouble(1.0, 2.0, 3.0, 4.0,
                5.0);
        double[] arrayD2 = arrayDouble(Double.MAX_VALUE, 0.0, 0.0,
                0.0, Double.MAX_VALUE);
        double[] arrayD3 = arrayDouble(-1.0, -2.0, -3.0, -4.0,
                -5.0);

        System.out.println(Arrays.toString(arrayD1));

        System.out.println(Arrays.toString(arrayD2));

        System.out.println(Arrays.toString(arrayD3));

        double[] arrayTestTask8 = {1.0, 2.0, 3.0, 4.0, 5.0};

        double[] arrayTestTask8_1 = {1.0, 2.0, 3.0, 11.0, 5.0};

        double[] arrayTestTask8_2 = {1.7976931348623157E308, 0.0, 0.0, 0.0,
                1.7976931348623157E308};

        double[] arrayTestTask8_3 = {-1.0, -2.0, -3.0, -4.0, -5.0};

        System.out.println(verifyTwoArrays(arrayD1, arrayTestTask8));
        System.out.println(verifyTwoArrays(arrayD1, arrayTestTask8_1));
        System.out.println(verifyTwoArrays(arrayD2, arrayTestTask8_2));
        System.out.println(verifyTwoArrays(arrayD3, arrayTestTask8_3));


        task(9);

        /**
         * Написать метод, который принимает на вход 5 слов,
         * и возвращает массив из этих слов
         */

        String[] arrayS1 = arrayString("Hi", "Hello", "Bye",
                "Welcome", "Sorry");

        System.out.println(Arrays.toString(arrayS1));

        String[] arrayS2 = arrayString("Hi", "Hello", "Bye",
                "Welcome", "Sorry");

        String[] arrayS3 = arrayString("Goodbye", "Hello", "Bye",
                "Welcome", "Sorry");

        System.out.println(verifyTwoArrays(arrayS1, arrayS2));
        System.out.println(verifyTwoArrays(arrayS1, arrayS3));

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
        System.out.println(Arrays.toString(arrayMultiplication(emptyArray,
                2.5)));

        printLine();

        int[] arrayTask10 = {1, 2, 3, 4, 5, 6};

        int[] arrayTask10_1 = new int[0];

        int[] arrayTask10_2 = {1, 2, -3, 4, 5, 6};

        if (checkForEmptyArray(arrayTask10)) {
            System.out.println(Arrays.toString(arrayMultyNumber(arrayTask10,
                    2.5)));
        } else {
            System.out.println("Array is empty");
        }

        printLine();

        if (checkForEmptyArray(arrayTask10_1)) {
            System.out.println(Arrays.toString(arrayMultyNumber
                    (arrayTask10_1, 2.5)));
        } else {
            System.out.println("Array is empty");
        }

        printLine();

        double[] arrayTest10 = {2.5, 5.0, 7.5, 10.0, 12.5};

        double[] arrayTest10_1 = {2.5, 5.0, 7.5, 10.0, 12.5, 15.0};

        double[] arrayTest10_2 = {0.0, 0.0, 0.0, 0.0, 0.0, 0.0};

        double[] arrayTest10_3 = {-2.5, -5.0, -7.5, -10.0, -12.5, -15.0};

        System.out.println(verifyTwoArrays((arrayMultyNumber(arrayTask10,
                2.5)), arrayTest10));

        System.out.println(verifyTwoArrays((arrayMultyNumber(arrayTask10,
                2.5)), arrayTest10_1));

        System.out.println(verifyTwoArrays((arrayMultyNumber(arrayTask10,
                2.5)), arrayTest10_2));

        System.out.println(verifyTwoArrays((arrayMultyNumber(arrayTask10,
                2.5)), arrayTest10_3));

        task(11);

        /**
         * 11. Написать метод, который принимает на вход массив
         * целых положительных чисел,  и возвращает количество
         * четных чисел в этом массиве
         */

        int[] arrayTask11 = {1, 2, 3, 4, 5, 6};

        int[] arrayTask11_1 = new int[0];

        int[] arrayTask11_2 = {1, 2, -3, 4, 5, 6};

        int abc1 = array11(arrayTask11);
        int abc1_1 = array11(arrayTask11_1);
        int abc1_2 = array11(arrayTask11_2);

        System.out.println(abc1);
        System.out.println(abc1_1);
        System.out.println(abc1_2);

        printLine();

//        System.out.println(countOfElements1(arrayTask11));
//
//        System.out.println(countOfElements1(arrayTask11_1));
//
//        System.out.println(countOfElements1(arrayTask11_2));

        if (checkForEmptyArray(arrayTask11)) {
            if (checkPositiveNumbers(arrayTask11)) {
                System.out.println(countEvenElements(arrayTask11));
            } else {
                System.out.println("Array have negative number");
            }
        } else {
            System.out.println("Array is empty");
        }

        int resulOfTask11 = (countEvenElements(arrayTask11));

        System.out.println(verifyTwoValue(resulOfTask11, 3));
        System.out.println(verifyTwoValue(resulOfTask11, 1));
        System.out.println(verifyTwoValue(resulOfTask11, 0));
        System.out.println(verifyTwoValue(resulOfTask11, -3));

        if (checkForEmptyArray(arrayTask11_1)) {
            if (checkPositiveNumbers(arrayTask11_1)) {
                System.out.println(countEvenElements(arrayTask11_1));
            } else {
                System.out.println("Array have negative number");
            }
        } else {
            System.out.println("Array is empty");
        }

        if (checkForEmptyArray(arrayTask11_2)) {
            if (checkPositiveNumbers(arrayTask11_2)) {
                System.out.println(countEvenElements(arrayTask11_2));
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

        int[] arrTask12 = {1, 2, 3, 4, 5, 6};

        int[] arrTask12_1 = new int[0];

        int[] arrTask12_2 = {-2, -3, 8, 5, -9, 7};

        printArray(array12(arrTask12));
        printArray(array12(arrTask12_1));
        printArray(array12(arrTask12_2));

        printLine();

        printArray(array12_1(arrTask12));
        printArray(array12_1(arrTask12_1));
        printArray(array12_1(arrTask12_2));

        printLine();

        if (checkForEmptyArray(arrTask12)) {
            if (checkPositiveNumbers(arrTask12)) {
                printArray(arrayOddNumbers(arrTask12));
            } else {
                System.out.println("Array have negative number");
            }
        } else {
            System.out.println("Array is empty");
        }

        int[] arrTest12 = {1, 3, 5};
        int[] arrTest12_1 = {0, 0, 0};

        System.out.println(verifyTwoArrays(arrayOddNumbers(arrTask12),
                arrTest12));
        System.out.println(verifyTwoArrays(arrayOddNumbers(arrTask12),
                arrTest12_1));

        if (checkForEmptyArray(arrTask12_1)) {
            if (checkPositiveNumbers(arrTask12_1)) {
                printArray(arrayOddNumbers(arrTask12_1));
            } else {
                System.out.println("Array have negative number");
            }
        } else {
            System.out.println("Array is empty");
        }

        if (checkForEmptyArray(arrTask12_2)) {
            if (checkPositiveNumbers(arrTask12_2)) {
                printArray(arrayOddNumbers(arrTask12_2));
            } else {
                System.out.println("Array have negative number");
            }
        } else {
            System.out.println("Array is empty");
        }

        task(13);

        /**
         * 13. Написать метод, который принимает на вход массив целых чисел,
         * и возвращает массив значений true или false, если числа больше 10
         */

        int[] arrTask13 = {10, 20, 30, 4, 5, 6};

        int[] arrTask13_1 = new int[0];

        int[] arrTask13_2 = {-10, 20, 30, 4, 5, 6};

        int[] arrTask13_3 = {0, 0, 0, 0, 0, 0};

        printArray(array13(arrTask13));
        printArray(array13(arrTask13_1));
        printArray(array13(arrTask13_2));
        printArray(array13(arrTask13_3));

        printLine();

        printArray(array13_1(arrTask13));
        printArray(array13_1(arrTask13_1));
        printArray(array13_1(arrTask13_2));
        printArray(array13_1(arrTask13_3));

        printLine();

        printArray(array13_2(arrTask13));
        printArray(array13_2(arrTask13_1));
        printArray(array13_2(arrTask13_2));
        printArray(array13_2(arrTask13_3));

        printLine();

        boolean[] arrTest13 = {false, true, true, false, false, false};
        boolean[] arrTest13_1 = {true, true, true, false, false, false};

        if (checkForEmptyArray(arrTask13)) {
            printArray(isNumMoreTen(arrTask13));
        } else {
            System.out.println("Array is empty");
        }

        System.out.println(verifyTwoArrays(isNumMoreTen(arrTask13), arrTest13));
        System.out.println(verifyTwoArrays(isNumMoreTen(arrTask13),
                arrTest13_1));

        if (checkForEmptyArray(arrTask13_1)) {
            printArray(isNumMoreTen(arrTask13_1));
        } else {
            System.out.println("Array is empty");
        }

        if (checkForEmptyArray(arrTask13_2)) {
            printArray(isNumMoreTen(arrTask13_2));
        } else {
            System.out.println("Array is empty");
        }

        if (checkForEmptyArray(arrTask13_3)) {
            printArray(isNumMoreTen(arrTask13_3));
        } else {
            System.out.println("Array is empty");
        }

        task(14);

        /**
         * 14. Написать метод, который принимает на вход массив слов,
         * и возвращает строку, состоящую из этих слов
         */

        String[] str = {"Hello", "world", "and", "good", "morning"};
        String[] strEmpty = new String[0];
        String strTest14 = "Hello world and good morning ";
        String strTest14_1 = "Hello world and good morning";


        if (checkForEmptyArray(str)) {
            System.out.println(makeString(str));
        } else {
            printArrayIsEmpty();
        }

        System.out.println(verifyTwoValue(makeString(str), strTest14));
        System.out.println(verifyTwoValue(makeString(str), strTest14_1));

        if (checkForEmptyArray(strEmpty)) {
            System.out.println(makeString(strEmpty));
        } else {
            printArrayIsEmpty();
        }

        task(15);

        /**
         * 15. Написать метод, который принимает массив целых чисел
         * и считает сумму чисел во второй половине массива
         */

        int[] arrTask15 = {10, 20, 30, 4, 5, 6, 9};
        int[] arrTask15_1 = {10, 20, 30, 4, 5, 6};
        int[] arrTask15_2 = new int[0];
        int[] arrTask15_3 = {0, 0, 0, 0, 0, 0};

        System.out.println(array15(arrTask15));
        System.out.println(array15(arrTask15_1));
        System.out.println(array15(arrTask15_2));
        System.out.println(array15(arrTask15_3));

        printLine();

        if (checkForEmptyArray(arrTask15)) {
            System.out.println(sumOfSecondHalf(arrTask15));
        } else {
            printArrayIsEmpty();
        }

        System.out.println(verifyTwoValue(sumOfSecondHalf(arrTask15),
                24));
        System.out.println(verifyTwoValue(sumOfSecondHalf(arrTask15_1),
                15));
        System.out.println(verifyTwoValue(sumOfSecondHalf(arrTask15),
                0));
        System.out.println(verifyTwoValue(sumOfSecondHalf(arrTask15),
                -15));

        if (checkForEmptyArray(arrTask15_1)) {
            System.out.println(sumOfSecondHalf(arrTask15_1));
        } else {
            printArrayIsEmpty();
        }

        if (checkForEmptyArray(arrTask15_2)) {
            System.out.println(sumOfSecondHalf(arrTask15_2));
        } else {
            printArrayIsEmpty();
        }

        if (checkForEmptyArray(arrTask15_3)) {
            System.out.println(sumOfSecondHalf(arrTask15_3));
        } else {
            printArrayIsEmpty();
        }

        task(16);

        /**
         * 16. Написать метод, который принимает на вход целое положительные
         * число в пределах от 1 до 10 исключительно, и возвращает таблицу
         * умножения на это число в виде массива
         * Например, метод(2) -> {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20}
         */

        int a = 0; // Начальное значение диапазона - "от"
        int b = 10; // Конечное значение диапазона - "до"

        int random_number1 = a + (int) (Math.random() * b);
        int random_number2 = ((int) (Math.random() * 9) + 1);

        printArray(multiplicationTable(random_number1));
        printArray(multiplicationTable(random_number2));
        printArray(multiplicationTable(9));
        printArray(multiplicationTable(3));

        printLine();

        printArray(multiplicationTable(1));
        printArray(multiplicationTable(10));
        printArray(multiplicationTable(0));
        printArray(multiplicationTable(11));

        int[] arrTest16 = {0, 8, 16, 24, 32, 40, 48, 56, 64, 72, 80};
        int[] arrTest16_1 = {1, 8, 16, 24, 32, 40, 48, 56, 64, 72, 80};
        int[] arrTest16_2 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        System.out.println(verifyTwoArrays(multiplicationTable(8),
                arrTest16));
        System.out.println(verifyTwoArrays(multiplicationTable(8),
                arrTest16_1));
        System.out.println(verifyTwoArrays(multiplicationTable(0),
                arrTest16_2));

        task(17);

        /**
         * 17. Написать метод, который принимает массив целых чисел
         * и возвращает массив четных чисел, если четных чисел больше,
         * или массив нечетных чисел, если нечетных чисел больше.
         */

        int[] arrTask17 = {1, 8, 16, 24, 33, -40, 48};
        int[] arrTask17_1 = {1, 7, -17, 24, 33, 40, 48};
        int[] arrTask17_2 = {1, 8, 16, 24, 33, 41};
        int[] arrTask17_3 = {0, 7, 0, 17, 0, 0};

        printArray(arrayEvenOrOdd1(arrTask17));
        printArray(arrayEvenOrOdd1(arrTask17_1));
        printArray(arrayEvenOrOdd1(arrTask17_2));
        printArray(arrayEvenOrOdd1(arrTask17_3));

        printLine();

        printArray(arrayEvenOrOdd(arrTask17));
        printArray(arrayEvenOrOdd(arrTask17_1));
        printArray(arrayEvenOrOdd(arrTask17_2));
        printArray(arrayEvenOrOdd(arrTask17_3));

        printLine();

        printArray(array17(arrTask17));
        printArray(array17(arrTask17_1));
        printArray(array17(arrTask17_2));
        printArray(array17(arrTask17_3));

        printLine();

        int[] arrTest17 = {8, 16, 24, -40, 48};
        int[] arrTest17_1 = {0, 0, 0, 0};

        System.out.println(verifyTwoArrays(arrayEvenOrOdd(arrTask17),
                arrTest17));
        System.out.println(verifyTwoArrays(arrayEvenOrOdd(arrTask17),
                arrTest17_1));
        System.out.println(verifyTwoArrays(arrayEvenOrOdd(arrTask17_3),
                arrTest17_1));

        task(18);

        /**
         * 18. Написать метод, который принимает на вход длину массива
         * и генерирует массив случайных положительных чисел
         * от 0 до 100 исключительно.
         */

        printArray(arrayRandom18(12));
        //printArray(arrayRandom18(-12));
        System.out.println(Arrays.toString(arrayRandom18(0)));
        //printArray(arrayRandom(-3));

        task(19);

        /**
         * 19. Написать метод, который принимает на вход длину массива l
         * и количество знаков d (однозначные, двузначные, трехзначные
         * и тд числа), и генерирует массив случайных целых положительных
         * чисел длины l, в котором все числа имеют количество знаков d
         */

        printArray(arrayRandom19(6, 1));
        printArray(arrayRandom19(6, 2));
        printArray(arrayRandom19(6, 3));
        printArray(arrayRandom19(6, 4));
        printArray(arrayRandom19(6, 5));
        printArray(arrayRandom19(0, 1));
        System.out.println(Arrays.toString(arrayRandom19(5, 0)));
        System.out.println(Arrays.toString(arrayRandom19(5, 6)));
        System.out.println(Arrays.toString(arrayRandom19_1(5, 0)));
        System.out.println(Arrays.toString(arrayRandom19_1(5, 6)));

        task(20);

        /**
         * 20. Написать метод, который принимает на вход массив
         * целых положительных чисел, и возвращает массив
         * только двузначных чисел.
         * Проверить работу метода на массиве из задания 18.
         */

        System.out.println(
                Arrays.toString(
                        createDoubleDigitsArray(arrayRandom18(8)))
        );

        int[] arr20 = {8, 95, 365, 2, 74, 21, 3, 741};

        System.out.println(Arrays.toString(createDoubleDigitsArray(arr20)));

        task(21);

        /**
         * 21. Написать метод, который принимает на вход массив
         * целых положительных двузначных чисел, и возвращает массив
         * разниц между десятками и единицами
         */

        int[] arr21 = {95, 25, 27, 74, 21, 93};

        System.out.println(Arrays.toString(differenceBetweenTenAndOne(arr21)));

        task(22);

        /**
         * 22. Написать метод, который принимает массив из 11 целых
         * положительных чисел от 0 до 9, и возвращает массив,
         * который содержит номер телефона, состоящий из этих чисел,
         * и название страны, которой номер принадлежит.
         * Например:
         * method({1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7}) ->
         * {“1(800)123-45-67”, “USA”}
         */

        int[] arr22 = {1, 8, 0, 0, 1, 2, 3, 4, 5, 6, 7};

        System.out.println(Arrays.toString(getPhoneNumber(arr22)));

        task(23);

        /**
         * 23. Написать метод, который принимает массив целых положительных
         * чисел больше 0, и возвращает массив уникальных чисел.
         */

        int[] arr23 = {78, 7, 45, 45, 7, 7, 23};

        int[] arr23_1 = {33, 33, 33, 33};

        System.out.println(Arrays.toString(arrayOfUniqueDigits(arr23)));

        System.out.println(Arrays.toString(arrayOfUniqueDigits(arr23_1)));

        task(24);

        /**
         * 24. Написать метод, который принимает на вход массив целых
         * положительных чисел, и возвращает количество уникальных и
         * неуникальных элементов в этом массиве
         */

        int[] arr24 = {78, 7, 45, 45, 7, 7, 23};
        int[] arr24_1 = {1, 1, 1, 1, 1, 2};
        int[] arr24_3 = {0, 0, 0, 0, 0};

        System.out.println(Arrays.toString(countUniqueNonUnique(arr24)));
        System.out.println(Arrays.toString(countUniqueNonUnique(arr24_1)));
        System.out.println(Arrays.toString(countUniqueNonUnique(arr24_3)));

        task(25);

        /**
         * 25. Написать метод, который принимает на вход массив целых
         * положительных чисел, и 2 целых положительных числа
         * (значения индексов). Метод возвращает массив, который
         * содержит только числа из первого массива
         * в промежутке между индексами.
         * Например:
         * method({1, 2, 3, 4, 5}, 1, 3) -> {2, 3, 4}
         */

        int[] arr25 = {1, 2, 3, 4, 5};

        int[] arr25_1 = {1, 2, 56, 3, 4, 5};

        int[] arr25_2 = new int[0];



        System.out.println(Arrays.toString(subArray(arr25,1,3)));
        System.out.println(Arrays.toString(subArray(arr25_1,1,4)));

        System.out.println(Arrays.toString(subArray(arr25_1,2,1)));

        System.out.println(Arrays.toString(subArray(arr25_2,1,4)));


        task(26);

        /**
         * 26. Написать метод, который принимает на вход 2 массива int[] и
         * возвращает объединенный массив уникальных неповторяющихся элементов
         */

        int[] arr26 = {1, 3, 25, 1, 8};

        int[] arr26_1 = {2, 4, 14, 1, 8};

        System.out.println(Arrays.toString(getUniqueArray(arr26, arr26_1)));


    }
}
