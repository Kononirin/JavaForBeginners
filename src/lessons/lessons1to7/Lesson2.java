package lessons.lessons1to7;

/**
 * Код со второй лекции
 */

public class Lesson2 {

    public static void main(String[] args){

        String line = "_________________________________________";
        int a = +5;
        int b = 13;
        int c = 113;
        int d = -5;
        int sumAB = a + b;
        int sumABC = a + b + c;
        int subBA = b - a;
        int multAB = a * b;
        int devBA = b / a;
        int devAB = a / b;

        //Конкатенация
        System.out.println("a =   " + a);
        System.out.println("b =  " + b);
        System.out.println("c = " + c);
        // Так нельзя! System.out.println("c = ", c);

        //Арифметическое сложение и Конкатенация
        System.out.println("сумма переменных a и b = " + (a + b));
        System.out.println("сумма переменных a и b = " + sumAB);
        System.out.println(a + b);
        System.out.println(sumAB);
        System.out.println(sumABC);

        //То, что до текста/строки - арифм.выражение,  то, что после текста/строки - конкатенация
        System.out.println(line);
        System.out.println(a + b + " " + a + b);
        System.out.println(line);
        System.out.println("Он сказал \"Поехали!\" и махнул рукой.");
        System.out.println("Сегодня суббота");
        System.out.println("Сегодня\nсуббота");
        System.out.println("Сегоднясуббота");
        System.out.println("Сегодня\t\tсубботa\t");
        System.out.println("Сегодня\t\tсуббот\t");

        //Конкатенация
        System.out.println("" + a + b + c);
        System.out.println("" + a + " " + b + " " + c);
        System.out.print(a);
        System.out.print(b);
        System.out.println(c);

        //Конкатенация
        System.out.print("Сегодня ");
        System.out.println("Суббота");

        //Арифметическое вычитание
        System.out.println(b - a);
        System.out.println(subBA);
        System.out.println(d);
        System.out.println(a - d);
        System.out.println(a + d);

        //Умножение
        System.out.println(a * b);
        System.out.println(multAB);
        System.out.println(5 * 13);

        //Деление
        System.out.println(b / a);
        System.out.println(devBA);
        System.out.println(a / b);
        System.out.println(devAB);

        //Остаточное деление / Остаток от деления
        System.out.println(a % b);
        System.out.println(b % a);

        //Покажите, что 25 кратно 5
        System.out.println(25 % 5);

        //100 кратно 2
        System.out.println(100 % 2);

        //100 не кратно 3
        System.out.println(100 % 3);

        //унарные операторы ++ и --        a++; это то же самое, что a + 1
        // Так не сработает!!! System.out.println(a++);
        a++;
        System.out.println(a);
        System.out.println(a + 1);

        b--;
        System.out.println(b);
        System.out.println(b - 1);
    }
}
