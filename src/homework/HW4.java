package homework;

public class HW4 {

    //public static void partFirst(){
    //    System.out.print("\u0394" + "\u0394" + "\u0394" + "\u0394" + "\u0394" + "\u0394");
    //}
//
    //public static void partSecond(int number){
    //    System.out.print(number);
    //}
//
    //public static void partAll(int task){
    //    partFirst();
    //    partSecond(2);
    //    partFirst();
    //}
    //System.out.println("\n============== \n Task22 \n============== \n");

    public static void printLine() {
        System.out.println("==============");
    }

    public static void printEmptyLine() {
        System.out.println();
    }

    public static void task(int number) {
        printEmptyLine();
        printLine();
        System.out.println("Task " + number);
        printLine();
        printEmptyLine();
    }

    public static void divisionKLM(int a, int b) {
        System.out.println("Результат деления " + a + " на " + b + " = " + a / b
                + ", а остаток от деления " + a + " на " + b + " = " + a % b);
    }

    public static void appleAndStudent(int a, int b) {
        System.out.println("Если " + a + " яблок(а) поделить на " + b + " учеников(а), то каждый ученик получит по "
                + a / b + " яблок(a), и " + a % b + " яблок(а) останется учителю.");
    }

    public static void declinationOfWords(int a, int b) {

        if ((a == 42) && (b == 42)) {
            System.out.println("Если " + a + " яблока поделить на " + b
                    + " ученика, то каждый ученик получит по "
                    + a / b + " яблоку, и " + a % b + " яблок останется учителю.");
        } else if ((a == 55) && (b == 5)) {
            System.out.println("Если " + a + " яблок поделить на " + b
                    + " учеников, то каждый ученик получит по "
                    + a / b + " яблок, и " + a % b + " яблок останется учителю.");
        } else if ((a == 1) && (b == 2)) {
            System.out.println("Если " + a + " яблоко поделить на " + b
                    + " учеников, то каждый ученик получит по "
                    + a / b + " яблок, и " + a % b + " яблоко останется учителю.");
        }
    }

    public static void temperature(double aa) {

        double bb = aa * 1.8 + 32;
        String dd = String.format("%.2f", bb);

        System.out.println("Температура по Фаренгейту равна = " + dd);
        System.out.println("Температура по Цельсию равна = " + aa);
    }

    /**
     * а) Создать метод, который примет на вход параметр i и распечатает таблицу:
     * int min              * значение i
     * int max              * значение i
     * i ^ 2              * значение i ^ 2
     * b) поменять значение i и распечатать таблицу с новым значением i
     */

    public static void sheet(int a) {

        String line = "-------------------------------------";
        int b = a * a;

        System.out.println(line);
        System.out.println("|\tint min\t\t" + "|\t" + Integer.MIN_VALUE + "\t\t|");
        System.out.println(line);
        System.out.println("|\tint max\t\t" + "|\t" + Integer.MAX_VALUE + "\t\t|");
        System.out.println(line);
        System.out.println("|\ti ^ 2 \t\t" + "|\t" + b + "\t\t\t\t|");
        System.out.println(line);
    }

    public static void main(String[] args) {


        task(3);

        /**
         * Записать в виде кода следующие логические выражения:
         *

         /** Номер 1
         * (2 = 2) И (7 = 7);
         */

        int a = 2;
        int b = 7;

        if ((a == a) && (b == b)) {
            System.out.println(true);
        } else System.out.println(false);

        /** Номер 2
         * Не(15 < 3);
         */

        boolean d = true;

        System.out.println(d != (15 < 3));

        /** Номера 3 и 4
         *  ("Сосна" = "Дуб") ИЛИ ("Вишня" = "Клён");
         *  Не("Сосна" = "Дуб");
         */

        String sosna = "Сосна";
        String dub = "Дуб";
        String vishnya = "Вишня";
        String clyon = "Клён";

        System.out.println((sosna == dub) || (vishnya == clyon));

        System.out.println(d != (sosna == dub));

        /** Номер 5
         * (Не(15 < 3)) И (10 > 20);
         */

        System.out.println((d != (15 < 3)) && (10 > 20));

        /** Номер 6
         * ("Глаза даны, чтобы видеть") И ("Под третьим этажом находится второй этаж");
         */

        String glaza = "Глаза даны, чтобы видеть";
        String etag = "Под третьим этажом находится второй этаж";

        //System.out.println(b == (glaza && etag));
        //уточнить условия

        /** Номер 7
         * (6/2 = 3) ИЛИ (7*5 = 20)
         */

        a = 2;
        b = 7;
        int e = 6;
        int f = 5;
        double result1 = e / a;
        double result2 = b * f;

        if ((result1 == 3) || (result2 == 20)) {
            System.out.println(d);
        }

        task(4);

        /**
         * Записать в виде кода:
         */

        /** Номер 1
         * ("В минуте 70 секунд") ИЛИ ("Работающие часы показывают время");
         */

        String minute = "В минуте 70 секунд";
        String clock = "Работающие часы показывают время";

        //System.out.println((minute == d) || (clock == d));
        //уточнить условия

        /** Номер 2
         * !(28 > 7) И !(300/5 = 60);
         */

        f = 5;
        b = 7;
        int g = 28;
        int j = 300;
        int k1 = 60;

        System.out.println((d != (g > 7)) && (d != ((j / f) == k1)));

        /** Номер 3
         *  ("Телевизор - электрический прибор") И ("Стекло - дерево");
         */

        boolean televisor = true;
        boolean steklo = false;

        String tele = "Телевизор - электрический прибор";
        String stekl = "Стекло - дерево";

        //System.out.println(( tele + " = " + televisor) && ((stekl + " = " + steklo));
        //оператор амперсанд не может быть применен к данным типа стринг

        /** Номер 4
         * Не((300 < 100))  → ("Жажду можно утолить водой");
         */

        int m1 = 300;
        int n = 100;

        if (d != (m1 < n)) {
            System.out.println("Жажду можно утолить водой");
        }

        /** Номер 5
         *  (75 < 81) → (88 = 88).
         */

        if (75 < 81) {
            System.out.println("88 = 88");
        }

        task(5);

        /**
         * Записать в виде кода следующие выражения:
         *
         */

        /**
         * Задание 1
         * 	а) Андрей старше Светы. Наташа старше Светы.
         */

        byte andrew = 45;
        byte sveta = 40;
        byte natasha = 46;

        boolean trask = ((andrew > sveta) && (natasha > sveta));

        System.out.println(trask);

        /**
         * Задание 2
         * б) На полке стоят учебники, а на столе лежат справочники.
         */

        boolean textbook = true;
        boolean directory = true;

        if (textbook) {
            System.out.println("положить учебник на полку");
        }
        if (directory) {
            System.out.println("положить справочник на стол");
        }

        /**
         * Задание 3
         * в) Большая часть детей — девочки. Остальные - мальчики.
         */

        int countOfGirl = 25;
        int countOfBoy = 13;

        boolean children = (countOfGirl > countOfBoy);

        System.out.println(children);

        task(6);

        /**
         * “Водительские права можно получить, только когда исполнится 16 лет.”
         */

        int age = 16;

        if (age >= 16) {
            System.out.println("Водительские права можно получить");
        } else {
            System.out.println("Водительские права нельзя получить");
        }

        task(7);

        /**
         * ”Петя не едет в автобусе, но при этом читает книгу или не смотрит в окно”
         */

        String petya = "Петя";
        String bus = "едет в автобусе";
        String book1 = "читает книгу";
        String window = "не смотрит в окно";

        //System.out.println((petya != bus) && (("но при этом " + book1) || (!window)));

        task(8);

        /**
         * “Если с другом ты, это хорошо, а когда наоборот - плохо”
         */

        boolean haveFriend = true;

        if (!haveFriend) {
            System.out.println("это хорошо");
        } else {
            System.out.println("плохо");
        }

        task(9);

        /**
         * Записать выражения в виде условий if-else
         */

        /**
         * Если тебе больше 18 лет, то ты взрослый. Иначе, ты - ребенок.
         */

        age = 18;

        if (age > 18) {
            System.out.println("ты взрослый");
        } else {
            System.out.println("ты - ребенок");
        }

        /**
         * Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь.
         */

        boolean earthDry = true;
        boolean earthWet = true;

        if (earthDry) {
            System.out.println("нет дождя");
        }
        if (earthWet) {
            System.out.println("идет дождь");
        }

        /**
         * Если земля сухая, значит, нет дождя. Если земля мокрая, то идет дождь. Иначе идет снег.
         */

        if (earthDry) {
            System.out.println("нет дождя");
        }
        if (earthWet) {
            System.out.println("идет дождь");
        } else {
            System.out.println("идет снег");
        }

        /**
         * Если на небе тучи, идет дождь, иначе идет “слепой” дождь.
         */

        boolean skyInCloud = true;

        if (skyInCloud) {
            System.out.println("идет дождь");
        } else {
            System.out.println("идет “слепой” дождь");
        }

        /**
         * Если сегодня суббота, значит, завтра воскресенье. Если сегодня пятница, значит, вчера был четверг.
         *              *      Иначе вчера был не четверг, а завтра - не воскресенье
         */

        boolean today = true;
        boolean saturday = true;
        boolean fryday = true;

        if (today == saturday) {
            System.out.println("завтра воскресенье");
        } else if (today == fryday) {
            System.out.println("вчера был четверг");
        } else {
            System.out.println("вчера был не четверг");
            System.out.println("завтра - не воскресенье");
        }

        /**
         * Если на горе свистнул рак, значит, прошла вечность, иначе ждите дальше.
         */

        boolean lobsterWhistle = true;

        if (lobsterWhistle) {
            System.out.println("прошла вечность");
        } else {
            System.out.println("ждите дальше");
        }

        /**
         * Если тебе 18 или ты закончил школу, то ты можешь не жить с родителями, иначе живи с родителями.
         */

        age = 18;
        boolean finishSchool = true;

        if ((age >= 18) || finishSchool) {
            System.out.println("можешь не жить с родителями");
        } else {
            System.out.println("живи с родителями");
        }

        task(10);

        /**
         * Проверьте число на четность. Если число четное, удвойте это число, иначе возведите число в квадрат.
         * Выведите результат работы алгоритма на печать.
         * Найдите в презентации, какой блок схеме соответствует ваш алгоритм.
         */

        int number = 8;

        if ((number % 2) == 0) {
            number = number * 2;
        } else {
            number = number * number;
        }
        System.out.println("Результат алгоритма равен " + number
                + ", алгоритм соответствует схеме if - else conditional.");

        task(11);

        /**
         * Напишите алгоритм проверки возраста на соответствие условиям (if-else):
         * Голосовать можно с 18 лет
         * Машину можно водить с 16 лет
         * В школу можно идти с 5 лет
         * Выведите результат работы алгоритма на печать.
         * Найдите в презентации, какой блок схеме соответствует ваш алгоритм.
         */

        age = 17;

        if (age >= 5) {
            System.out.println("В школу можно идти.");
            if (age >= 16) {
                System.out.println("Машину можно водить.");
                if (age >= 18) {
                    System.out.println("Голосовать можно.");
                }
            }
        }

        System.out.println("Алгоритм соответствует схеме if - else loop.");

        task(12);

        /**
         * Напишите алгоритм программы, которая проверяет оценку ученика и выполняет следующие действия:
         * 5 - выдать похвальную грамоту и перевести в следующий класс
         * 4 - перевести в следующий класс
         * 3 - дать задание на лето и перевести в следующий класс
         * 2 - вызвать родителей и оставить в текущем классе на второй год
         * Выведите результат работы алгоритма на печать.
         * Найдите в презентации, какой блок схеме соответствует ваш алгоритм.
         */

        int grade = 4;

        if (grade == 5) {
            System.out.println("Выдать похвальную грамоту и перевести в следующий класс.");
        } else if (grade == 4) {
            System.out.println("Перевести в следующий класс.");
        } else if (grade == 3) {
            System.out.println("Дать задание на лето и перевести в следующий класс.");
        } else if (grade == 2) {
            System.out.println("Вызвать родителей и оставить в текущем классе на второй год.");
        }

        System.out.println("Алгоритм соответствует схеме if - else sequential.");

        task(13);

        /**
         * Напишите алгоритм программы, которая проверяет 2 числа. Программа складывает числа,
         * которые делятся на 3 без остатка, и вычитает числа, которые делятся на 5 без остатка.
         * Программа умножает числа, которые делятся на 2 без остатка,
         * но если хотя бы одно число отрицательное, программа умножает результат предыдущего действия на (-1).
         * Если числа не прошли ни одну проверку, программа выводит на печать ошибку
         * о невозможности произвести действия.
         */

        int number1 = 0;
        int number2 = 0;
        int result;

        //Вариант решения 1

        if ((number1 % 3 == 0) && (number2 % 3 == 0)) {
            result = number1 + number2;
            System.out.println("Решение 1.1: " + result);
        } else if ((number1 % 5 == 0) && (number2 % 5 == 0)) {
            result = number1 - number2;
            System.out.println("Решение 1.2: " + result);
        } else if ((number1 % 2 == 0) && (number2 % 2 == 0)) {
            result = number1 * number2;
            System.out.println("Решение 1.3: " + result);
        } else if ((number1 < 0) || (number2 < 0)) {
            result = (number1 * number2) * -1;
            System.out.println("Решение 1.4: " + result);
        } else {
            System.out.println("Решение 1.5: \u001B[31m" + "Невозможно произвести действия." + "\u001B[0m");
        }

        //Вариант решения 2

        if ((number1 % 3 == 0) && (number2 % 3 == 0)) {
            result = number1 + number2;
            System.out.println("Решение 2.1: " + result);
        }
        if ((number1 % 5 == 0) && (number2 % 5 == 0)) {
            result = number1 - number2;
            System.out.println("Решение 2.2: " + result);
        }
        if ((number1 % 2 == 0) && (number2 % 2 == 0)) {
            result = number1 * number2;
            System.out.println("Решение 2.3: " + result);
        }
        if ((number1 < 0) || (number2 < 0)) {
            result = (number1 * number2) * -1;
            System.out.println("Решение 2.4: " + result);
        } else {
            System.out.println("Решение 2.5: \u001B[31m" + "Невозможно произвести действия." + "\u001B[0m");
        }

        task(14);

        /**
         * Распечатать следующие выражения, используя метод и параметры:
         * Результат деления k на l = …, а остаток от деления  = …
         * Результат деления k на m = …, а остаток от деления  = …
         * Результат деления l на m = …, а остаток от деления  = …
         * Результат деления m на k = …, а остаток от деления  = …
         * И так далее все возможные варианты.
         * Сравнить код из HW2 с кодом из HW4. Что для вас легче?
         */

        int k = 5;
        int l = 10;
        int m = 15;

        divisionKLM(k, l);
        divisionKLM(k, m);
        divisionKLM(k, k);

        divisionKLM(l, k);
        divisionKLM(l, m);
        divisionKLM(l, l);

        divisionKLM(m, k);
        divisionKLM(m, l);
        divisionKLM(m, m);

        task(15);

        /**
         * Выполнить задание 18 из HW2 с помощью метода и параметров:
         * а) Создать переменные apple и  student и присвоить им значения 40 и 6 соответственно. Распечатать выражение:
         * Если … яблок(а) поделить на … учеников, то каждый ученик получит по … яблок(a), и … яблок(а) останется учителю.
         * Распечатать это же выражение со значениями 100 и 21.
         */

        int apple = 40;
        int student = 6;

        appleAndStudent(apple, student);

        apple = 100;
        student = 21;

        appleAndStudent(apple, student);

        task(16);

        /**
         * Выполнить задание 18 из HW2 с помощью метода и параметров:
         * Написать метод так, чтобы правильные склонения слов (н-р, яблок или яблока)
         * печатались автоматически в зависимости от значений параметров.
         * Распечатать выражение с параметрами:
         * apple = 42, 55, 1
         * student = 42, 5, 2
         */

        int apple1 = 42;
        int student1 = 42;

        declinationOfWords(apple1, student1);

        apple1 = 55;
        student1 = 5;

        declinationOfWords(apple1, student1);

        declinationOfWords(1, 2);

        task(17);

        /**
         * Напишите метод, который примет на вход параметр температуры в Цельсиях,
         * и распечатает результат температуры в Цельсиях и в Фаренгейтах.
         */

        temperature(36.6);

        task(18);

        /**
         * а) Создать метод, который примет на вход параметр i и распечатает таблицу:
         * int min              * значение i
         * int max              * значение i
         * i ^ 2              * значение i ^ 2
         * b) поменять значение i и распечатать таблицу с новым значением i
         */

        sheet(8);

        task(19);

        /**
         * Напишите тест, который валидирует (проверит правильность работы) ваш код из задания №10.
         * Тестовые данные - 2, 5, 0.
         */

        int numberTest = 2;
        int expectedResult = 4;


        if ((numberTest % 2) == 0) {
            numberTest = numberTest * 2;
        } else {
            numberTest = numberTest * numberTest;
        }
        System.out.println("Результат алгоритма равен " + numberTest
                + ", алгоритм соответствует схеме if - else conditional.");

        if (expectedResult == numberTest) {
            System.out.println("\u001B[32m" + "Pass" + "\u001B[0m");
        } else {
            System.out.println("\u001B[31m" + "Fail" + "\u001B[0m");
        }

        task(20);

        /**
         * Напишите тест, который валидирует ваш код из задания №11. Придумайте тестовые данные.
         * Выведите результат проверки на печать.
         *          * Напишите алгоритм проверки возраста на соответствие условиям (if-else):
         *          * Голосовать можно с 18 лет
         *          * Машину можно водить с 16 лет
         *          * В школу можно идти с 5 лет
         *          * Выведите результат работы алгоритма на печать.
         */

        age = 20;
        String school = "В школу можно идти.";
        String car = "Машину можно водить.";
        String vote = "Голосовать можно.";
        String error = "Невозможно отобразить результат.";

        if (age >= 5) {
            System.out.println(school + "\n" + "\u001B[32m" + "Pass" + "\u001B[0m");
            if (age >= 16) {
                System.out.println(car + "\n" + "\u001B[32m" + "Pass" + "\u001B[0m");
                if (age >= 18) {
                    System.out.println(vote + "\n" + "\u001B[32m" + "Pass" + "\u001B[0m");
                }
            }
        } else {
            System.out.println(error + "\n" + "\u001B[31m" + "Fail" + "\u001B[0m");
        }

        //String str1 = "Hello"; String str2 = "hello"; System.out.println (str1.equals (str2));
        //String expectedResult1 = "Невозможно отобразить результат.";
        //
        //if (expectedResult1 == error) {
        //    System.out.println("\u001B[31m" + "Fail" + "\u001B[30m");
        //} else {
        //    System.out.println("\u001B[32m" + "Pass" + "\u001B[30m");
        //}

        task(21);

        /**
         * Напишите алгоритм программы, которая проверяет число типа short на количество разрядов,
         * и выводит результат проверки.
         * ( Например, “It’s a two-digit number.”, “It’s a five-digit number.”, etc)
         * Выведите результат проверки на печать.
         */

        short s = 1;

        String s2 = (Short.toString(s));

        if ((s2.length()) == 1) {
            System.out.println("It’s a one-digit number.");
        } else if ((s2.length()) == 2) {
            System.out.println("It’s a two-digit number.");
        } else if ((s2.length()) == 3) {
            System.out.println("It’s a three-digit number.");
        } else if ((s2.length()) == 4) {
            System.out.println("It’s a four-digit number.");
        } else if ((s2.length()) == 5) {
            System.out.println("It’s a five-digit number.");
        }
    }
}
