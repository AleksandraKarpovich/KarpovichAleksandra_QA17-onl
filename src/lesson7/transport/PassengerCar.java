package lesson7.transport;

import java.util.Scanner;

public class PassengerCar extends GroundTransport{
    private String bodyType;
    private int countPassenger;

    public PassengerCar (String bodyType, int countPassenger, int power, int speed, int weight, String brand,
                         int wheel, double fuel){
        super(power, speed, weight, brand, wheel, fuel);
        this.bodyType = bodyType;
        this.countPassenger = countPassenger;
    }

    public void description() {
        System.out.println("Характеристики легкового транспорта");
        System.out.println("Мощность: " + getPower() + " лошадиных сил; Максимальная скорость: " + getSpeed() +
                " км/ч; Масса: " + getWeight() + " кг; Марка: " + getBrand() + "; Количество колес: " + getWheel() +
                ";\nРасход топлива: " + getFuel() + " л/100 км; Тип кузова: " + getBodyType() +
                "; Количество пассажиров: " + getCountPassenger() +
                ";\nМощность в киловаттах: " + calculatePowerKiloWat() + " кВ\n");
    }
    public double calculatePowerKiloWat(){
        double powerKiloWat = getPower() * RATIO;
        return powerKiloWat;
    }
    public void howMuchKm(){
        System.out.println("Введите время: ");
        Scanner scanner = new Scanner (System.in);
        double time = scanner.nextDouble();
        double distance = time * getSpeed();
        System.out.println("За время: " + time + " ч, автомобиль: " + getBrand() + ", двигаясь с максимальной скоростью "
        + getSpeed() + " км/ч проедет " + distance + " км и израсходует " + howMuchFuel(distance) + " литров топлива\n");
    }
    private double howMuchFuel(double distance){
        double fuelForOneKm = getFuel()/100; // расход за 1 км
        double countFuel = distance * fuelForOneKm;
        return countFuel;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getCountPassenger() {
        return countPassenger;
    }

    public void setCountPassenger(int countPassenger) {
        this.countPassenger = countPassenger;
    }
}
