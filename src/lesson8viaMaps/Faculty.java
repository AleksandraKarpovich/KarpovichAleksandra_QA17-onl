package lesson8viaMaps;

public class Faculty extends University{
    private String nameFaculty;

    public Faculty (String nameUniversity, String address, int number, String nameFaculty){
        super(nameUniversity, address, number);
        this.nameFaculty = nameFaculty;
    }
    public Faculty (String nameFaculty){
        this.nameFaculty = nameFaculty;
    }
    public Faculty(){
    }

    public String getNameFaculty() {
        return nameFaculty;
    }

    public void setNameFaculty(String nameFaculty) {
        this.nameFaculty = nameFaculty;
    }
}
