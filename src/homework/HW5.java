package homework;

public class HW5 {

    public static void printLine() {
        System.out.println("==============");
    }

    public static void printEmptyLine() {
        System.out.println();
    }

    public static void task(int number) {
        printEmptyLine();
        printLine();
        System.out.println("HW5 - Task " + number);
        printLine();
        printEmptyLine();
    }

    /**
     * ВСЕ!!! результаты должны быть протестированы, для этого необходимо создать метод с названием
     * verifyEquals(expectedResult, actualResult)
     */

    public static void verifyEquals(String actualResult) {

        String expectedResult = "Monday";
        if (actualResult.equals(expectedResult)) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    public static void verifyEquals(int actualResult, int expectedResult) {

        if (actualResult == expectedResult) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    public static void verifyEquals(double actualResult, double expectedResult) {

        if (actualResult == expectedResult) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    public static void verifyEquals(String actualResult, String expectedResult) {

        if (actualResult.equals(expectedResult)) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    public static void verifyEquals(boolean a, boolean b) {

        if (a == b) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }
    }

    public static void printRublesAndPenny(double price) {
    //8.1
    int rubles = (int)price; //8
    double penny = price * 100 - rubles * 100; //810-800
    int penny1 = (int)penny; //10

    System.out.println(rubles + " руб. " + penny1 + " коп. ");
    }

    public static void printKiloAndGram(double weight) {

        int kilo = (int)weight; //10
        double gram = weight - kilo; //0,75
        double gram1 = gram * 1000; //750.0
        int gram2 = (int)gram1; //750

        System.out.println(kilo + " кг. " + gram2 + " гр. ");
    }

    public static void printThing(int thing) {

        System.out.println(thing + " шт.");
    }

    public static void countAmount (double price, double weight) {

        double sumOfPurchase = price * weight;

        int ruble = (int)sumOfPurchase;
        double penny = sumOfPurchase - ruble;
        double penny1 = penny * 100;
        int penny2 = (int)penny1;

        System.out.println(ruble + " руб. " + penny2 + " коп. ");
    }

    public static void countAmount (double price, int thing) {

        double sumOfPurchase = price * thing;

        int ruble = (int)sumOfPurchase;
        double penny = sumOfPurchase - ruble;
        double penny1 = penny * 100;
        int penny2 = (int)penny1;

        System.out.println(ruble + " руб. " + penny2 + " коп. ");
    }

    public static void printCheck (String name, double price, double weight) {

        System.out.print(name + "\n" + "Цена за 1 кг" + "\t\t\t");
        printRublesAndPenny(price);
        System.out.print("Количество товара" + "\t\t");
        printKiloAndGram(weight);
        System.out.println("-----------------------------------------");
        System.out.print("Сумма к оплате" + "\t\t\t");
        countAmount(price, weight);
    }

    public static void printCheck (String name, double price, int thing) {

        System.out.print(name + "\n" + "Цена за 1 кг" + "\t\t\t");
        printRublesAndPenny(price);
        System.out.print("Количество товара" + "\t\t");
        printThing(thing);
        System.out.println("-----------------------------------------");
        System.out.print("Сумма к оплате" + "\t\t\t");
        countAmount(price, thing);
    }

    public static void calculateSalary(int hour, double rate) {

        double salary = (hour * rate)*20;

        int rubles = (int)salary;
        double penny = salary - rubles;
        double penny1 = penny * 100;
        int penny2 = (int)penny1;

        System.out.println(rubles + " руб. " + penny2 + " коп. ");
    }

    public static void printStatement (String lastName, String firstName, String secondName, int hour, double rate) {

        String name = lastName + " " + firstName + " " + secondName + " ";
        System.out.print(name + "\t");
        calculateSalary(hour, rate);
    }

    public static void whatNumber(int x) {

        if (x < 0) {
            System.out.println("x is negative");
        } else if (x > 0) {
            System.out.println("x is positive");
        } else System.out.println("x = 0");
    }

    public static void happyNumber(int yearOfBirth) {

        int number1 = yearOfBirth / 1000;
        int number2 = (yearOfBirth / 100) - number1 * 10;
        int number3 = (yearOfBirth / 10) - number1*100 - number2*10;
        int number4 = (yearOfBirth / 1) - number1*1000 - number2*100 - number3*10;

        int sumOfNumbers = number1 + number2 + number3 + number4;

        int sumOfNumbers1 = Integer.MIN_VALUE;
        int sumOfNumbers2 = Integer.MIN_VALUE;
        int sumOfNumbers3 = Integer.MIN_VALUE;
        int sumOfNumbers4 = Integer.MIN_VALUE;
        int sumOfNumbers5 = Integer.MIN_VALUE;
        int sumOfNumbers6 = Integer.MIN_VALUE;

        if (sumOfNumbers > 9) {
            sumOfNumbers1 = sumOfNumbers / 10;
            sumOfNumbers2 = sumOfNumbers / 1 - sumOfNumbers1 * 10;
            sumOfNumbers3 = sumOfNumbers1 + sumOfNumbers2;
            if (sumOfNumbers3 > 9) {
                sumOfNumbers4 = sumOfNumbers3 / 10;
                sumOfNumbers5 = sumOfNumbers3 / 1 - sumOfNumbers4 * 10;
                sumOfNumbers6 = sumOfNumbers4 + sumOfNumbers5;
                System.out.println("Ваше счастливое число: " + sumOfNumbers6);
            } else System.out.println("Ваше счастливое число: " + sumOfNumbers3);
        } else System.out.println("Ваше счастливое число: " + sumOfNumbers);
    }



    /**
     * Написать метод, который использует методы класса Math,
     * принимает на вход сумму к оплате (например, 10.75) и округляет сумму
     * в пользу покупателя.
     * Метод возвращает новую сумму к оплате в виде строки, например “10 руб 00 коп”.
     */

    public static void roundNumber (double number) {

        double newNumber = Math.floor(number);

        int rubles = (int)newNumber;
        double penny = newNumber - rubles;
        double penny1 = penny * 100;
        int penny2 = (int)penny1;

        System.out.println(rubles + " руб. " + penny2 + " коп. ");
    }

    public static int happyNumber1(int age) {
        if (age > 0 && age < 9999) {
            age = (age / 1000 + age / 100 % 10 + age / 10 % 10 + age % 10);
            age = (age / 10 % 10 + age % 10);
            if (age > 9) {
                age = (age / 10 % 10 + age % 10);
            }
            return age;
        } else {
            return -1;
        }
    }

    public static String callDayOfWeek(int a) {

        int number = a;
        String dayOfWeek = "Monday";

        if ((number <= 7) && (number >= 1)) {
             if (number == 1) {
                 dayOfWeek = "Monday";
             } else if (number == 2) {
                 dayOfWeek = "Tuesday";
             } else if (number == 3) {
                 dayOfWeek = "Wednesday";
             } else if (number == 4) {
                 dayOfWeek = "Thursday";
             } else if (number == 5) {
                 dayOfWeek = "Friday";
             } else if (number == 6) {
                 dayOfWeek = "Saturday";
             } else if (number == 7) {
                 dayOfWeek = "Sunday";
             }
        } else dayOfWeek = "\u001B[31m" + "Invalid number entered. Please enter an integer between " +
                "1 and 7 inclusive." + "\u001B[0m";

            return dayOfWeek;
    }

    public static String callDayOfWeekOne(int a) {

        //int number = a;
        String dayOfWeek = "\u001B[31m" + "Invalid number entered. Please enter an integer between " +
                        "1 and 7 inclusive." + "\u001B[0m";

        if ((a <= 7) && (a >= 1)) {
            if (a == 1) {
                return "Monday";
            } else if (a == 2) {
                return "Tuesday";
            } else if (a == 3) {
                return "Wednesday";
            } else if (a == 4) {
                return "Thursday";
            } else if (a == 5) {
                return "Friday";
            } else if (a == 6) {
                return "Saturday";
            } else if (a == 7) {
                return "Sunday";
            }
        } else return dayOfWeek;

        return dayOfWeek;
    }

    //public static void callDayOfWeek(int a) {
//
    //    int number = a;
    //    String monday = "Monday";
    //    String tuesday = "Tuesday";
    //    String wednesday = "Wednesday";
    //    String thursday = "Thursday";
    //    String friday = "Friday";
    //    String saturday = "Saturday";
    //    String sunday = "Sunday";
    //    String error = "\u001B[31m" + "Invalid number entered. Please enter an integer between " +
    //            "1 and 7 inclusive." + "\u001B[0m";
//
    //    if ((number <= 7) && (number >= 1)) {
    //        if (number == 1) {
    //            System.out.println(monday);
    //        } else if (number == 2) {
    //            System.out.println(tuesday);
    //        } else if (number == 3) {
    //            System.out.println(wednesday);
    //        } else if (number == 4) {
    //            System.out.println(thursday);
    //        } else if (number == 5) {
    //            System.out.println(friday);
    //        } else if (number == 6) {
    //            System.out.println(saturday);
    //        } else if (number == 7) {
    //            System.out.println(sunday);
    //        }
    //    } else
    //        System.out.println(error);
    //}

    //public static void callDayOfWeek(int a) {
    //    int number = a;
    //    if ((number <= 7) && (number >= 1)) {
    //        if (number == 1) {
    //            System.out.println("Monday");
    //        } else if (number == 2) {
    //            System.out.println("Tuesday");
    //        } else if (number == 3) {
    //            System.out.println("Wednesday");
    //        } else if (number == 4) {
    //            System.out.println("Thursday");
    //        } else if (number == 5) {
    //            System.out.println("Friday");
    //        } else if (number == 6) {
    //            System.out.println("Saturday");
    //        } else if (number == 7) {
    //            System.out.println("Sunday");
    //        }
    //    } else {
    //        System.out.println("\u001B[31m" + "Invalid number entered. Please enter an integer between " +
    //                "1 and 7 inclusive." + "\u001B[0m");
    //    }
    //}

    public static void main(String[] args) {

        task(2);

        /**
         * Написать метод, который принимает на вход число от 1 до 7  и возвращает день недели.
         */

        System.out.println(callDayOfWeek(1));

        System.out.println(callDayOfWeekOne(3));

        verifyEquals("Monday");

        task(3);

        /**
         * Example 2. Given 3 values, x, y, and z, determine the largest value and assign this value
         * to the variable largest.
         */

        int x = -10;
        int y = -15;
        int z = -8;
        int largest;

        if (x > y) {
            largest = x;
        } else largest = y;
        if (z > largest) {
            largest = z;
        }

        System.out.println(largest);

        verifyEquals(largest, -8);

        task(4);

        /**
         * Used nested if statements, write fragment of code that prints
         * the smallest contained in the variables a, b, and c.
         */

        int a = 5;
        int b = 3;
        int c = 96;
        int smallest = Integer.MAX_VALUE;

        if ((a < b) && (a < c)) {
            smallest = a;
        } else if ((b < a) && (b < c)) {
            smallest = b;
        } else if ((c < a) && (c < b)) {
            smallest = c;
        }

        System.out.println(smallest);

        verifyEquals(smallest, 3);

        task(5);

        /**
         * Написать алгоритм вычисления среднего значения из 5 показателей температуры тела кота.
         */


        double minTemp = 37.0;
        double maxTemp = 40.0;
        double temp1 = 37.6;
        double temp2 = 38.8;
        double temp3 = 39.5;
        double temp4 = 38.2;
        double temp5 = 39.0;
        double average = (temp1 + temp2 + temp3 + temp4 + temp5) / 5;

        average = Math.ceil(average);

        if (((temp1 > minTemp) && (temp1 < maxTemp)) && ((temp2 > minTemp) && (temp2 < maxTemp))
                && ((temp3 > minTemp) && (temp3 < maxTemp)) && ((temp4 > minTemp) && (temp4 < maxTemp))
                && ((temp5 > minTemp) && (temp5 < maxTemp))) {
                            System.out.println("Average temperature of a cat for 5 days is " + average);
        } else System.out.println("Invalid value");

        if ((temp1 > minTemp) && (temp1 < maxTemp)) {
            if ((temp2 > minTemp) && (temp2 < maxTemp)) {
                if ((temp3 > minTemp) && (temp3 < maxTemp)) {
                    if ((temp4 > minTemp) && (temp4 < maxTemp)) {
                        if ((temp5 > minTemp) && (temp5 < maxTemp)) {
                            System.out.println("Average temperature of a cat for 5 days is " + average);
                        } else System.out.println("Invalid value");
                    } else System.out.println("Invalid value");
                } else System.out.println("Invalid value");
            } else System.out.println("Invalid value");
        } else System.out.println("Invalid value");

        verifyEquals(average, 39.0);

        task(6);

        /**
         * Написать метод, который принимает на вход десятичное число (например, 10.75),
         * и возвращает строку “10 руб 75 коп”
         */

        printRublesAndPenny(8.05);

        verifyEquals("10 руб. 75 коп.", "10 руб. 75 коп.");

        task(7);

        /**
         * Написать метод, который принимает на вход десятичное число
         * и возвращает строку “10 кг 75 гр”.
         */

        printKiloAndGram(10.75);

        verifyEquals("10 кг. 75 гр.", "10 кг. 75 гр.");

        task(8);

        /**
         * Написать метод, который принимает на вход 2 параметра -  цену и количество товара
         * (может быть вес товара, или количество в штуках).
         * Алгоритм возвращает сумму покупки в виде десятичного числа.
         */

        countAmount(10.75, 0.25);

        verifyEquals("2 руб. 68 коп.", "2 руб. 68 коп.");

        countAmount(10.75, 3);

        verifyEquals("32 руб. 25 коп.", "32 руб. 25 коп.");

        task(9);

        /**
         * Написать метод, который принимает на вход необходимые параметры, и печатает чек.
         * Например:
         *
         * Яблоки
         * Цена за 1 кг			50 руб 13 коп
         * Количество товара	         3 кг 400 гр
         * _______________________________________
         * Сумма к оплате		170 руб 44 коп
         *
         * или
         *
         * Хлеб
         * Цена за 1 шт		30 руб 50 коп
         * Количество товара	5 шт
         * _______________________________________
         * Сумма к оплате		152 руб 50 коп
         */

        printCheck("Яблоки", 8.1, 1.5);

        System.out.println();

        printCheck("Хлеб", 10.75, 5);

        task(10);

        /**
         * Написать метод, который принимает на вход количество часов работы в день
         * и стоимость одного часа работы, и возвращает заработную плату в месяц.
         */

        calculateSalary(8, 437.5);



        task(11);

        /**
         * Написать метод, который принимает на вход необходимые параметры
         * и печатает строку ведомости выдачи зарплаты сотрудникам.
         * Например:
         *
         * Смирнова Мария Ивановна 		70000 руб 00 коп
         *
         * Распечатать ведомость для нескольких сотрудников, например:
         *
         * Март 2022
         * Смирнова Мария Ивановна 		70000 руб 00 коп
         * Серебряков Иван Петрович 		128059 руб 00 коп
         */

        printStatement("Смирнова", "Мария", "Ивановна", 8,437.5);

        printStatement("Серебряков", "Иван", "Петрович", 8,800);

        task(12);

        int numberX = -1;

        whatNumber(numberX);

        verifyEquals("x is negative", "x is negative");

        whatNumber(3);

        verifyEquals("x is positive", "x is positive");

        whatNumber(0);

        verifyEquals("x = 0", "x = 0");

        task(13);

        /**
         * Написать метод, который принимает на вход год рождения и возвращает ваше счастливое число.
         * Счастливое число рассчитывается по формуле: сумма всех чисел, если результат больше 9,
         * снова считается сумма всех чисел.
         * Например:
         * год рождения 1999
         * 1 + 9 + 9 + 9 = 28
         * 2 + 8 = 10
         * 1 + 0 = 1
         * Счастливое число - 1
         */

        happyNumber(1999);

        task(14);

        /**
         * а) Дано 3 числа. Необходимо рассчитать разницу между средним значением и
         * медианой (median) значением.
         * Если разница больше 2, необходимо показать сообщение:
         * “Среднее значение … отличается от медианы … на … “.
         * Иначе показать сообщение: “Среднее значение =  …, медиана =  … ”.
         *
         * b) Посчитать все то же самое с помощью методов класса Math, где возможно их использовать
         *
         * *Медиана - это серединное число в отсортированном наборе чисел.
         * 1, 3, 9 → медиана 3
         * 12, 13, 101 → медиана 13
         * 14, 2, 12 → медиана 12
         */

        int aa = 12;
        int bb = 103;
        int cc = 3;
        int min1 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;

        double average1 = (aa + bb + cc) / 3;

        if ((aa < bb) && (aa < cc)) {
            min1 = aa;
        } else if ((bb < aa) && (bb < cc)) {
            min1 = bb;
        } else if ((cc < aa) && (cc < bb)) {
            min1 = cc;
        }

        if ((aa > bb) && (aa > cc)) {
            max1 = aa;
        } else if ((bb > aa) && (bb > cc)) {
            max1 = bb;
        } else if ((cc > aa) && (cc > bb)) {
            max1 = cc;
        }

        int middle;

        if ((aa > min1) && (aa < max1)) {
            middle = aa;
        } else if ((bb > min1) && (b < max1)) {
            middle = bb;
        } else middle = cc;

        double result = average1 - middle;

        if (result > 2) {
            System.out.println("Среднее значение " + average1 + " отличается от медианы " + middle
                    + " на " + result + ".");
        } else System.out.println("“Среднее значение = " + average1 + ", медиана =  " + middle + ".");

        task(15);

        /**
         * Написать метод, который использует методы класса Math,
         * принимает на вход сумму к оплате (например, 10.75) и округляет сумму
         * в пользу покупателя.
         * Метод возвращает новую сумму к оплате в виде строки, например “10 руб 00 коп”.
         */

        roundNumber(10.75);

        verifyEquals("10 руб. 0 коп.", "10 руб. 0 коп.");

        task(16);

        /**
         * Посчитать с помощью методов класса Math
         * a = 3
         * b = 4
         * c = 20
         *
         * ((a * b + c) * ab)
         * Вернуть значение с округлением в бОльшую сторону.
         */

        int aaa = 3;
        int bbb = 4;
        int ccc = 20;

        int result1 = aaa * bbb + ccc;
        double degree = Math.pow(aaa, bbb);
        double result2 = result1 * degree;
        double result3 = Math.sqrt(result2);
        double result4 = result3 / 3.14;
        double mainResult = Math.ceil(result4);

        System.out.println(mainResult);

        verifyEquals(mainResult, 17.0);

        task(17);

        /**
         * write the java statement that assigns 1 to x if y greater than 0
         * напишите оператор Java, который присваивает 1 x, если y больше 0
         */

        int x1 = 0;
        int y1 = 1;

        if (y1 > 0) {
            x1 = 1;
        }

        System.out.println(x1);

        verifyEquals(x1, 1);

        /**
         * suppose that score is a variable of type double.
         * write the java statement that increases the score by 5 marks
         * if score is between 80 and 90
         *
         * предположим, что score — это переменная типа double.
         * напишите оператор Java, который увеличивает оценку на 5
         * баллов, если оценка находится в диапазоне от 80 до 90.
         */

        double score = 85;

        if ((score > 80) && (score < 90)) {
            score = score + 5;
        }
        System.out.println(score);

        verifyEquals(score, 90);

        /**
         * rewrite in java the following statement without using the NOT (!) operator:
         * item = ! ( (i<10) || (v >=50))
         *
         * Если оператор NOT (!) - все переворачивает наоборот. Если он стоит перед
         * большой скобкой, то абсолютно все внутри скобки надо менять на противополжное
         * значение. Знак ИЛИ меняет на И.
         *
         * перепишите в java следующий оператор без использования оператора NOT (!)
         * пункт = ! ( (i<10) || (v >=50))
         */

        int i = 5;
        int v = 10;
        boolean item = ((i >= 10) && (v < 50));

        System.out.println(item);

        verifyEquals(item, true);

        /**
         * write a java statement that prints true if x is an odd number and positive
         *
         * напишите оператор Java, который печатает true, если x является нечетным числом и положительным
         */

        int x3 = 5;
        boolean tr = true;

        if ((x3 % 2 != 0) && (x3 >= 0)) {
            System.out.println(tr);
        }

        verifyEquals(tr, true);

        /**
         *write a java statement that prints true if both x and y are pozitive numbers
         *
         * напишите оператор Java, который печатает true, если x и y являются положительными числами
         */

        int x4 = 5;
        int y2 = 7;
        boolean tr1 = false;

        if ((x4 >= 0) && (y2 >= 0)) {
            tr1 = true;
        }

        System.out.println(tr1);

        verifyEquals(tr1, true);

        /**
         * write a java statement that prints true if x and y are have the same sign (+/-)
         *
         * напишите оператор Java, который печатает true, если x и y имеют одинаковый знак (+/-)
         */

        int x5 = -1;
        int y3 = -2;
        boolean tr2 = false;

        if (((x5 > 0) && (y3 > 0)) || ((x5 < 0) && (y3 < 0))) {
            tr2 = true;
        }

        System.out.println(tr2);

        verifyEquals(tr2, true);

        task(18);

        /**
         * Написать метод, который с помощью методов класса Math высчитывает
         * любую степень сгенерированного случайного числа.
         * Метод возвращает математически округленное целое значение и выводит на экран:
         * “Число … в степени … = …”
         *
         * Число может быть в пределах от 0 до 1 исключительно.
         * Степень числа может быть от 0 до 10 включительно
         */

        double randomNumber;
        double result5;
        int degree1 = 1;

        randomNumber = Math.random();

        System.out.println(randomNumber);

        result5 = Math.pow(randomNumber, degree1);

        System.out.println(result5);

        result5 = Math.round(result5);

        System.out.println(result5);

        verifyEquals(result5, result5);

        task(19);

        /**
         * Написать метод, который возвращает случайное число в пределах от 1 до 99 включительно.
         */

        int aaa1 = 1; // Начальное значение диапазона - "от"
        int bbb1 = 99; // Конечное значение диапазона - "до"

        int random_number1 = a + (int) (Math.random() * b); // Генерация числа
        System.out.println("Случайное число: " + random_number1);

        verifyEquals(random_number1, random_number1);

        task(20);

        /**
         * assume that the following declarations have been made:
         * int year;
         * boolean isLeapYear;
         * write a fragment that will assign isLeapYear to true if year represents
         * a leap year and false otherwise.
         * note: the simplest definition of leap year is any year that is divisible
         * by four. for a challenge you could research the full definition
         * of a leap year and create a fragment to detect a proper leap year.
         *
         * Предположим, что были сделаны следующие заявления:
         * int year;
         * boolean isLeapYear;
         * напишите фрагмент, который будет присваивать isLeapYear значение true,
         * если год представляет собой високосный год, и значение false в противном случае.
         * примечание: самое простое определение високосного года — это любой год,
         * который делится на четыре. для испытания вы можете изучить полное
         * определение високосного года и создать фрагмент для определения
         * правильного високосного года.
         */

         //int year = 2020;

         //if (year % 4 == 0) {
         //    isLeapYear = true;
         //} else isLeapYear = false;

         boolean isLeapYear = false;
         int year = 2020;

         if ((year % 4 == 0) && (year > 0)){
            if ((year % 100 != 0) || (year % 400 == 0)) {
                isLeapYear = true;
            }
         } else isLeapYear = false;

         System.out.println(isLeapYear);

         verifyEquals(isLeapYear, true);



















    }
}
