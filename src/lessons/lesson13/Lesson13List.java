package lessons.lesson13;

import java.util.ArrayList;
import java.util.List;

public class Lesson13List {
    public static void main(String[] args) {

        List<String> strList = new ArrayList<>();
        strList.add("a"); //положили в лист элемент а, размер листа стал 1
        strList.add("b"); //положили в лист элемент б, размер листа стал 2
        System.out.println(strList);
        strList.add(0, "m"); //положили эл-т м на место эл-та а
        System.out.println(strList);
        strList.remove( "m"); //убрали эл-т м
        System.out.println(strList);
        strList.remove( 0);
        System.out.println(strList);
        System.out.println(strList.size());

        String strString = new String();
        String[] array = new String[10];

//        Лист - это интерфейс, его нельзя создавать как класс
//        List<String> list = new List<String>() {
//        }

//      Справа мы создали новый объект класса АррэйЛист
//      а слева объявляю интерфейс, куда положили ссылку на объект АррэйЛист
        List<String> list = new ArrayList<>();

        List<String> str;
        List<Integer> numbers;
        List<Integer> doubleNums;

        //способ объявления листов с 11ой Джавы
        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        System.out.println(intList.size());
        System.out.println(intList.isEmpty());


        System.out.println(strList);
        System.out.println(intList);

        System.out.println(strList.add("c"));
        System.out.println(strList);

        System.out.println(strList.remove("c"));
        System.out.println(strList);

        //цикл с Листом
        List<String> str_List = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        //проходим по каждому элементу из списка Стрингов str_List
        for (String letter : str_List) {
            System.out.println(letter);
        }

        for (int i = 0; i < 1; i++) {
            System.out.println();
        }
        //проверка на то, что список пришед не пустой
        //Assert.assertFalse(str_List.isEmpty());
    }
}
