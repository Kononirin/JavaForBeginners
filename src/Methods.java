public class Methods {

    public static void main(String[] args) {

        /**
         * Методы класса Math помогают выполнять числовые операции, такие как квадрат, квадратный корень, куб,
         * корень куба, экспоненциальные и тригонометрические операции.

         * Что такое аргумент NaN?
         * Константа, содержащая значение Not-a-Number (NaN) типа double.
         * Это эквивалентно значению, которое возвращает Double.longBitsToDouble (0x7ff8000000000000L).

         * Метод abs (): java.lang.Math.abs () возвращает абсолютное значение переданного аргумента любого типа.
         * Этот метод может обрабатывать все типы данных.
         * Особый случай :
         * Результат положительный ноль, если аргумент положительный ноль или отрицательный ноль.
         * Результатом является положительная бесконечность, если аргумент бесконечный.
         * Результат равен NaN, если переданный аргумент равен NaN.
         */

        System.out.println("Метод abs ()");

        int Vali = -1;

        float Valf = - 0.7f;

        // Использование метода .abs () для получения absoluteValue

        int Absi = Math.abs(Vali);

        float Absf = Math.abs(Valf);

        System.out.println("Absolute value of int : "+Absi); // 1

        System.out.println("Absolute value of float : "+Absf); // 0.7

        System.out.println();

        /**
         * Метод floor (): java.lang.Math.floor () дает целое число с нулевой дробной частью,
         * ближайшее к числу аргумента слева, другими словами — округляет дробь в меньшую сторону.
         * Например: 101.23 имеет значение пола = 101.0
         * Важный момент: тот же аргумент приводится, если передан NaN или бесконечный аргумент.
         *
         * Параметры
         * Примитивный тип данных double или float.
         * Возвращаемое значение : Math.floor() возвращает целое число, которое ближайшее к числу аргумента слева.
         * Возвращается в виде double.
         */

        System.out.println("Метод floor ()");

        double f1 = 30.56, f2 = -56.34;

        f1 =Math.floor(f1);

        System.out.println("Floor value of f1 : "+f1); // 30.0

        f2 =Math.floor(f2);

        System.out.println("Floor value of f2 : "+f2); // -57.0

        System.out.println();

        /**
         * Метод Math.ceil() — дает целое число с нулевой дробной частью, ближайшее к числу аргумента справа,
         * другими словами — округляет дробь в большую сторону.
         * Принимает примитивный тип данных double или float.
         * Math.ceil() возвращает целое число, которое ближайшее к числу аргумента справа.
         * Возвращается в виде double.
         */

        // Использование метода ceil ()

        System.out.println("Метод Math.ceil()");

        double val = 30.56;

        double ceilval = Math.ceil(val);

        System.out.println("Ceil value of val : " + ceilval); // 31.0

        System.out.println();

        /**
         * Math.round() — возвращает целое число, long или int,
         * ближайшее к вещественному числу, double или float, аргумента.
         * Иными словами — округляет дробь до целого числа.
         * округляет так, как привычно обывателю.
         * Если дробная часть числа больше либо равна 0.5,
         * то число будет округлено в большую сторону, иначе в меньшую.
         * Синтаксис:
         * long round(double d)
         * int round(float f)
         */

        System.out.println("Math.round()");

        System.out.println("Round value of val " + Math.round(1.3)); // 1
        System.out.println("Round value of val " + Math.round(1.4)); // 1
        System.out.println("Round value of val " + Math.round(1.5)); // 2
        System.out.println("Round value of val " + Math.round(1.6)); // 2

        System.out.println();

        /**
         * Метод Math.min() — возвращает минимальное значение из двух аргументов.
         * Аргумент может быть int, float, long, double.
         * Принимает любой примитивный тип данных в качестве параметра.
         * Math.min() возвращает меньшее из двух аргументов.
         */

        System.out.println("Метод Math.min()");

        System.out.println("Min of two numbers : " + Math.min(0, -1.1)); // -1.1

        System.out.println();

        /**
         * Метод Math.max() — возвращает максимальное значение из двух аргументов.
         * Аргумент может быть int, float, long, double.
         * Принимает любой примитивный тип данных в качестве параметра.
         * Math.max() возвращает максимальное число из двух аргументов.
         */

        System.out.println("Метод Math.max()");

        System.out.println("Max of two numbers : " + Math.max(0, -1.1)); // 0.0

        System.out.println();

        /**
         * Метод Math.pow() — возводит значение первого аргумента в степень второго аргумента,
         * тем самым позволяет осуществить быстрое возведение в степень любых значений.
         * Синтаксис: double pow(double base, double exponent), где
         * base — любой примитивный тип данных
         * exponent — любой примитивный тип данных
         * Math.pow() возвращает double значение первого аргумента, возведенное в степень второго аргумента.
         */

        // Возведение в квадрат числа 5

        System.out.println("Метод Math.pow()");

        int a2 = 5;
        int b2 = 2;
        System.out.println("Число 5 в квадрате равно " + Math.pow(a2, b2)); // 25.0

        // Возведение в куб числа 3
        int a4 = 3;
        int b4 = 3;
        System.out.println("Число 3 в кубе равно " + Math.pow(a4, b4)); // 27.0

        System.out.println();

        /**
         * Метод Math.random() — в Java используется для генерации случайного числа в диапазоне от 0.0 до 1.0.
         * Различные диапазоны могут быть достигнуты с помощью арифметики.
         * Метод по умолчанию не принимает параметр.
         * Math.random() возвращает случайное double значение с положительным знаком в диапазоне
         * больше или равно 0.0 и меньше 1.0 (0.0 <= Math.random() < 1.0).
         * Результат будет меняться каждый раз, когда Вы вызовете метод Math.random().
         */

        System.out.println("Метод Math.random()");

        System.out.println("Случайное число: " + Math.random());

        //случайное число в диапазоне от 0 до 10

        int a = 0; // Начальное значение диапазона - "от"
        int b = 10; // Конечное значение диапазона - "до"

        int random_number1 = a + (int) (Math.random() * b); // Генерация числа
        System.out.println("Случайное число: " + random_number1);

        System.out.println();

        //рандомное число с плавающей точкой от 0 до 9
        //10 - 1 = 9
        System.out.println(Math.random() * 10);

        //рандомное целое число от 0 до 9
        //10 - 1 = 9
        System.out.println((int)(Math.random() * 10));

        //рандомное целое число от 20 до 29
        // 20 - число ОТ
        //(10 + 20) - 1 = 29 - число ДО
        System.out.println(((int)(Math.random() * 10)) + 20);

        /**
         * Метод Math.sqrt() — возвращает квадратный корень из аргумента.
         * Синтаксис: double sqrt(double d)
         * Math.sqrt() возвращает квадратный корень из аргумента.
         * Возвращает тип double.
         */

        System.out.println("Метод Math.sqrt()");

        int c = 4;
        Integer d = 9;
        System.out.println("Квадратный корень из " + c + " равен " + Math.sqrt(c)); // 2.0
        System.out.println("Квадратный корень из " + d + " равен " + Math.sqrt(d)); // 3.0

        System.out.println();

        /**
         * Методы byteValue(), shortValue(), intValue(), longValue(), floatValue(), doubleValue()
         *
         * Метод xxxValue() — преобразует в Java числовое значение объекта, который вызывает метод,
         * в примитивный тип данных, который возвращается из метода.
         *
         * Синтаксис: здесь каждый примитивный тип данных представляет отдельный метод:         *
         * byte byteValue() // Преобразование в byte
         * short shortValue() // Преобразование в short
         * int intValue() // Преобразование в int
         * long longValue() // Преобразование в long
         * float floatValue() // Преобразование в float
         * double doubleValue() // Преобразование в double
         *
         * Параметры: являются по умолчанию методами и не несут никакой параметр.
         * Метод xxxValue() в Java возвращает примитивный тип данных, который задается в сигнатуре.
         */

        System.out.println("Метод xxxValue()");


        Integer x = 5;
        // Преобразовывает int в byte и возвращает примитивный тип данных byte
        System.out.println(x.byteValue()); // 5

        // Преобразовывает int в double и возвращает примитивный тип данных double
        System.out.println(x.doubleValue()); // 5.0

        // Преобразовывает int в long и возвращает примитивный тип данных long
        System.out.println(x.longValue()); //5

        System.out.println();

        /**
         * Метод compareTo() — сравнивает числовой объект, который вызывает метод, с аргументом.
         * При работе с числами метод compareTo() в Java позволяет сравнить два числа одного типа,
         * например, byte, long, integer и т.д. Однако нельзя сравнивать два разных типа аргумента
         * и числового объекта, вызывая метод они должны быть одного типа.
         *
         * Синтаксис
         * public int compareTo( NumberSubClass referenceName )
         * referenceName — должно быть byte, double, integer, float, long или short.
         *
         * Возвращаемое значение:
         * Если Integer равно аргументу, то возвращается 0.
         * Если Integer меньше, чем аргумент, то возвращается -1.
         * Если Integer больше, чем аргумент, то возвращается 1.
         */

        System.out.println("Метод compareTo()");

        Integer y = 5;
        System.out.println(x.compareTo(3)); // 1
        System.out.println(x.compareTo(5)); // 0
        System.out.println(x.compareTo(8)); // -1

        System.out.println("");

        /**
         * Метод compareTo() в Java структурирован двумя вариантами.
         * Первый: метод сравнивает строку с другим объектом, а второй:
         * метод лексически сравнивает две строки.
         * Как работает compareTo() с числовым объектом мы рассмотрели выше.
         * Рассмотрим второй вариант: сравнение двух строк.
         *
         * Синтаксис метода:
         * int compareTo(Object o)
         * или
         * int compareTo(String anotherString)
         *
         * Параметры
         * o — объект для сравнения.
         * anotherString — строка для сравнения.
         *
         * Возвращаемое значение:
         * compareTo() получает значение 0, если аргумент является строкой лексически равной данной строке;
         * значение меньше 0, если аргумент является строкой лексически большей, чем сравниваемая строка;
         * и значение больше 0, если аргумент является строкой лексически меньшей этой строки.
         */

        String str1 = "Я буду хорошим программистом!";
        String str2 = "Я буду хорошим программистом!";
        String str3 = "Я буду хорошим дворником!";

        int result = str1.compareTo(str2);
        System.out.println(result); // 0

        result = str2.compareTo(str3);
        System.out.println(result); // 11

        result = str3.compareTo(str1);
        System.out.println(result); // -11

        System.out.println();

        /**
         * indexOf array
         */

        /**
         * substring
         */

        /**
         * valueOf
         */

        /**
         * charAt(int)
         */

        /**
         * contains
         */

        /**
         * Формула как округлять
         */

        System.out.println(formatDouble(12.658899,3));

        System.out.println("_______________");

        printSeq(10.5,20.75,1.29,2);

        System.out.println("_______________");

        printSeq(15.9,0,-1.45,2);

    }

    //public static double formatDouble1(double number, int d) {
    //    int num = (int)(number * Math.pow(10,d));
    //    //int temp = (int)(number * Math.pow(10,d + 1));
    //    number = num / Math.pow(10,d);
//
    //    return number;
    //}

    public static double formatDouble(double number, int d) {
        int num = (int)Math.round(number * Math.pow(10,d));
        number = num / Math.pow(10,d);

        return number;
    }

    public static void printSeq (double start, double end, double step, int d) {
        if (start < end && step > 0) {
            for (start = start; start < end; start += step) {
                System.out.println(formatDouble(start,d));
            }
        } else if (start > end && step < 0) {
            for (start = start; start > end; start += step) {
                System.out.println(formatDouble(start,d));
            }
        } else {
            System.out.println("Invalid data");
        }
    }

    //public static void printSeqf(double start, double end, double step, int d) {
//
//
    //    if (start < end && step > 0) {
    //        for (start = start; start < end; start += step) {
    //            System.out.println(formatDouble1(start,d));
    //        }
    //    } else if (start > end && step < 0) {
    //        for (start = start; start > end; start += step) {
    //            System.out.println(formatDouble1(start,d));
    //        }
    //    } else {
    //        System.out.println("Invalid data");
    //    }
    //}
}
