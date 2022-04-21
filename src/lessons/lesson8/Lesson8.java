package lessons.lesson8;

//import static utils.Utils.line; //package/class/method
import static utils.Utils.*;

public class Lesson8 {

    public static void main(String[] args) {

        int[] arr = new int[] {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        int[] arr1 = new int[0];
        int[] arr4 = {};

        int[] arr5 = new int[1];
        int[] arr6 = {0};

        int[] arr7 = new int[3];
        int[] arr8 = {0, 0, 0};

        int a = 4;
        double b = 5.5;

        Integer intReg = 4;
        Integer intReg1 = 4;
        Double doubReg = 5.5;

        Integer intObject = new Integer(4);
        Double doubObject = new Double(5.5);

        String str1 = "Hello";
        String str2 = "Hello";

        String strObject = new String("Hello");

        //Math math = new Math();

        System.out.println(str1 == str2);       // true - здесь равны ссылки
        System.out.println(str1 == strObject);  // false
        System.out.println(strObject);

        System.out.println("---------------");
        System.out.println(intReg == intReg1);    // true
        System.out.println(intReg == intObject);  //false

        String str11 = "Cat";
        String str22 = "Cat";

        String str55 = new String("Cat");

        String str33 = "Dog";
        String str44 = "Dog";

        String str66 = "Horse";

//        str11 == str22;
//        str11 != str33;
//        str22 != str33;
//        str33 == str44;
//        str11 != str55

        System.out.println("---------------");
        System.out.println(str11 == str55);            // false
        System.out.println(str11 == Lesson8_1.str1_1); // true

        System.out.println("---------------");
        System.out.println(str11.equals(str22));  //true - здесь равны значения
        System.out.println(str11.equals(str55)); //true - здесь равны значения
        System.out.println(str11.equals(str33)); //false не равны значения

        System.out.println("---------------");
        System.out.println(intReg.equals(intReg1)); //true здесь равны значения
        System.out.println(intReg.equals(intObject)); //true равны значения

        System.out.println("---------------");
        //System.out.println(str33.equals(Lesson8_1.str2_2)); - невозможно
        //вызвать, т.к. у str2_2 модификатор private

        System.out.println(str66.equals(Lesson8_1.str3_3));

        System.out.println(Lesson8_1.str3_3);

//        Utils.line();
//        Utils.ln();
//        Utils.line();

        line();
        ln();
        line();















    }
}
