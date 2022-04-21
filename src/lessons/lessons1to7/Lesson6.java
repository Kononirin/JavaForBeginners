package lessons.lessons1to7;

public class Lesson6 {

    public static void main(String[] args) {

        //печатаем "Java for beginners" для всех чисел от 1 до 5 ВКЛЮЧИТЕЛЬНО

        for (int i = 1; i < 6; i++) {
            System.out.println("Java for beginners");
        }

        System.out.println();

        //печатаем числа от 1 до 5 включительно

        for (int i = 1; i < 6; i++) {
            System.out.println("Итерация № " + i);
        }

        System.out.println();

        //печатаем только нечетные числа от 1 до 10 включительно
        //3 разные записи одного условия

        for (int i = 1; i < 11; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        System.out.println();

        for (int i = 1; i < 11; i = i + 2) {
            System.out.println(i);
        }

        System.out.println();

        for (int i = 1; i < 11; i += 2) {
            System.out.println(i);
        }

        System.out.println();

        //печатаем все числа от 1 до 100 включительно с шагом 10

        for (int i = 1; i < 101; i += 10) {
            System.out.println(i);
        }

        System.out.println();

        // печатаем все числа в промежутке от 0 до 100 включительно, которые кратны 10

        for (int i = 0; i < 101; i += 10) {
            System.out.println(i);
        }

        System.out.println();

        // печатаем все числа в промежутке от -100 до 100 включительно, которые кратны 10

        for (int i = -100; i < 101; i += 10) {
            System.out.println(i);
        }

        System.out.println();

        //печатаем все числа от 5 до 1 включительно

        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }




    }
}
