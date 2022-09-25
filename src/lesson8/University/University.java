package lesson8.University;


public  class University {
    private String nameUniversity;
    private String address;
    private int number;

    public University (String nameUniversity, String address, int number){
       this.nameUniversity = nameUniversity;
       this.address = address;
       this.number = number;
    }
    public University() {

    }

    public String getNameUniversity() {
        return nameUniversity;
    }

    public void setNameUniversity(String nameUniversity) {
        this.nameUniversity = nameUniversity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
