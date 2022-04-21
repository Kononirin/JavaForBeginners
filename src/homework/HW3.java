package homework;

import java.text.DecimalFormat;

public class HW3 {

    public static void main(String[] args){

        System.out.println("\n============== \n Task2 \n============== \n");

        /**
         * Создать переменные a и b типа byte, присвоить им значения из допустимого диапазона.
         */

        byte a = 80;
        byte b;
        b = 90;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("\n============== \n Task3 \n============== \n");

        /**
         * Создать переменные s и t типа short, присвоить им негативное и позитивное значения с разницей 60000.
         */

        short s = 31000;
        short t;
        t = - 31000;

        System.out.println("s = " + s);
        System.out.println("t = " + t);

        System.out.println("\n============== \n Task4 \n============== \n");

        /**
         * Создать переменную i типа int и присвоить ей минимально возможное значение этого типа.
         * Затем присвоить максимально возможное значение этого типа.
         * Распечатать оба значения в виде таблицы:
         *
         * int min          * значение i
         * int max          * значение i
         */

        int i;
        i = -2147483648;

        String line;
        line = "-------------------------------------";

        System.out.println(line);
        System.out.println("|\tint min\t\t" + "|\t" + i + "\t\t|");

        i = 2147483647;

        System.out.println(line);
        System.out.println("|\tint max\t\t" + "|\t" + i + "\t\t|");
        System.out.println(line);

        System.out.println(line);
        System.out.println("|\tint min\t\t" + "|\t" + Integer.MIN_VALUE + "\t\t|");
        System.out.println(line);
        System.out.println("|\tint max\t\t" + "|\t" + Integer.MAX_VALUE + "\t\t|");
        System.out.println(line);

        System.out.println("\n============== \n Task5 \n============== \n");

        /**
         * Создать переменную phoneNumber и присвоить ей значение номера телефона
         * с кодом страны и города (можно ненастоящий номер телефона, например, 18009998877)
         */

        long phoneNumber;
        phoneNumber = 18009998877L;

        System.out.println("My phoneNumber is " + phoneNumber);

        System.out.println("\n============== \n Task6 and Task7 \n============== \n");

        /**
         * Задание 6
         * Создать переменную f типа float и присвоить ей значение 100.101101. Создать переменную d типа double и присвоить ей значение 100.101101.
         * Распечатать результат в виде таблицы:
         * float f = 100.101101          * значение f
         * double d = 100.101101         * значение d
         *
         * Задание7
         * a) Создать переменную типа Double с именем dd  и инициализировать её результатом суммы чисел 10.09999 и 20.099999.
         * b) Создать переменную типа Float с именем ff  и инициализировать её результатом суммы чисел 10.09999 и 20.099999.
         * Распечатать результаты задания №7, как продолжение таблицы из задания № 6.
         */

        float f;
        f = 100.101101F;

        double d;
        d = 100.101101;

        line = "----------------------------------------------------";

        System.out.println(line);
        System.out.println("|\tfloat f = 100.101101\t" + "|\t" + f + "\t\t\t|");
        System.out.println(line);
        System.out.println("|\tdouble d = 100.101101\t" + "|\t" + d + "\t\t\t|");
        System.out.println(line);

        Double dd;
        dd = 10.09999 + 20.099999;

        Float ff;
        ff = 10.09999F + 20.099999F;

        System.out.println("|\tFloat ff = \t\t\t\t" + "|\t" + ff + "\t\t\t|");
        System.out.println(line);
        System.out.println("|\tDouble dd = \t\t\t" + "|\t" + dd + "\t|");
        System.out.println(line);

        System.out.println("\n============== \n Task8 \n============== \n");

        /**
         * Создать переменную result и присвоить ей значение выражения 10 / 3 (с максимальной точностью)
         */

        double result;
        result = 10 / 3*1.0;

        System.out.println("Result is " + result);

        System.out.println("\n============== \n Task9 \n============== \n");

        /**
         * Создать переменные sum, product, quotient и remainder,
         * и присвоить им значения вычислений переменных f и d
         */

        double sum;
        sum = f + d;

        double product;
        product = f * d;

        double quotient;
        quotient = f / d;

        double remainder;
        remainder = f % d;

        System.out.println("Sum of f and d = " + sum);
        System.out.println("Product of f and d = " + product);
        System.out.println("Quotient of f and d = " + quotient);
        System.out.println("Remainder of f and d = " + remainder);

        System.out.println("\n============== \n Task10 \n============== \n");

        /**
         * Распечатать слово HELLO точками
         */

        String one = ". . ... .   .   ...";
        String two = ". . .   .   .   . .";
        String three = "... ..  .   .   . .";
        String four = ". . .   .   .   . .";
        String five = ". . ... ... ... ...";

        System.out.println(one + "\n" + two + "\n" + three + "\n" + four + "\n" + five);

        System.out.println("\n============== \n Task11 \n============== \n");

        /**
         * Создать переменные подходящего ссылочного типа данных(выбирать минимально
         * достаточный диапазон значений):
         * t1 = 0;
         * t2 = 150;
         * t3 = -120;
         * t4 = - 505.505;
         * t5 = 100100;
         * t6 = 100010001000;
         * t7 = 2.66666666666666;
         * t8 = - 1000000.001;
         * t9 = 1010;
         * Распечатать значения всех переменных.
         */

        Byte t1 = 0;
        Short t2 = 150;
        Byte t3 = - 120;
        Float t4 = 505.505F;
        Integer t5 = 100100;
        Long t6 = 100010001000L;
        Double t7 = 2.66666666666666;
        Double t8 = - 1000000.001;
        Short t9 = 1010;

        System.out.println("Byte t1 = 0;" + "\n" +
        "Short t2 = 150;" + "\n" +
        "Byte t3 = - 120;" + "\n" +
        "Integer t4 = 505.505;" + "\n" +
        "Integer t5 = 100100;" + "\n" +
        "Long t6 = 100010001000L;" + "\n" +
        "Double t7 = 2.66666666666666;" + "\n" +
        "Double t8 = 1000000.001;" + "\n" +
        "Short t9 = 1010;");

        System.out.println("\n============== \n Task12 \n============== \n");

        /**
         * С помощью полей классов ссылочного типа распечатать таблицу:
         */

        line = "---------------------------------------------------------------------------------------------";
        System.out.println(line);
        System.out.println("|\tType\t\t" + "|\tSize in bits\t" + "|\tmin\t\t\t\t\t\t" + "|\tmax\t\t\t\t\t\t|");
        System.out.println(line);
        System.out.println("|\tbyte\t\t" + "|\t\t" + Byte.SIZE
                + "\t\t\t" + "|\t" + Byte.MIN_VALUE + "\t\t\t\t\t" + "|\t" + Byte.MAX_VALUE + "\t\t\t\t\t\t|");
        System.out.println(line);
        System.out.println("|\tshort\t\t" + "|\t\t" + Short.SIZE
                + "\t\t\t" + "|\t" + Short.MIN_VALUE + "\t\t\t\t\t" + "|\t" + Short.MAX_VALUE + "\t\t\t\t\t|");
        System.out.println(line);
        System.out.println("|\tint\t\t\t" + "|\t\t" + Integer.SIZE
                + "\t\t\t" + "|\t" + Integer.MIN_VALUE + "\t\t\t\t" + "|\t" + Integer.MAX_VALUE + "\t\t\t\t|");
        System.out.println(line);
        System.out.println("|\tlong\t\t" + "|\t\t" + Long.SIZE
                + "\t\t\t" + "|\t" + Long.MIN_VALUE + "\t" + "|\t" + Long.MAX_VALUE + "\t\t|");
        System.out.println(line);
        System.out.println("|\tfloat\t\t" + "|\t\t" + Float.SIZE
                + "\t\t\t" + "|\t" + Float.MIN_VALUE + "\t\t\t\t\t" + "|\t" + Float.MAX_VALUE + "\t\t\t|");
        System.out.println(line);
        System.out.println("|\tdouble\t\t" + "|\t\t" + Double.SIZE
                + "\t\t\t" + "|\t" + Double.MIN_VALUE + "\t\t\t\t" + "|\t" + Double.MAX_VALUE + "\t|");
        System.out.println(line);

        System.out.println("\n============== \n Task13 \n============== \n");

        /**
         * Создать 2 переменные референсного типа Integer - num1 и num2, присвоить им одинаковые значения,
         * сравнить 2 переменные друг с другом с помощью метода .equal.
         * Вывести результат сравнения на печать в виде выражения:
         * “Если num1 = num2, то результат сравнения методом .equal = …”
         * Присвоить переменным разные значения, сравнить,  и вывести результат на печать:
         * “Если num1 не равно num2, то результат сравнения методом .equal = …”
         */

        Integer num1;
        Integer num2;
        num1 = 589;
        num2 = 589;

        System.out.println("Если num1 = num2, то результат сравнения методом .equal = " + num1.equals(num2));

        num1 = 587;
        num2 = 588;

        System.out.println("Если num1 не равно num2, то результат сравнения методом .equal = " + num1.equals(num2));

        System.out.println("\n============== \n Task14 \n============== \n");

        /**
         * Создать 2 переменные примитивного типа int - number1 and number2. Инициализаровать их
         * а) одинаковыми значениями
         * b) number1 < number2
         * c) number1 > number2
         * сравнить их подходящим методом класса Integer (посмотрите, какой метод подойдет),
         * и вывести результаты сравнения на печать в виде выражений:
         * “Если number1 = number2, то результат сравнения методом … = …”
         * “Если number1 < number2, то результат сравнения методом … = …”
         * “Если number1 > number2, то результат сравнения методом … = …”
         */

        int number1;
        int number2;
        number1 = 789;
        number2 = 789;

        System.out.println("Если number1 = number2, то результат сравнения методом Integer.compare = "
                + (Integer.compare(number1, number2)));

        number1 = 787;
        number2 = 788;

        System.out.println("Если number1 < number2, то результат сравнения методом Integer.compare = "
                + (Integer.compare(number1, number2)));

        number1 = 788;
        number2 = 787;

        System.out.println("Если number1 > number2, то результат сравнения методом Integer.compare = "
                + (Integer.compare(number1, number2)));

        System.out.println("\n============== \n Task15 \n============== \n");

        /**
         * Создать переменную типа Float, присвоить ей значение 234.9999 и распечатать значение в int
         */

        Float fl;
        fl = 234.9999F;

        //Вариант 1
        float fl1 = fl;
        int in = (int)fl1;

        System.out.println("Int value of " + fl1 + " is : " + in);

        Float fl2 = new Float(fl);
        int var = fl2.intValue();
        System.out.println("Int value of " + fl2 + " is : " + var);

        System.out.println("\n============== \n Task16 \n============== \n");

        /**
         * С помощью метода sum() класса Double посчитать сумму двух переменных типа double.
         */

        double task16 = 1.0;
        double task16_1 = 2.0;

        double task16_result = Double.sum(task16, task16_1);

        System.out.println("Sum of " + task16 + " and " + task16_1 + " = " + task16_result);

        System.out.println("\n============== \n Task17 \n============== \n");

        /**
         * С помощью метода sum() класса Integer посчитать сумму двух переменных типа Float.
         */

        Float task17_1 = 3.0F;
        Float task17_2 = 4.0F;

        Integer task17_result = Integer.sum(task17_1.intValue(), task17_2.intValue());

        System.out.println("Sum of " + task17_1 + " and " + task17_2 + " is " + task17_result);

        System.out.println("\n============== \n Task18 \n============== \n");

        /**
         * Создать 2 переменные типа Short:
         * short1 = 12000
         * short2 = 12300
         * Распечатать фразу:
         * “12000 - 12300 = -300”
         * где значение -300 выведено с помощью метода класса Short, а не операцией вычисления
         * Присвоить переменной short1 значение 12500, вывести фразу:
         * “12500 - 12300 = 200”
         * где значение 200 выведено с помощью метода класса Short, а не операцией вычисления
         */

        Short short1 = 12000;
        Short short2 = 12300;

        String task18_1 = Short.toString(short1);
        String task18_2 = Short.toString(short2);

        int task18_result = Short.compareUnsigned(short1, short2);

        System.out.println(task18_1 + " - " + task18_2 + " = " + task18_result);

        short1 = 12500;
        task18_1 = Short.toString(short1);
        task18_result = Short.compareUnsigned(short1, short2);

        System.out.println(task18_1 + " - " + task18_2 + " = " + task18_result);

        System.out.println("\n============== \n Task19 \n============== \n");

        /**
         * Создать переменные:
         * String str1 = "123.56";
         * String str2 = "123.55";
         * Double doub1 = 123.56;
         * Double doub2 = 123.55;
         *
         * Распечатать результат doub1 - doub2
         *
         * Используя методы ссылочного типа данных, посчитать и распечатать результат str1 - str2
         */

        String str1 = "123.56";
        String str2 = "123.55";
        Double doub1 = 123.56;
        Double doub2 = 123.55;

        Double task19_result1 = doub1 - doub2;

        System.out.println(str1 + " - " + str2 + " = " + task19_result1);

        Double task19_1 = Double.valueOf(str1);
        Double task19_2 = Double.valueOf(str2);

        Double task19_result2 = task19_1 - task19_2;

        System.out.println(str1 + " - " + str2 + " = " + task19_result2);

        System.out.println("\n============== \n Task20 \n============== \n");

        /**
         * Создать переменную подходящего типа данных для хранения результатов измерения температуры тела кота
         * (значения температуры в Цельсиях). Присвоить этой переменной сначала максимальное значение,
         * затем минимальное значение. Посчитать и распечатать среднее значение,
         * округленное с помощью метода класса Math.
         * Распечатать результат среднего значения температуры тела кота.
         */

        Double temp1;
        Double temp2;
        temp1 = 37.0;
        temp2 = 40.0;

        Double average = (temp1 + temp2) / 2;
        System.out.println(average);

        DecimalFormat decimalFormat = new DecimalFormat( "##.##" );
        String task20Result = decimalFormat.format(average);
        System.out.println(task20Result);

        System.out.println("\n============== \n Task21 \n============== \n");

        Number n;
        n = 10;
        n = 10.999999999;
        System.out.println(n);

        System.out.println("\n============== \n Task22 \n============== \n");

        /**
         * Создать переменную Integer numberInteger = 100.
         * Доказать, что numberInteger имеет тип Integer,
         * а numberInteger.toString() имеет тип String.
         */

        Integer numberInteger = 100;

        System.out.println(numberInteger);

        System.out.println("\n============== \n Task23 \n============== \n");

        /**
         * Вывести на экран следующие выражения, используя для печати только переменные:
         * “36.6 градусов по Цельсию  = … градусов по Фаренгейту”, где значение по Фаренгейту
         * должно быть вычислено по формуле
         * “50 kilogram = … lbs,  50 lb = … kg”, где значения должны быть вычислены по формулам
         *
         * Цельсий х 1,8 + 32 = Фаренгейт
         *Умножьте значение фунтов на 0,454
         */

        double cels = 36.6;
        double faren = cels * 1.8 + 32;

        //DecimalFormat decimalFormat1 = new DecimalFormat( "##.##" );
        String task23Result = decimalFormat.format(faren);

        System.out.println("36.6 градусов по Цельсию  = " + task23Result + " градусов по Фаренгейту");

        double kg = 50;
        double lbs = kg * 2.2;
        double lbs2 = 50;
        double kg1 = lbs2 * 0.454;

        DecimalFormat decimalFormat2 = new DecimalFormat( "##.##" );
        String lbs1 = decimalFormat2.format(lbs);

        DecimalFormat decimalFormat3 = new DecimalFormat( "##.##" );
        String lbs3 = decimalFormat3.format(kg1);

        System.out.println("50 kilogram = " + lbs1 + " lbs, 50 lb = " + lbs3 + " kg");
    }
}
