package utils;

public class Utils {

    //сюда складываем переменные и методы, которые не имеют отношения
    // к бизнес-логике

    //* со звездочкой метод - с return, без звездочки - с void

    //метод для печати разделительной строки printLine
    //метод для печати пустой строки printNewLine
    //метод для печати номера задачи task
    //метод проверки массива не пустой ли он checkForEmptyArray *
    //метод для печати массива printArray
    //метод для вычисления среднего значения элементов массива averageArray
    //метод вычисления минимального значения в массиве minValue
    //метод вычисления максимального значения в массиве maxValue
    //метод определения длины массива lengthArray *
    //метод проверки, что числа в массиве положительные checkPositiveNumbers*

    public static void printLine() {
        System.out.println("-------------");
    }

    public static void printEmptyLine() {
        System.out.println();
    }

    //метод для печати номера задачи

    public static void task(int number) {

        System.out.println("\n" + "\n===============\n" + "Task "
                + number + "\n===============\n");
    }

    //метод проверки массива не пустой ли он

    public static boolean checkForEmptyArray(int[] array) {

        if (array.length != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkForEmptyArray(String[] array) {

        if (array.length != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkForEmptyArray(double[] array) {

        if (array.length != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkForEmptyArray(boolean[] array) {

        if (array.length != 0) {
            return true;
        } else {
            return false;
        }
    }

    //метод для печати массива

    public static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(double[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(boolean[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //метод для вычисления среднего значения элементов массива

    public static double averageArray(int[] array) {

        double sumOfElements = 0;

        for (int i = 0; i < array.length; i++) {
            sumOfElements = sumOfElements + array[i];
        }
        return sumOfElements / array.length;
    }

    public static double averageArray(double[] array) {

        double sumOfElements = 0;

        for (int i = 0; i < array.length; i++) {
            sumOfElements = sumOfElements + array[i];
        }
        return sumOfElements / array.length;
    }

    //метод вычисления минимального значения в массиве

    public static void minValue(int[] array) {

        int min = Integer.MAX_VALUE;
        if (checkForEmptyArray(array)) {
            for (int i = 0; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
            }
            System.out.println(min);
        } else {
            System.out.println("Array is empty");
        }
    }

    public static void minValue(double[] array) {

        double min = Integer.MAX_VALUE;
        if (checkForEmptyArray(array)) {
            for (int i = 0; i < array.length; i++) {
                if (min > array[i]) {
                    min = array[i];
                }
            }
            System.out.println(min);
        } else {
            System.out.println("Array is empty");
        }
    }

    //метод вычисления максимального значения в массиве

    public static void maxValue(int[] array) {

        int max = Integer.MIN_VALUE;
        if (checkForEmptyArray(array)) {
            for (int i = 0; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
            }
            System.out.println(max);
        } else {
            System.out.println("Array is empty");
        }
    }

    public static void maxValue(double[] array) {

        double max = Integer.MIN_VALUE;
        if (checkForEmptyArray(array)) {
            for (int i = 0; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                }
            }
            System.out.println(max);
        } else {
            System.out.println("Array is empty");
        }
    }

    //метод определения длины массива

    public static int lengthArray(int[] array) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            count++;
        }
        return count;
    }

    public static int lengthArray(double[] array) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            count++;
        }
        return count;
    }

    public static int lengthArray(boolean[] array) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            count++;
        }
        return count;
    }

    public static int lengthArray(String[] array) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {
            count++;
        }
        return count;
    }

    //метод на проверку, что числа в массиве положительные checkPositiveNumbers

    public static boolean checkPositiveNumbers(int[] array) {

        boolean isNumberPositive = true;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                return false;
            }
        }
        return isNumberPositive;
    }

    public static boolean checkPositiveNumbers(double[] array) {

        boolean isNumberPositive = true;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0.0) {
                return false;
            }
        }
        return isNumberPositive;
    }


}
