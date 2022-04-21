package lessons.lessons1to7;

public class Lesson3_1 {

    //    static int a;
    //    static Integer A;
    //    static double d;
    //    static Double D;
    //    static String S;

    public static void main(String[] args) {

        int a;
        Integer A;

        //a = (A.toString());
        //Так нельзя!!!

        a = 10;
        A = 0;
        A = null;
        A = 15;

        System.out.println(A);

        A.toString();

        System.out.println(A.toString());

        String AA = A.toString();

        //String BB = A;
        //Так нельзя!!!

        System.out.println(A + A);
        System.out.println(AA + AA);

        System.out.println(A + A);
        System.out.println(A + A.toString());

        System.out.println(A.toString() + A);
        System.out.println(A.toString() + A.toString());
        System.out.println("15" + "15");

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        Integer.sum(5, 10);
        System.out.println(Integer.sum(5, 10));
        int sum = Integer.sum(5, 10);
        System.out.println(sum);

        int c = 5;
        Integer C = c;
        int q = Integer.MAX_VALUE;

        int sum1 = Short.MAX_VALUE;
        //short sum2 = Integer.sum(3, 5);
        //Так нельзя!!!

        Integer.valueOf(c);

//        System.out.println(a);
//        System.out.println(A);
//
//        System.out.println(d);
//        System.out.println(D);
//
//        System.out.println(S);
    }
}