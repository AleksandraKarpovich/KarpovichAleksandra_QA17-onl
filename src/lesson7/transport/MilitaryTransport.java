package lesson7.transport;

public class MilitaryTransport extends AirTransport{
    private boolean ejection;
    private int countRocket;
    public MilitaryTransport (int power, int speed, int weight, String brand, int wingspan, int minLength,
                              boolean ejection, int countRocket){
        super(power,speed, weight, brand, wingspan, minLength);
        this.ejection = ejection;
        this.countRocket = countRocket;
    }
    public void description(){
        System.out.println("Характеристики военного транспорта");
        System.out.println("Мощность: " + getPower() + " лошадиных сил; Максимальная скорость: " + getSpeed() +
                " км/ч; Масса: " + getWeight() + " кг; Марка: " + getBrand() + "; Размах крыльев: " + getWingspan() +
                " метров;\nМинимальная длина взлётно-посадочной полосы для взлёта: " + getMinLength() +
                " метров; Наличие системы катапультировани: " + isEjection() +
                "; Количество ракет на борту: " + getCountRocket() +
                ";\nМощность в киловаттах: " + calculatePowerKiloWat() + " кВ\n");
    }
    public double calculatePowerKiloWat(){
        double powerKiloWat = getPower() * RATIO;
        return powerKiloWat;
    }
    public void shot(){
        if (getCountRocket()==0) {
            System.out.println("Боеприпасы отсутствуют");
        }else{
                System.out.println("Ракета пошла...");
            }
    }
    public void ejection(){
        if(isEjection()==true){
            System.out.println("Катапультирование прошло успешно");
        }else{
            System.out.println("У вас нет такой системы");
        }
    }
    public boolean isEjection() {
        return ejection;
    }

    public void setEjection(boolean ejection) {
        this.ejection = ejection;
    }

    public int getCountRocket() {
        return countRocket;
    }

    public void setCountRocket(int countRocket) {
        this.countRocket = countRocket;
    }
}
