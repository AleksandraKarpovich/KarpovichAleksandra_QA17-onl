package lesson2.task1;
import java.util.Scanner;
/**
* В спортивном центре есть три возрастные группы для занятий волейболом:
* 1 группа - от 7 до 13 лет;
* 2 группа - от 14 до 17 лет;
* 3 группа - от 18 до 65 лет.
* Напишите метод, который принимает возраст человека и возвращает целое число,
* которое обозначает номер группы в которую его надо определить, если подходящей группы нет - верните ‘-1’.
**/

public class Task1 {
    public static void main(String[] args) {
        int x=1;
        int y=2;
        int z=3;
        int n=-1;
        Scanner in = new Scanner(System.in);

        System.out.println("Введите свой возраст: ");
        int memberAge = in.nextInt();
        if (memberAge >= 7 && memberAge <= 13) {
            System.out.printf("%d\n", x);
        }
        else if(memberAge >= 14 && memberAge <= 17) {
            System.out.printf("%d\n", y);
        }
        else if (memberAge >= 18 && memberAge <= 65) {
            System.out.printf("%d\n", z);
        }
        else {
            System.out.printf("%d\n", n);
        }
    }
}
