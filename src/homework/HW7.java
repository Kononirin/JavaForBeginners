package homework;

import static utils.Utils.*;

public class HW7 {

//    //метод для вычисления среднего значения элементов массива
//
//    public static void averageArray (int [] array) {
//
//        double sumOfElements = 0;
//
//        if (checkForEmptyArray(array)) {
//            for (int i = 0; i < array.length; i++) {
//                sumOfElements = sumOfElements + array[i];
//            }
//            System.out.println(sumOfElements/array.length);
//        } else {
//            System.out.println("Array is empty");
//        }
//    }
//
//    //метод вычисления минимального значения в массиве
//
//    public static void minValue(int[] array) {
//
//        int min = Integer.MAX_VALUE;
//        if (checkForEmptyArray(array)) {
//            for (int i = 0; i < array.length; i++) {
//                if (min > array[i]) {
//                    min = array[i];
//                }
//            }
//            System.out.println(min);
//        } else {
//            System.out.println("Array is empty");
//        }
//    }

    //метод вычисления минимального значения в массиве с проверкой
    //чисел в заданном промежутке

    /**
     *
     * int[] catsAges2 = new int[8];
     *
     *         catsAges2[0] = 5;
     *         catsAges2[1] = 3;
     *         catsAges2[2] = 5;
     *         catsAges2[3] = -3;
     *         catsAges2[4] = 4;
     *         catsAges2[5] = 40;
     *         catsAges2[6] = 10;
     *         catsAges2[7] = 1;
     */

    public static void minValueAndRange1 (int[] array, int start, int end) {

        int min = Integer.MAX_VALUE;

        if (checkForEmptyArray(array)) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > start && array[i] < end) {
                    if (min > array[i]) {
                        min = array[i];
                    }
                }
                break;
            }
            System.out.println(min);
        } else {
            System.out.println("Array is empty");
        }

    }

    public static void minValueAndRange (int[] array, int start, int end) {

        int min = Integer.MAX_VALUE;

        if (checkForEmptyArray(array)) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] < start || array[i] > 38) {
                    System.out.println("Invalid data");
                    break;
                }
            }
            for (int j = 0; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                }
                System.out.println(min);
            }
        } else {
            System.out.println("Array is empty");
        }


    }

//    //метод вычисления максимального значения в массиве
//
//    public static void maxValue(int[] array) {
//
//        int max = Integer.MIN_VALUE;
//        if (checkForEmptyArray(array)) {
//            for (int i = 0; i < array.length; i++) {
//                if (max < array[i]) {
//                    max = array[i];
//                }
//            }
//            System.out.println(max);
//        } else {
//            System.out.println("Array is empty");
//        }
//    }

    //метод вычисления максимального значения в массиве с проверкой
    //чисел в заданном промежутке

    public static void maxValueAndRange(int[] array, int start, int end) {

        int max = Integer.MIN_VALUE;

        if (checkForEmptyArray(array)) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] > start && array[i] < end) {
                    if (max < array[i]) {
                        max = array[i];
                    }
                } else {
                    System.out.println("Invalid data");
                }
            }
            System.out.println(max);
        } else {
            System.out.println("Array is empty");
        }
    }

    /**
     * 18. Написать метод, который принимает на вход массив int,
     * и возвращает среднее значение. Проверить работу метода тестом,
     * если параметр - массив catsAges
     */

    public static void average(int[] array) {
        double sum = 0;
        if (array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];

            }
            double aver = sum / array.length;
            System.out.println("Среднее значение - " + aver);
        }
    }

    public static void verifyAverage(int[] actualResult, int[] expectedResult) {

        if (actualResult == expectedResult) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    /**
     * task 21.
     * 21. Создать метод, который принимает на вход массив int,
     * и возвращает минимальное значение, максимальное значение и
     * среднее значение всех чисел массива.
     * Проверить работу метода на массиве из задания 20.
     */

    public static void printMinMaxAverage(int[] array) {

        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);

        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);

        average(array);
    }

    public static void numMinMaxAverage (int[] array) {

        int min = minValue(array);

        int max = maxValue(array);

        double average = averageArray(array);

        System.out.println("min = " + min + ", max = " + max
                + ", average = " + average);
    }

    //метод проверки валидности возраста кота

    public static boolean checkCatsAge (int[] array) {

        boolean isCatReal = true;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 || array[i] > 38) {
                return false;
            }
        }
        return isCatReal;
    }


    public static void main(String[] args) {

        task(0);

        //массивы для проверки

        //пустой массив

        int[] emptyArray = new int[0];

        //массив с неправильными цветами котов

        boolean[] isCatRed1 = new boolean[8];

        isCatRed1[0] = false;
        isCatRed1[1] = false;
        isCatRed1[2] = false;
        isCatRed1[3] = false;
        isCatRed1[4] = true;
        isCatRed1[5] = false;
        isCatRed1[6] = true;
        isCatRed1[7] = false;

        //массив с неправильными именами

        String[] catsNames3 = new String[8];

        catsNames3[0] = "Васька";
        catsNames3[1] = "Джон";
        catsNames3[2] = "Лева";
        catsNames3[3] = "Пиксель";
        catsNames3[4] = "Пушок";
        catsNames3[5] = "Дымок";
        catsNames3[6] = "Снежок";
        catsNames3[7] = "Малыш";

        //массив с отрицательным возрастом котов

        int[] catsAges2 = new int[8];

        catsAges2[0] = 5;
        catsAges2[1] = 3;
        catsAges2[2] = 5;
        catsAges2[3] = -3;
        catsAges2[4] = 4;
        catsAges2[5] = 40;
        catsAges2[6] = 10;
        catsAges2[7] = 1;

        task(1);

        /** task 1.
         * Создать массив catsNames, заполнить его любыми значениями
         * (см картинку котов из презентации).
         */

        String[] catsNames = new String[8];

        catsNames[0] = "Васька";
        catsNames[1] = "Джон";
        catsNames[2] = "Лева";
        catsNames[3] = "Пиксель";
        catsNames[4] = "Пушок";
        catsNames[5] = "Дымок";
        catsNames[6] = "Снежок";
        catsNames[7] = "Малыш";

        task(2);

        /** task 2.
         * В массиве catsNames изменить значение элемента с индексом 4 на
         * “Рыжик”,  а значение элемента с индексом 1 на “Черныш”.
         */

        catsNames[4] = "Рыжик";
        catsNames[1] = "Черныш";

        task(3);

        /** task 3.
         * Создать массив catsColors и заполнить его значениями.
         */

        String[] catsColors = new String[8];

        catsColors[0] = "Grey";
        catsColors[1] = "Black";
        catsColors[2] = "Grey";
        catsColors[3] = "Brown";
        catsColors[4] = "Red";
        catsColors[5] = "Grey";
        catsColors[6] = "Red";
        catsColors[7] = "Grey";

        task(4);

        /** task 4.
         * Создать массив catsAges и заполнить его любыми значениями.
         */

        int[] catsAges = new int[8];

        catsAges[0] = 2;
        catsAges[1] = 3;
        catsAges[2] = 5;
        catsAges[3] = 3;
        catsAges[4] = 4;
        catsAges[5] = 7;
        catsAges[6] = 10;
        catsAges[7] = 1;

        task(5);

        /** task 5.
         * Создать массив isCatRed и заполнить его соответствующими
         * значениями
         */

        boolean[] isCatRed = new boolean[8];

        isCatRed[0] = false;
        isCatRed[1] = false;
        isCatRed[2] = false;
        isCatRed[3] = false;
        isCatRed[4] = true;
        isCatRed[5] = false;
        isCatRed[6] = true;
        isCatRed[7] = false;

        task(6);

        /**
         * Распечатать для массивов catsNames и catsColors:
         *          * имя кота в коробке с номером 6
         *          * имена котов из коробок с четными индексами
         *          * имена котов из коробок, чьи индексы кратны 4
         *          * цвет котов из коробок с нечетными индексами
         *          * цвет котов из коробок, чьи индексы кратны 3
         */

        printArray(catsAges);

        printLine();

        printArray(catsNames);

        printLine();

        printArray(isCatRed);

        printLine();

        System.out.println(catsNames[6]);

        printLine();

        if (checkForEmptyArray(catsNames)) {
            for (int i = 0; i < 8; i++) {
                if (i % 2 == 0) {
                    System.out.println(catsNames[i]);
                }
            }
        }

        printLine();

        if (checkForEmptyArray(catsNames)) {
            for (int i = 0; i < 8; i++) {
                if (i % 4 == 0) {
                    System.out.println(catsNames[i]);
                }
            }
        }

        printLine();

        if (checkForEmptyArray(catsColors)) {
            for (int i = 0; i < 8; i++) {
                if (i % 2 != 0) {
                    System.out.println(catsColors[i]);
                }
            }
        }

        printLine();

        if (checkForEmptyArray(catsColors)) {
            for (int i = 0; i < 8; i++) {
                if (i % 3 == 0) {
                    System.out.println(catsColors[i]);
                }
            }
        }

        task(7);

        /** task 7.
         * Распечатать “Накорми кота!” для всех серых котов
         */

        if (checkForEmptyArray(catsColors)) {
            for (int i = 0; i < 8; i++) {
                if (catsColors[i].equals("Grey")) {
                    System.out.println("Коробка №" + i + "- Накорми кота!");
                }
            }
        }


        task(8);

        /** task 8.
         * Распечатать “Отнеси кота на прививку!”, если возраст кота
         * меньше 2 лет
         */

        if (checkForEmptyArray(catsAges)) {
            for (int i = 0; i < 8; i++) {
                if ((catsAges[i] > 0) && (catsAges[i] < 38)) {
                    if (catsAges[i] < 2) {
                        System.out.println("Из коробки №" + i
                                + " - Отнеси кота на прививку!");
                    }
                } else {
                    System.out.println("Error");
                }
            }
        }

        task(9);

        /** task 9.
         * Для кота в последней коробке распечатать имя, цвет, возраст
         */

        //my solution

        System.out.println("Имя кота - " + catsNames[7] + ", " + "цвет кота - "
                + catsColors[7] + ", " + "возраст кота - " + catsAges[7]);

        printLine();

        //solution from lesson

        if (catsNames.length == catsColors.length
                && catsColors.length == catsAges.length
                && catsNames.length != 0) {
            for (int i = 0; i < catsNames.length; i++) {
                if (i == catsNames.length - 1) {
                    System.out.println("Cat's name is " + catsNames[i]);
                    if (i == catsColors.length - 1) {
                        System.out.println("Cat's color is "
                                + catsColors[i]);
                        if (i == catsAges.length - 1) {
                            System.out.println("Cat's age is "
                                    + catsAges[i]);
                        }
                    }
                }
            }
        }

        printLine();

        //solution from ShurikG

        System.out.println("Cat's name is " + catsNames[catsNames.length - 1]);
        System.out.println("Cat's color is "
                + catsColors[catsColors.length - 1]);
        System.out.println("Cat's age is " + catsAges[catsAges.length - 1]);

        //cделать только через иф
        // (запись примерно 45 минут)

        task(10);

        /**
         * Распечатать имена всех котов, чей возраст больше 2 лет
         */

        if (catsNames.length == catsAges.length && catsNames.length != 0) {
            for (int i = 0; i < 8; i++) {
                if ((catsAges[i] > 0) && (catsAges[i] < 38)) {
                    if (catsAges[i] > 2) {
                        System.out.println("Коту из коробки №" + i
                                + " по имени " + catsNames[i]
                                + " больше 2х лет.");
                    }
                } else {
                    System.out.println("Error");
                }
            }
        }

        task(11);

        /** task 11.
         * Распечатать “Накорми кота!” если имя кота “Рыжик” и значение
         * isCatRed == true
         */

        if (catsNames.length == isCatRed.length && catsNames.length != 0) {
            for (int i = 0; i < 8; i++) {
                if (catsNames[i] == "Рыжик" && isCatRed[i] == true) {
                    System.out.println("Из коробки №" + i + " - Накорми кота!");
                }
            }
        }

        task(12);

        /** task 12.
         * Распечатать средний возраст котов из массива catsAges
         */

        double sum = 0;

        if (checkForEmptyArray(catsAges)) {
            for (int i = 0; i < catsAges.length; i++) {
                if ((catsAges[i] > 0) && (catsAges[i] < 38)) {
                    // проверка на валидный возраст
                    sum = sum + catsAges[i];
                } else {
                    System.out.println("Invalid age");
                }
            }
            System.out.println("Средний возраст котов из короборк - "
                    + sum / catsAges.length);
        }

        printLine();

        System.out.println(averageArray(catsAges));

        task(13);

        /** task 13.
         *  Распечатать возраст самого молодого кота
         */

        if (checkForEmptyArray(catsAges)) {
            if (checkCatsAge(catsAges)) {
                System.out.println("Age of the youngest cat is "
                        + minValue(catsAges));
            } else {
                System.out.println("Invalid data");
            }
        } else {
            System.out.println("Array is empty");
        }

//      эти методы неправильные, т.к. при передаче массива с отрицательным
//      возрастом котов, ответ выводит тот же, что и при положительном варинте

//        if (catsAges.length != 0) {
//            min = catsAges[0];
//            for (int i = 0; i < catsAges.length; i++) {
//                if ((catsAges[i] > 0) && (catsAges[i] < 38)) {
//                    if (catsAges[i] < min) {
//                        min = catsAges[i];
//                    }
//                }
//            }
//            System.out.println("Возраст самого молодого кота " + min);
//        }
//
//        if (catsAges2.length != 0) {
//            min = catsAges2[0];
//            for (int i = 0; i < catsAges2.length; i++) {
//                if ((catsAges2[i] > 0) && (catsAges2[i] < 38)) {
//                    if (catsAges2[i] < min) {
//                        min = catsAges2[i];
//                    }
//                }
//            }
//            System.out.println("Возраст самого молодого кота " + min);
//        }

//        System.out.println(minValue(catsAges));

        task(14);

        /** task 14.
         * Распечатать возраст самого старого кота
         */

        if (checkForEmptyArray(catsAges)) {
            if (checkCatsAge(catsAges)) {
                System.out.println("Age of the oldest cat is "
                        + maxValue(catsAges));
            } else {
                System.out.println("Invalid data");
            }
        } else {
            System.out.println("Array is empty");
        }

        task(15);

        /** task 15.
         * Распечатать количество серых котов
         */

        int countColors = 0;

        if (checkForEmptyArray(catsColors)) {
            for (int i = 0; i < catsColors.length; i++) {
                if (catsColors[i].equals("Grey")) {
                    countColors++;
                }
            }
            System.out.println("Count of grey cats in boxes is "
                    + countColors);
        } else {
            System.out.println("Array is empty");
        }

        task(16);

        /** task 16.
         * Распечатать имя кота, если кот находится в коробке
         * с четным индексом и его возраст не больше 3 лет
         */

        if (catsAges.length == catsNames.length && catsNames.length != 0) {
            for (int i = 0; i < catsAges.length; i++) {
                if ((catsAges[i] < 4) && (i % 2 == 0)) {
                    System.out.println("Коту из коробки № " + i + " по имени "
                            + catsNames[i] + " не больше 3 лет.");
                }
            }
        }

        task(17);

        /** task 17.
         *  Создать массив четных положительных чисел, значения которых
         *  не больше 10. (заполняем значения с помощью цикла for)
         */

        int count = 0;

        for (int i = 0; i < 11; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }

        int[] positive = new int[count];

        for (int i = 0, k = 0; i < 11; i++) {
            if (i % 2 == 0) {
                if (k < positive.length) {
                    positive[k] = i;
                    System.out.print(positive[k] + " ");
                    k++;
                }
            }
        }

        printEmptyLine();

        int evenArrayLength = 0;

        for (int i = 0; i < 11; i += 2) {
            evenArrayLength++;
        }

        int[] evenArray = new int [evenArrayLength];

        for (int i = 0; i < evenArrayLength; i++) {
            evenArray[i] = i * 2;
            System.out.print(evenArray[i] + " ");
        }

        printEmptyLine();

        // решение Ирины

        int length = 0;

        for (int i = 0; i <=10; i += 2) {
            length++;
        }

        int[] array17 = new int [count];

        int number = 0;
        for (int i = 0; i < array17.length; i ++) {
            array17[i] = number;
            number += 2;
        }
        printArray(array17);

        task(18);

        /** task 18.
         * Написать метод, который принимает на вход массив int,
         * и возвращает среднее значение. Проверить работу метода тестом,
         * если параметр - массив catsAges
         */

        average(catsAges);

        int[] catsAges1 = new int[8];

        catsAges1[0] = 2;
        catsAges1[1] = 3;
        catsAges1[2] = 5;
        catsAges1[3] = 3;
        catsAges1[4] = 4;
        catsAges1[5] = 7;
        catsAges1[6] = 10;
        catsAges1[7] = 11;

        verifyAverage(catsAges, catsAges);

        verifyAverage(catsAges, catsAges1);

        task(19);

        /** task 19.
         * Создать массив нечетных отрицательных чисел в промежутке
         * от -1000 до -900
         */

//        int a = 0;
//        for (int i = 1; i <= 99; i++) {
//            if (i % 2 != 0) a++;
//        }
//
//        int[] Mas = new int[a];
//        for (int i = 1, b = 0; i <= 99; i++) {
//            if (i % 2 != 0) {
//                Mas[b] = i;
//                System.out.print(Mas[b] + " ");
//                b++;
//            }
//        }

        int a = 0;
        for (int i = -1000; i < -900; i++) {
            if (i % 2 != 0)
                a++;
        }

        int[] negative = new int[a];
        for (int i = -1000, k = 0; i < -900; i++) {
            if (i % 2 != 0) {
                if (k < negative.length) {
                    negative[k] = i;
                    System.out.print(negative[k] + " ");
                    k++;
                }
            }
        }

        printEmptyLine();
        printLine();

        // решение другого ученика

        int start = -1000;
        int end = -900;
        int lengthArray = end - start;

        if (lengthArray > 0) {
            int[] array18 = new int[lengthArray];

            for (int i = 0; i < lengthArray; i++) {
                if (start % 2 != 0) {
                    array18[i] = start;
                    System.out.print(array18[i] + " ");
                }
                start++;
            }
        }


        task(20);

        /** task 20.
         * 20. Создать массив из 10 случайных положительных целых чисел
         */

        int[] randomArr = new int[10];

        for (int i = 0; i < 10; i++) {
            randomArr[i] = ((int) (Math.random() * Integer.MAX_VALUE));
            System.out.println(randomArr[i]);
        }

        task(21);

        /** task 21.
         * 21. Создать метод, который принимает на вход массив int,
         * и возвращает минимальное значение, максимальное значение и
         * среднее значение всех чисел массива.
         * Проверить работу метода на массиве из задания 20.
         */

        printMinMaxAverage(catsAges);

        System.out.println("-----------");

        printMinMaxAverage(randomArr);

        System.out.println("-----------");

        numMinMaxAverage(randomArr);

        task(22);

        /** task 22.
         * 22. Создать массив четных чисел и массив нечетных чисел
         * из элементов массива из задания 20.
         */

        int odd = 0; // переменная счетчик нечетных чисел

        for (int i = 0; i < 10; i++) {
            if (randomArr[i] % 2 != 0)
                odd++;
        }

        int[] randomOdd = new int[odd];

        int even = 0; // переменная счетчик четных чисел

        for (int i = 0; i < 10; i++) {
            if (randomArr[i] % 2 == 0)
                even++;
        }

        int[] randomEven = new int[even];

        System.out.println("even = " + even);
        System.out.println("odd = " + odd);

        System.out.println();

        System.out.println("Массив четных чисел: ");

        for (int i = 0, j = 0; i < 10; i++) {
            if (randomArr[i] % 2 == 0) {
                if (j < randomArr.length) {
                    randomEven[j] = randomArr[i];
                    System.out.println(randomEven[j]);
                    j++;
                }
            }
        }

        System.out.println();

        System.out.println("Массив нечетных чисел: ");

        for (int i = 0, j = 0; i < 10; i++) {
            if (randomArr[i] % 2 != 0) {
                if (j < randomArr.length) {
                    randomOdd[j] = randomArr[i];
                    System.out.println(randomOdd[j]);
                    j++;
                }
            }
        }

        task(23);

        /**
         * Создать двумерный массив, который состоит из имен, возрастов,
         * цветов котов:
         *
         * Распечатать все данные котов в коробках с четными индексами,
         * используя двумерный массив.
         */

        //String[][] arrayCats2D = new String[3][8];
        String[][] arrayCats2D = {
                {"Мурзик", "Черныш", "Мурка", "Васька", "Рыжик", "Дымка",
                        "Патрик", "Зорро"},
                {"2", "3", "4", "1", "5", "6", "9", "10"},
                {"Grey", "Black", "Grey", "Brown", "Red", "Grey",
                        "Red", "Grey"}};


        for (int j = 0; j < arrayCats2D[0].length; j++) {
            if (j % 2 == 0) {
                System.out.println(arrayCats2D[0][j] + " "
                        + arrayCats2D[1][j] + " " + arrayCats2D[2][j]);
            }
        }

        task(24);

        /** task 24.
         *  24. Создать двумерный массив целых случайных чисел
         *  от 1 до 10 размерности 4*8.
         */

        int[][] arrayRandom2D = new int[4][8];

        for (int i = 0; i < arrayRandom2D.length; i++) {
            System.out.println();
            for (int j = 0; j < arrayRandom2D[i].length; j++) {
                arrayRandom2D[i][j] = ((int) (Math.random() * 10) + 1);
                System.out.print(arrayRandom2D[i][j] + " ");
            }
        }

        task(25);

        /** task 25.
         * 25. Вывести сумму всех четных чисел массива из задания 24.
         *
         */

        int sumEven = 0;

        for (int i = 0; i < arrayRandom2D.length; i++) {
            for (int j = 0; j < arrayRandom2D[i].length; j++) {
                if (arrayRandom2D[i][j] % 2 == 0) {
                    sumEven = sumEven + arrayRandom2D[i][j];
                }
            }
        }
        System.out.println(sumEven);


    }
}
