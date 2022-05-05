import java.util.Arrays;

import static utils.Utils.*;



public class Main {

    public static void printSeq(double start, double end, double step, int d) {
        if (start < end && step > 0) {
            for (start = start; start < end; start += step) {
                System.out.println(formatDouble(start, d));
            }
        } else if (start > end && step < 0) {
            for (start = start; start > end; start += step) {
                System.out.println(formatDouble(start, d));
            }
        } else {
            System.out.println("Invalid data");
        }
    }

    public static void main(String[] args) {

        int[] arrayMainIntPositive = {10, 20, 30, 40};
        int[] arrayMainIntPositiveCopy = {10, 20, 30, 40};
        int[] arrayMainIntNegative = {10, -20, 30, 40};
        int[] arrayMainEmpty = new int[0];
        int[] arrayMainNull = {0, 0, 0, 0};

        double[] arrayMainDoubPositive = {1.1, 2.1, 3.1, 4.1};
        double[] arrayMainDoubNegative = {1.1, -2.1, 3.1, 4.1};

        System.out.println(checkPositiveNumbers(arrayMainIntPositive));
        System.out.println(checkPositiveNumbers(arrayMainIntNegative));
        System.out.println(checkPositiveNumbers(arrayMainEmpty));
        System.out.println(checkPositiveNumbers(arrayMainNull));
        System.out.println(checkPositiveNumbers(arrayMainDoubPositive));
        System.out.println(checkPositiveNumbers(arrayMainDoubNegative));

        printLine();

        System.out.println(averageArray(arrayMainIntPositive));
        System.out.println(averageArray(arrayMainDoubPositive));

        printLine();

        System.out.println(minValue(arrayMainIntPositive));
        System.out.println(minValue(arrayMainDoubPositive));

        printLine();

        System.out.println(maxValue(arrayMainIntPositive));
        System.out.println(maxValue(arrayMainDoubPositive));

        printLine();

        System.out.println(verifyTwoValue(3, 3));
        System.out.println(verifyTwoValue(3.2, 3.2));
        System.out.println(verifyTwoValue(true, true));
        System.out.println(verifyTwoValue("Hi", "Hi"));

        System.out.println(verifyTwoValue(1, 3));
        System.out.println(verifyTwoValue(1.2, 3.2));
        System.out.println(verifyTwoValue(false,
                true));
        System.out.println(verifyTwoValue("Hy", "Hi"));

        printLine();

        System.out.println(verifyTwoArrays(arrayMainIntPositive,
                arrayMainIntPositiveCopy));
        System.out.println(verifyTwoArrays(arrayMainIntPositive,
                arrayMainIntNegative));

        printLine();

        System.out.println(randomNumInclusive(0,10));
        System.out.println(randomNumInclusive(1,5));
        System.out.println(randomNumInclusive(10,100));

        printLine();

        printArray(arrayRandomInclusive(5,10,1));
        System.out.println(Arrays.toString(arrayRandomInclusive(0,10,
                1)));


        printLine();


        System.out.println(formatDouble(12.658899, 3));

        System.out.println("_______________");

        printSeq(10.5, 20.75, 1.29, 2);

        System.out.println("_______________");

        printSeq(15.9, 0, -1.45, 2);







    }
}
