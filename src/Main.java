import static utils.Utils.*;

public class Main {

    public static void main(String[] args) {

        int[] arrayMainIntPositive = {10,20,30,40};
        int[] arrayMainIntNegative = {10,-20,30,40};
        int[] arrayMainEmpty = new int [0];
        int[] arrayMainNull = {0,0,0,0};

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



    }
}
