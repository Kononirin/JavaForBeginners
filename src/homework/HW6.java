package homework;

public class HW6 {


    public static void task(int number) {

        System.out.println("\n" + "\n==============\n" + " HW6 - Task "
                + number + "\n==============\n");
    }

    /**
     * 10. Написать метод, который принимает на вход параметры start,  end,
     * step, и печатает последовательность десятичных  чисел, начиная с числа
     * start, с шагом step.
     * Точка выхода из цикла - число end.
     */

    public static void printSeq(double start, double end, double step) {

        //правила построения возрастающей последовательности
        //increasing start < end, step > 0
        //правила построения убывающей последовательности
        //decreasing start > end, step < 0

        //dариант Ирины
        if (start < end && step > 0) {
            for (start = start; start < end; start += step) {
                System.out.println(start);
            }
        } else if (start > end && step < 0) {
            for (start = start; start > end; start += step) {
                System.out.println(start);
            }
        } else {
            System.out.println("Invalid data");
        }

        //мой вариант
        //for (double i = start; i < end; i += step) {
        //    System.out.print(i + " ");
        //}

        //вариант другой ученицы
        //for (start = start; start < end; start += step) {
        //    System.out.print(start + " ");
        //}

        //вариант другой ученицы
        //if (step > 0) {
        //    if (start < end) {
        //        for (double i = start; i < end; i += step) {
        //            System.out.print(Math.round(i) + " ");
        //        }
        //    } else {
        //        System.out.println("Десятичных чисел, соответствующих
        //        данному условию, не найдено.");
        //    }
        //} else if (step == 0) {
        //    System.out.println("Цикл будет выполняться бесконечно и
        //    печатать значение start = " + start);
        //} else {
        //    if (start > end) {
        //        for (double i = start; i > end; i += step) {
        //            System.out.print(Math.round(i) + " ");
        //        }
        //    } else {
        //            System.out.println("Десятичных чисел, соответствующих
        //            данному условию, не найдено.");
        //        }
        //}


    }

    /**
     * 11. Написать метод, который принимает параметр l и печатает
     * последовательность четных чисел от нуля.
     * Длина последовательности = l.
     */

    public static void printSeqL(int l) {

        for (int i = 0; i < l; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    /**
     * 12. Напишите метод, который принимает целое число n,
     * и выводит все степени числа 2 от 1 до n включительно
     */

    public static void printDegreeN(int endDegree) {

        for (int i = 1; i <= endDegree; i++) {
            System.out.print(((int) Math.pow(2, i)) + " ");
        }
    }

    /**
     * 16. Написать метод, который принимает параметры n, m, l,
     * и печатает последовательность нечетных чисел начиная с числа n,
     * с шагом m,  l длина последовательности.
     *
     * l - lлина последовательности, а не точка выхода из цикла,
     * поэтому мое решение неверно
     */

    public static void printSeqNML(int n, int m, int l) {

        //мое решение неверное
        //for (int i = n; i < l+1; i += m) {
        //    if (i % 2 != 0)
        //    System.out.print(i + " ");
        //}

        //верное решение ученика
        if (n % 2 == 0 && m % 2 == 0) {
            System.out.println("Все числа четные, начните с другого "
                    + "числа или измените шаг.");
        } else {
            while (l > 0) {
                if (n % 2 != 0) {
                    System.out.print(n + " ");
                    l--;
                }
                n = n + m;
            }
        }

    }

    /**
     * 18. Написать метод, который принимает параметры l, n,
     * и печатает последовательность чисел,
     * начиная с числа n, по формуле для n + 1 члена последовательности:
     * n + 1 = 2*n
     * Длина последовательности l.
     */

    public static void printSeq2n(int l, int n) {

        //for (int i = n + 1; i < l; i++) {
        //    System.out.print((i * 2) + " ");
        //}

        for (int i = n; i < l; i++) {
            System.out.print((i * 2) + " ");
        }
    }

    //решение ирины задачи №18

    public static void seq18(int n, int l) {
        if (n < l) {
            System.out.println("[" + (n) + "]" + " = " + n);

            for (; n < l; n++) {
                System.out.println("[" + (n + 1) + "]" + " = " + (2 * n));
            }
        } else {
            System.out.println("Invalid data");
        }

    }

    /**
     * Задача 17
     * Сгенерируйте и распечатайте последовательность по формуле:
     * n + 1 = n + 2
     */

    //решение ирины
    public static void seq17(int n) {
        int l = n + 5;
        for (; n < l; n++) {
            System.out.println("[" + (n + 1) + "]" + " = " + (n + 2));
        }
    }

    /**
     *
     *задача 20
     */

    public static void print20(double x) {
        if (x >= 1.5) {
            System.out.println(2.5 * Math.pow(x,3) + 6 * Math.pow(x,2) - 30);
        }else if (x <= 1.5 && x >= 0) {
            System.out.println(x + 1);
        } else {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {


        task(1);

        /**
         * Распечатать последовательность чисел от 0 до 9 включительно.
         */

        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

        task(2);

        /**
         * Распечатать последовательность чисел от 10 исключительно до 0 включительно.
         */

        for (int i = 9; i > -1; i--) {
            System.out.print(i + " ");
        }

        task(3);

        /**
         * Распечатать последовательность чисел от 50 до 55 включительно с шагом 2.
         */

        for (int i = 50; i < 56; i += 2) {
            System.out.print(i + " ");
        }

        task(4);

        /**
         * Распечатать последовательность чисел, кратных 7, в промежутке (327, 300)
         * если стоят круглые скобки то числа исключительны, если квадратные - включительно
         */

        for (int i = 300; i < 328; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        //не уверена, что такой вариант валиден, т.к. нужно вне программы найти
        //первое число кратное 7

        for (int i = 300; i < 328; i += 7) {
            System.out.print(i + " ");
        }

        //правильный ответ, мои варианты неверны, т.к последовательности не убывающие, и числа
        //не исключены из промежутка

        for (int i = 326; i > 300; i--) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }

        task(5);

        /**
         * Распечатать последовательность чисел в промежутке [12, 13] с шагом 0.1
         * нужно было написать красивые даблы, округлить результат
         */

        for (double i = 12; i < 14; i += 0.1) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int i = 120; i < 131; i++) {
            System.out.print((double) i / 10 + " ");
        }

        task(6);

        /**
         * Распечатать последовательность четных чисел от 215 до 237 включительно
         *
         * чтобы использовать в решении шаг +=2, нужно сначала перебрать числа,
         * найти первое четное (вне цикла), а затем уже делать перебор с шагом +=2
         */

        //вариант неверен, тк по условиям нужно 215 включить в цикл

        for (int i = 216; i < 238; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();

        //верный вариант через кратность
        for (int i = 215; i < 238; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        task(7);

        /**
         * Распечатать последовательность чисел, кратных 7, в промежутке от 7 исключительно до 14 исключительно.
         *
         */

        for (int i = 8; i < 14; i++) {
            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }

        task(8);

        /**
         * Распечатать последовательность которая начинается с минимального значения типа данных short
         * и заканчивается максимальным значением short.
         * Числа в последовательности должны быть кратны 15001.
         */

        for (int i = Short.MIN_VALUE; i < Short.MAX_VALUE; i++) {
            if (i % 15001 == 0) {
                System.out.print(i + " ");
            }
        }

        task(9);

        /**
         * Распечатать последовательность чисел в промежутке от -10 до 34 включительно.
         * Числа, кратные 11, должны быть распечатаны синим цветом.
         * Числа, кратные 12, должны быть распечатаны красным цветом.
         * А ноль необходимо распечатать словом ZERO.
         */

        for (int i = -10; i < 35; i++) {
            if (i == 0) {
                System.out.print("ZERO ");
            } else if (i % 12 == 0) {
                System.out.print("\u001B[31m" + i + " " + "\u001B[0m");
            } else if (i % 11 == 0) {
                System.out.print("\u001B[34m" + i + " " + "\u001B[0m");
            }
        }

        task(10);

        /**
         * Написать метод, который принимает на вход параметры start,  end, step,
         * и печатает последовательность десятичных  чисел, начиная с числа start, с шагом step.
         * Точка выхода из цикла - число end.
         */

        /**
         * что имеется в виду под словами "десятичные числа"? - числа дабл
         */

        printSeq(10, 20, 2);

        //happy path
        printSeq(10.5, 20.75, 1.29);

        System.out.println("_____________");

        //happy path
        printSeq(15.9, 0, -1.45);

        System.out.println("_____________");

        //negative
        printSeq(15.9, 0, 0);

        System.out.println("_____________");

        //negative
        printSeq(15.9, 0, 1);

        System.out.println("_____________");

        //negative
        printSeq(-15.9, 0, -1);

        System.out.println("_____________");

        //negative
        printSeq(0, 0, 1);

        System.out.println("_____________");

        //negative
        printSeq(0, 0, -1);


        task(11);

        /**
         * Написать метод, который принимает параметр  и печатает l последовательность четных чисел от нуля.
         * Длина последовательности = l.
         */

        printSeqL(30);

        task(12);

        /**
         * Напишите метод, который принимает целое число n, и выводит все степени числа 2 от 1 до n включительно
         */

        printDegreeN(10);

        task(13);

        /**
         * Вывести последовательность 012345678900112233445566778899000…  до числа 9999 включительно.
         */
        // 0123456789
        // 00112233445566778899
        // 000111222333444555666777888999
        // 0000111122223333444455556666777788889999

        if (true) {
            for (int i = 0; i < 10; i++) {
                System.out.print("" + i);
            }
        }
        if (true) {
            for (int i = 0; i < 10; i++) {
                System.out.print("" + i + i);
            }
        }
        if (true) {
            for (int i = 0; i < 10; i++) {
                System.out.print("" + i + i + i);
            }
        }
        if (true) {
            for (int i = 0; i < 10; i++) {
                System.out.print("" + i + i + i + i);
            }
        }

        task(14);

        /**
         * Распечатайте последовательность чисел:
         * 0, 1, -1, 2, -2, 3, -3, 4, -4, 5, -5
         *
         * 0, 1, (1*(-1), 2, (2*(-1)), 3, (3*(-1)), 4, (4*(-1)), 5, (5*(-1))
         */

        //мой вариант
        for (int i = 0; i < 6; i++) {
            if (i == 0) {
                System.out.print(i + ", ");
            } else if ((i > 0) && (i < 5)) {
                System.out.print(i + ", " + (i * (-1)) + ", ");
            } else if (i == 5) {
                System.out.print(i + ", " + (i * (-1)));
            }
        }

        System.out.println();

        //решение ученика
        for (int i = 0, j = 1; i > -6 || j <= 5; i--, j++) {
            if (j < 6) {
                System.out.print(i + ", " + j + ", ");
            } else {
                System.out.println(i);
            }
        }

        System.out.println();

        //решение ученика
        System.out.print(0);
        for (int i = 1; i < 6; i++) {
            System.out.print(", " + i + ", " + (i * -1));
        }

        task(15);

        /**
         * Распечатать последовательность чисел:
         *
         * 0, 3, 5, 6, 9, 10, 12, 15, 18, 20, 21, 24, 25
         *
         * 0 (+3) 3 (+2) 5 (+1) 6 (+3) 9 (+1) 10 (+2) 12 (+3) 15 (+3) 18 (+2) 20 (+1) 21 (+3) 24 (+1) 25
         * 3 2 1 3
         * 1 2 3
         * 3 2 1 3
         * 1
         */

        for (int i = 0; i < 26; i++) {
            if (i == 0) {
                System.out.println(i); //0
            } else if (i == 1) {
                System.out.println(i + 2); //3
            } else if (i == 2) {
                System.out.println(i + 3); //5
            } else if (i == 3) {
                System.out.println(i + 3); //6
            } else if (i == 4) {
                System.out.println(i + 5); //9
            } else if (i == 5) {
                System.out.println(i + 5); //10
            } else if (i == 6) {
                System.out.println(i + 6); //12
            } else if (i == 7) {
                System.out.println(i + 8); //15
            } else if (i == 8) {
                System.out.println(i + 10); //18
            } else if (i == 9) {
                System.out.println(i + 11); //20
            } else if (i == 10) {
                System.out.println(i + 11); //21
            } else if (i == 11) {
                System.out.println(i + 13); //24
            } else if (i == 12) {
                System.out.println(i + 13); //25
            }
        }

        System.out.println();

        for (int i = 0; i < 26; i++) {
            if ((i % 3 == 0) || (i % 5 == 0 && i < 25)) {
                System.out.print(i + ", ");
            } else if (i == 25) {
                System.out.print(i + " ");
            }
        }


        task(16);

        /**
         * Написать метод, который принимает параметры n, m, l, и печатает последовательность
         * нечетных чисел начиная с числа n, с шагом m,  l длина последовательности  .
         */

        printSeqNML(1, 2, 20);

        task(17);

        /**
         * Сгенерируйте и распечатайте последовательность по формуле:
         * n + 1 = n + 2
         */

        int length = 6;

        //мое решение
        for (int i = 0; i < length; i++) {
            System.out.println("Элемент № " + i + " = " + (i + 2));
        }

        System.out.println("_______________");

        seq17(1);

        System.out.println("_______________");

        seq17(2);


        task(18);

        /**
         * Написать метод, который принимает параметры l, n, и печатает последовательность чисел,
         * начиная с числа n, по формуле для n + 1 члена последовательности:
         * n + 1 = 2n
         * Длина последовательности l.
         */

        //море решение неверное
        printSeq2n(10, 4);

        System.out.println();

        //решение ирины
        seq18(10, 2);

        task(19);

        /**
         * Сгенерируйте последовательность целых положительных  двузначных чисел,
         * в которых разница между первой цифрой (десятки) и второй цифрой (единицы)
         * не превышает 3.
         * сама не смогла решить
         */

        //решение другого ученика
        int des = 0;
        int ed = 0;
        for (int i = 10; i < 100; i++) {
            des = i / 10;
            ed = i % 10;
            if (((des - ed) <= 3) && ((ed - des) <= 3)) {
                System.out.print(i + " ");
            }
        }

        System.out.println("_______________");

        //другое рещение через Math
        for (int i = 10; i < 100; i++) {
            if (Math.abs((i / 10) - (i % 10)) <= 3) {
                System.out.print(i + " ");
            }
        }

        task(20);

        print20(0);

        System.out.println("_______________");

        print20(-4);

        System.out.println("_______________");

        print20(4);


    }
}
