package lesson7.transport;

public abstract class AirTransport extends Transport{
    private int wingspan;
    private int minLength;

    public AirTransport (int power, int speed, int weight, String brand, int wingspan, int minLength){
        super(power, speed, weight, brand);
        this.wingspan = wingspan;
        this.minLength = minLength;
    }
    public abstract void description();
    public abstract double calculatePowerKiloWat();

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getMinLength() {
        return minLength;
    }

    public void setMinLength(int minLength) {
        this.minLength = minLength;
    }
}
