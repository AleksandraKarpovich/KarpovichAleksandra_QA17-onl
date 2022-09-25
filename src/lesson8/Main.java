package lesson8;


import lesson8.University.*;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Student[] arrayStudents = new Student[3];
        arrayStudents[0] = new Student("","Могилев", 1,"Linguistics",
                "Mathematics","Aleksandra Karpovich", 20);
        arrayStudents[1] = new Student("БРУ","Могилев", 1,"Linguistics",
                "Geo","Viktar Karpovich", 21 );
        arrayStudents[2] = new Student("БРУ","Могилев", 1,"Linguistics",
                "Informatika","Lena Karpovich", 22 );

        Teacher[] arrayTeachers = new Teacher[3];
        arrayTeachers[0] = new Teacher("БРУ","Могилев", 1,"Linguistics",
                "Mathematics","Petr Petrov");
        arrayTeachers[1] = new Teacher("БРУ","Могилев", 1,"Linguistics",
                "Informatika","Ivan Ivanov");
        arrayTeachers[2] = new Teacher("БРУ","Могилев", 1,"Linguistics",
                "Geo","Ilia Stepanov");

        /*System.out.println("Хотите добавить студента?");
        Scanner input = new Scanner(System.in);
        arrayStudents[0] = input.;*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя и фамилию студента: ");
        String nameStudent = scanner.nextLine();

        try {
            if (nameStudent.equals("")) {
                throw new NoStudentNameException();
            }
        }
        catch (NoStudentNameException ex1){
            System.out.println(ex1.message);
            System.exit(0);
        }

        System.out.println("Введите имя и фамилию преподавателя: ");
        String nameTeacher = scanner.nextLine();

        try {
            if (nameTeacher.equals("")) {
                throw new NoTeacherNameException();
            }
        }
        catch (NoTeacherNameException ex5){
            System.out.println(ex5.message);
            System.exit(0);
        }

        try {
            for (int i = 0; i < 3; i++) {
                if (nameStudent.equals(arrayStudents[i].getNameStudent())) {
                    //System.out.println("Введенное имя найдено среди студентов");
                    //System.out.println("Такой предмет изучает: " + arrayStudents[i].getNameSubject());
                   try{
                    if (nameTeacher.equals(arrayTeachers[i].getNameTeacher())) {
                        //System.out.println("Введенное имя найдено среди преподавателей");
                        //System.out.println("Такой предмет преподает: " + arrayTeachers[i].getNameSubject());
                        if (arrayStudents[i].getNameSubject().equals(arrayTeachers[i].getNameSubject())) {
                            System.out.println(arrayStudents[i].toString());
                        }
                    } else throw new NoTeacherException();
                   }
                   catch (NoTeacherException ex2){
                       System.out.println(ex2.message);
                       System.exit(0);
                   }
                } else throw new NotEqualSubjects();
            }
        }
        catch(NotEqualSubjects ex4){
            System.out.println(ex4.message);
        }
    }
}
