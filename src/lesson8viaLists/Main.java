package lesson8viaLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> arrayStudents = new ArrayList<>(3);

        arrayStudents.add(0, new Student("БРУ","Могилев", 1,"Linguistics",
                "Mathematics","Aleksandra Karpovich", 20));
        arrayStudents.add(1, new Student("БРУ","Могилев", 1,"Linguistics",
                "Geo","Viktar Karpovich", 21 ));
        arrayStudents.add(2, new Student("БРУ","Могилев", 1,"Linguistics",
                "Informatika","Lena Karpovich", 22 ));


        ArrayList<Teacher> arrayTeachers = new ArrayList<>(3);
        arrayTeachers.add(0, new Teacher("БРУ", "Могилев", 1, "Linguistics",
                "Mathematics", "Petr Petrov"));
        arrayTeachers.add(1, new Teacher("БРУ", "Могилев", 1, "Linguistics",
                "Informatika", "Ivan Ivanov"));
        arrayTeachers.add(2, new Teacher("БРУ", "Могилев", 1, "Linguistics",
                "Geo", "Ilia Stepanov"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя и фамилию студента: ");
        String nameStudent = scanner.nextLine();

        System.out.println("Введите имя и фамилию преподавателя: ");
        String nameTeacher = scanner.nextLine();


        for (int i = 0; i < 3; i++) {
            if (nameStudent.equals(arrayStudents.get(i).getNameStudent())) {
                //System.out.println("Введенное имя найдено среди студентов");
                //System.out.println("Такой предмет изучает: " + arrayStudents[i].getNameSubject());
                    if (nameTeacher.equals(arrayTeachers.get(i).getNameTeacher())) {
                        //System.out.println("Введенное имя найдено среди преподавателей");
                        //System.out.println("Такой предмет преподает: " + arrayTeachers[i].getNameSubject());
                        if (arrayStudents.get(i).getNameSubject().equals(arrayTeachers.get(i).getNameSubject())) {
                            System.out.println(arrayStudents.get(i).toString());
                        }
                    }
            }
        }
    }
}
