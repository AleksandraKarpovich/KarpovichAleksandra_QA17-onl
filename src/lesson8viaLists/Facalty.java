package lesson8viaLists;

public class Facalty extends University{
    private String nameFacalty;

    public Facalty (String nameUniversity, String address, int number, String nameFacalty){
        super(nameUniversity, address, number);
        this.nameFacalty = nameFacalty;
    }
    public Facalty (String nameFaculty){
        this.nameFacalty = nameFacalty;
    }
    public Facalty(){
    }

    public String getNameFacalty() {
        return nameFacalty;
    }

    public void setNameFacalty(String nameFacalty) {
        this.nameFacalty = nameFacalty;
    }
}
