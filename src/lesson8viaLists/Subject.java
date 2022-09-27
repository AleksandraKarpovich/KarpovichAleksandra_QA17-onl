package lesson8viaLists;

public class Subject extends Facalty{
    private String nameSubject;

    public Subject(String nameUniversity, String address, int number, String nameFacalty, String nameSubject) {
        super(nameUniversity, address, number, nameFacalty);
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
