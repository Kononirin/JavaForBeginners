package homework;

public class HW2 {

    public static void main(String[] args){

        System.out.println("Task11 \n");

        int k = 5;
        int l = 10;
        int m = 15;

        System.out.println("\n====================\n");

        System.out.println("Task12 \n");

        System.out.println(k);
        System.out.println(l);
        System.out.println(m);

        System.out.println("\n====================\n");

        System.out.println("Task13" + "\n");

        System.out.print(k);
        System.out.print(l);
        System.out.println(m);

        System.out.println("\n====================\n");

        System.out.println("Task14" + "\n");

        System.out.println(k + "," + l + "," + m);

        System.out.println("\n====================\n");

        System.out.println("Task15" + "\n");

        System.out.println("int k = " + k + ";");
        System.out.println("int l = " + l + ";");
        System.out.println("int m = " + m + ";");

        System.out.println("\n====================\n");

        System.out.println("Task16" + "\n");

        System.out.println("Sum of k and l = " + (k + l));
        System.out.println("k * m = " + k * m);
        System.out.println("Разность переменных l и m = " + (l - m));

        System.out.println("\n====================\n");

        System.out.println("Task17" + "\n");

        System.out.println("Результат деления k на l = " + k / l + ", а остаток от деления  = " + k % l);
        System.out.println("Результат деления k на m = " + k / m + ", а остаток от деления  = " + k % m);
        System.out.println("Результат деления k на k = " + k / k + ", а остаток от деления  = " + k % k);

        System.out.println("Результат деления l на m = " + l / m + ", а остаток от деления  = " + l % m);
        System.out.println("Результат деления l на k = " + l / k + ", а остаток от деления  = " + l % k);
        System.out.println("Результат деления l на l = " + l / l + ", а остаток от деления  = " + l % l);

        System.out.println("Результат деления m на k = " + m / k + ", а остаток от деления  = " + m % k);
        System.out.println("Результат деления m на l = " + m / l + ", а остаток от деления  = " + m % l);
        System.out.println("Результат деления m на m = " + m / m + ", а остаток от деления  = " + m % m);

        System.out.println("\n====================\n");

        System.out.println("Task18" + "\n");

        int apple = 40;
        int student = 6;

        System.out.println("Если " + apple + " яблок поделить на " + student + " учеников, то каждый ученик получит по "
                + apple / student + " яблок, и " + apple % student + " яблока останется учителю.");

        int apple1 = 100;
        int student1 = 21;

        System.out.println("Если " + apple1 + " яблок поделить на " + student1
                + " ученика, то каждый ученик получит по " + apple1 / student1 + " яблока, и " + apple1 % student1
                        + " яблок останется учителю.");

        System.out.println("\n====================\n");

        System.out.println("Task19" + "\n");
        /**
         * Распечатать вычисления и итоговый результат:
         * Сумма чисел k, l, m++ и sumKLM-- = …, а разность m++ и  sumLKM = …
         */

         //16
        int m1 = m + 1;
        int sumKLM = k + l + m; //30
        int sumLKM = l + k + m; //30

        //sumLKM--;
        int sumKLM1 = sumKLM - 1; //29
         //16

        System.out.println(sumLKM);
        System.out.println(sumKLM1);
        System.out.println(sumKLM);
        System.out.println(m1);

        System.out.println("Сумма чисел k, l, m++ и sumKLM-- = " + (k + l + m1 + sumKLM)
                + ", а разность m++ и sumLKM = " + (m1 - sumLKM));

        System.out.println("\n====================\n");

        System.out.println("Task20" + "\n");

        /**
         * Показать, что число 48 кратно 8, и что оба этих числа - четные. А числа 47 и 49 - нечетные.
         */

        int f = 8;
        int g = 48;
        int j = 47;
        int s = 49;

        System.out.println(g % f);
        System.out.println(f % 2);
        System.out.println(g % 2);
        System.out.println(j % 2);
        System.out.println(s % 2);

        System.out.println("\n====================\n");

        System.out.println("Part 3" + "\n");
        //x = 2,   y = 3,  a = k, b = l, c = m, d = y - x

        int x = 2;
        int y = 3;
        int a = k;
        int b = l;
        int c = m;
        int d = y - x;
        String line = "-----------------------------------------";

        int result21 = (x + 3) * (x + 3);
        System.out.println(result21);

        int result22 = ((3 + 4 * x) / 5) - (((10 * (y - 5) * (a + b + c))) / x) + ((9 * ((4 / x) + (9 + x) / y)));
        System.out.println(result22);

        int expr1 = ((5 * x) + (7 * y)) / ((8 * x) + (10 * y));
        int expr2 = ((3 * x - y) / (x + y));
        int expr3 = a + b + (c / d) + ((a +b) / (c + d)) + (a * b);
        int result23 = (expr1 / expr2) / expr3;
        System.out.println(result23);

        System.out.println(line);
        System.out.println("|\ttask\t|" +"\tresult\t\t\t\t\t|");
        System.out.println(line);
        System.out.println("|\t21\t\t" + "|\t" + result21 + "\t\t\t\t\t\t|");
        System.out.println(line);
        System.out.println("|\t22\t\t" + "|\t" + result22 + "\t\t\t\t\t\t|");
        System.out.println(line);

        //System.out.println("|\t23\t\t" + "|\t" + result23 + "\t|");
        //System.out.println(line);
    }
}
