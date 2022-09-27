package lesson8viaLists;

public class Teacher extends Subject{
    private String nameTeacher;

    public Teacher (String nameUniversity, String address, int number, String nameFacalty, String nameSubject,
                    String nameTeacher){
        super(nameUniversity, address, number, nameFacalty, nameSubject);
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
