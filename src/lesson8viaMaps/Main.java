package lesson8viaMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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

        Map<Student, ArrayList<Teacher>> StudentsPlusTeachers = new HashMap<>();

        StringBuilder sb = new StringBuilder();
        for (Student student : arrayStudents){
            StudentsPlusTeachers.put(student, arrayTeachers);
        }
        for (Student student : StudentsPlusTeachers.keySet()){
            for (int i = 0; i < StudentsPlusTeachers.get(student).size(); i++){
                sb.append(StudentsPlusTeachers.get(student).get(i).getNameTeacher());
            }
            System.out.println("Name of student: " + student.getNameStudent() + "\nNames of teachers: "
                    + arrayTeachers.toString());
        }
    }
    /*public static ArrayList<Teacher> getTeachers(ArrayList<Teacher> arrayTeachers){
        for (int i = 0; i < arrayTeachers.size(); i++){
           System.out.println(arrayTeachers.toString());
        }
        return arrayTeachers;
    }*/

}
