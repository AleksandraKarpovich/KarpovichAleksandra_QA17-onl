package lesson8viaLists;

public class Student extends  Subject{
    private String nameStudent;
    private int studentId;

    public Student (String nameUniversity, String address, int number, String nameFacalty, String nameSubject,
                    String nameStudent, int studentId){
        super(nameUniversity, address, number, nameFacalty, nameSubject);
        this.nameStudent = nameStudent;
        this.studentId = studentId;
    }
    public Student (String nameStudent, int studentId){
        this.nameStudent = nameStudent;
        this.studentId = studentId;
    }

    public String toString() {

        return "[Информация о студенте]\n"
                + "Номер универа: " + getNumber()
                + "\nУниверситет: " + getNameUniversity()
                + "\nАдрес университета: " + getAddress()
                + "\nФакультет: " + getNameFacalty()
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
