package lesson7.transport;

import java.util.Scanner;

public class FreightCar extends GroundTransport{
    private int loadCapacity;
    public FreightCar (int loadCapacity, int power, int speed, int weight, String brand,
                       int wheel, double fuel){
        super(power, speed, weight, brand, wheel, fuel);
        this.loadCapacity = loadCapacity;
    }
    public void description(){
        System.out.println("Характеристики грузового транспорта");
        System.out.println("Мощность: " + getPower() + " лошадиных сил; Максимальная скорость: " + getSpeed() +
                " км/ч; Масса: " + getWeight() + " кг; Марка: " + getBrand() + "; Количество колес: " + getWheel() +
                ";\nРасход топлива: " + getFuel() + " л/100 км; Грузоподъемность: " + getLoadCapacity() +
                " тонн;\nМощность в киловаттах: " + calculatePowerKiloWat() + " кВ\n");
    }
    public double calculatePowerKiloWat(){
        double powerKiloWat = getPower() * RATIO;
        return powerKiloWat;
    }
    public void canLoadCargo(){
        System.out.println("Введите количество груза (в тоннах): ");
        Scanner scanner = new Scanner (System.in);
        double amountCargo = scanner.nextInt();
        double k = getLoadCapacity() - amountCargo;
        if (k == 0 || amountCargo < getLoadCapacity()){
            System.out.println("Грузовик загружен\n");
        }else{
            System.out.println("Вам нужен грузовик побольше\n");
        }
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
