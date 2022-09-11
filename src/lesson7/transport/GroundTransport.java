package lesson7.transport;

public abstract class GroundTransport extends Transport {
    private int wheel;
    private double fuel;

    public GroundTransport (int power, int speed, int weight, String brand, int wheel, double fuel){
        super(power, speed, weight, brand);
        this.wheel = wheel;
        this.fuel = fuel;
    }

    public abstract void description();
    public abstract double calculatePowerKiloWat();

    public int getWheel() {
        return wheel;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}
