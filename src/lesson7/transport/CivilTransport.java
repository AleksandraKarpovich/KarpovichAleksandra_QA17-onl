package lesson7.transport;

import java.util.Scanner;

public class CivilTransport extends AirTransport{
    private int countPassengers;
    private boolean businessClass;
    public CivilTransport (int power, int speed, int weight, String brand,
                    int wingspan, int minLength, int countPassengers, boolean businessClass){
        super(power,speed, weight, brand, wingspan, minLength);
        this.countPassengers = countPassengers;
        this.businessClass = businessClass;
    }
    public void description(){
        System.out.println("Характеристики гражданского транспорта");
        System.out.println("Мощность: " + getPower() + " лошадиных сил; Максимальная скорость: " + getSpeed() +
                " км/ч; Масса: " + getWeight() + " кг; Марка: " + getBrand() + "; Размах крыльев: " + getWingspan() +
                " метров;\nМинимальная длина взлётно-посадочной полосы для взлёта: " + getMinLength() +
                " метров; Количество пассажиров: " + getCountPassengers() + "; Наличие бизнес-класса: "
                + isBusinessClass() + ";\nМощность в киловаттах: " + calculatePowerKiloWat() + " кВ\n");
    }
    public double calculatePowerKiloWat(){
        double powerKiloWat = getPower() * RATIO;
        return powerKiloWat;
    }
    public void canLoadPassenger(){
        System.out.println("Введите количество людей: ");
        Scanner scanner = new Scanner (System.in);
        double amountPassenger = scanner.nextInt();
        double k = getCountPassengers() - amountPassenger;
        if (k == 0 || amountPassenger < getCountPassengers()){
            System.out.println("Самолет загружен\n");
        }else{
            System.out.println("Вам нужен самолет побольше\n");
        }
    }
    public int getCountPassengers() {
        return countPassengers;
    }

    public void setCountPassengers(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }
}
