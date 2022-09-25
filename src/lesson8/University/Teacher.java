package lesson8.University;


public class Teacher extends Subject{
    private String nameTeacher;

    public Teacher (String nameUniversity, String address, int number, String nameFaculty, String nameSubject,
                    String nameTeacher){
        super(nameUniversity, address, number, nameFaculty, nameSubject);
        this.nameTeacher = nameTeacher;
    }

    public Teacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }
}
