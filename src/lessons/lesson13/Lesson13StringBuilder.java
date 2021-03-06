package lessons.lesson13;

public class Lesson13StringBuilder {

    public static void main(String[] args) {

        String line = "____________________________________________________" +
                "_____";
        String ll = "|\t";
        String lr = "\t|";

        String str1 = "QA";
        int num1 = 4;
        String str2 = "Every";
        int num2 = 1;

        long start = 0;
        long end = 0;

        String resultPlus = "";
        start = System.nanoTime();
        resultPlus = str1 + num1 + str2 + num2;
        end = System.nanoTime();

        System.out.println(line);
        System.out.println(ll + "result\t\t" + lr + ll + "Concatenation"
                + lr + ll + "Time" + "\t" + lr);
        System.out.println(line);
        System.out.println(ll + "resultPlus\t" + lr + ll + resultPlus
                + "\t" + lr + ll + (end - start) + lr);
        System.out.println(line);

        String resultConcat = "";
        start = System.nanoTime();

        resultConcat = resultConcat
                .concat(str1)
                .concat(String.valueOf(num1))
                .concat(str2)
                .concat(String.valueOf(num2));

        end = System.nanoTime();

        System.out.println(ll + "resultConcat" + lr + ll + resultConcat
                + "\t" + lr + ll + (end - start) + "\t" + lr);
        System.out.println(line);

        StringBuilder resultSB = new StringBuilder();
        start = System.nanoTime();

        resultSB
                .append(str1)
                .append(num1)
                .append(str2)
                .append(num2);

        end = System.nanoTime();

        System.out.println(ll + "resultSB" + "\t" + lr + ll + resultSB + "\t"
                + lr + ll + (end - start) + "\t" + lr);
        System.out.println(line);

        StringBuffer resultBuf = new StringBuffer();

        start = System.nanoTime();

        resultBuf
                .append(str1)
                .append(num1)
                .append(str2)
                .append(num2);

        end = System.nanoTime();

        System.out.println(ll + "resultBuf" + "\t" + lr + ll + resultBuf
                + "\t" + lr + ll + (end - start) + "\t" + lr);
        System.out.println(line);
    }
}
