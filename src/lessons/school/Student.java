package lessons.school;

public class Student {

    public static void main(String[] args){

        String pupil = "Ученик 5-го класса";
        String firstName = "Вова";
        String secondName = "Сидоров";
        int age = 10;
        String line = "********************************";

        String pupil1 = "Ученица 9-го класса";
        String firstName1 = "Маша";
        String secondName1 = "Семенова";
        int age1 = 14;

        System.out.println(line);
        System.out.println(pupil);
        System.out.print(firstName);
        System.out.println(" " + secondName);
        System.out.println(age + " лет");
        System.out.println(line);

        System.out.println(line);
        System.out.println(pupil1);
        System.out.print(firstName1);
        System.out.println(" " + secondName1);
        System.out.println(age1 + " лет");
        System.out.println(line);
    }
}
