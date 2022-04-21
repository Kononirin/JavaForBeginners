package lessons.lessons1to7;

public class Lesson7 {

    public static void main(String[] args) {

        /* declaration + new + memory allocation */

        int[] array1 = new int[6];
        double[] array2 = new double[10];
        boolean[] array3 = new boolean[5];
        char[] array4 = new char[3];
        String[] array5 = new String[8];

        int[] numbers = new int[6];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        numbers[5] = 60;

        String[] letters = new String[3];

        letters[0] = "a";
        letters[1] = "b";
        letters[2] = "c";

        //ниже две аналогичные записи массивов

        String[] catsNames1 = new String[] {"Мурка", "Мурзик", "Рыжик"};

        String[] catNames2 = {"Мурка", "Мурзик", "Рыжик"};

        double[] array21 = {1.5, 1.8, 2.777, 4.09578};

        boolean [] isCatBlack = {false, true, false, false};

        /**
         * так записывать неправильно:
         * new String[8];
         * new String[] {"Мурка", "Мурзик"};
         */

        //объект типа String со значением "Рыжик"
        String catName = "Рыжик";

        //ячейка памяти типа Стринг-массив
        String[] catNames;

        //объект типа Стринг-массив состоящий из 8 ячеек
        catNames = new String[8];
        catNames[4] = "Рыжик";
        catNames[1] = "Черныш";
        catNames[6] = "Рыжик";

        //объект типа инт-массив состоящий из 8 ячеек
        int[] catAges = new int[8];

        System.out.println(catName);

        //печатаем ключи (адреса ячеек)
        System.out.println(catNames);
        System.out.println(catAges);

        //печатаем значения
        System.out.println(catNames[0]);
        System.out.println(catNames[7]);
        System.out.println(catAges[2]);
        System.out.println(catNames[4]);

        //печатаем все значения коробок
        System.out.println("_________________");
        for (int i = 0; i < 8; i++) {
            System.out.println(catNames[i]);
        }

        //печатаем только те коробки, где указан Рыжик
        System.out.println("_________________");
        for (int i = 0; i <= 7; i++) {
            if (catNames[i] == "Рыжик") {
                System.out.println(catNames[i]);
            }
        }

        //печатаем номера коробок, в которых сидит Рыжик
        System.out.println("_________________");
        for (int i = 0; i < 8; i++) {
            if (catNames[i] == "Рыжик") {
                System.out.println(i);
            }
        }

        //печатаем номера коробок, в которых сидит Черныш
        System.out.println("_________________");
        for (int i = 0; i < 8; i++) {
            if (catNames[i] == "Черныш") {
                System.out.println(i);
            }
        }










    }
}
