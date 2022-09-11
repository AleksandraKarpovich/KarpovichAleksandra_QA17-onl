package lesson7;

import lesson7.transport.CivilTransport;
import lesson7.transport.FreightCar;
import lesson7.transport.MilitaryTransport;
import lesson7.transport.PassengerCar;

public class Main {

    public static void main(String[] args) {
        PassengerCar passengerCar = new PassengerCar("Sedan",2, 100, 61, 50,
                "Audi",4, 16.2);
        FreightCar freightCar = new FreightCar(800,500,120, 5820,"Mazda",
                4,20.7);
        CivilTransport civilTransport = new CivilTransport(800,110,1520,"BMW",
                5000,500, 85, true);
        MilitaryTransport militaryTransport = new MilitaryTransport(50, 100, 1505, "Mercedes",
                2345, 600, false, 5);

        passengerCar.description();
        passengerCar.howMuchKm();

        freightCar.description();
        freightCar.canLoadCargo();

        civilTransport.description();
        civilTransport.canLoadPassenger();

        militaryTransport.description();
        militaryTransport.shot();
        militaryTransport.ejection();
    }

}
