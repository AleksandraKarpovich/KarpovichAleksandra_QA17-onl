package lesson8.University;


import lesson8.NoStudentNameException;
import lesson8.NotFoundUniversity;

import java.util.Scanner;

public class Student extends  Subject{
    private String nameStudent;
    private int studentId;

    public Student (String nameUniversity, String address, int number, String nameFaculty, String nameSubject,
                    String nameStudent, int studentId){
        super(nameUniversity, address, number, nameFaculty, nameSubject);
        this.nameStudent = nameStudent;
        this.studentId = studentId;
    }
    public Student (String nameStudent, int studentId){
        this.nameStudent = nameStudent;
        this.studentId = studentId;
    }
    public String toString() {
        try {
            if (getNameUniversity().equals("")){
                throw new NotFoundUniversity();
            }
        }
        catch (NotFoundUniversity ex3)
           {
               System.out.println(ex3.message + "\n");
               System.out.println("Введите название университета: ");
               Scanner scanner = new Scanner(System.in);
               setNameUniversity(scanner.nextLine());
           }
        return "[Информация о студенте]\n"
                + "Номер универа: " + getNumber()
                + "\nУниверситет: " + getNameUniversity()
                + "\nАдрес университета: " + getAddress()
                + "\nФакультет: " + getNameFaculty()
                + "\nID студента: " + studentId
                + "\nФИО: " + nameStudent
                + "\nПредмет: " + getNameSubject();
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
