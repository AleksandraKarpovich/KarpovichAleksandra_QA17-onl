package lesson8viaMaps;

public class Subject extends Faculty{
    private String nameSubject;

    public Subject(String nameUniversity, String address, int number, String nameFaculty, String nameSubject) {
        super(nameUniversity, address, number, nameFaculty);
        this.nameSubject = nameSubject;
    }
    public Subject (String nameSubject){
        this.nameSubject = nameSubject;
    }
    public Subject(){

    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }
}
