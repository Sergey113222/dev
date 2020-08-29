package Lesson7.Transport;

public class LandTransport extends Transport{
    int numberOfWheels;
    double fuelConsumption;

    public LandTransport(double power, int maxSpeed, int weight, String brand, int numberOfWheels, double fuelConsumption) {
        super(power, maxSpeed, weight, brand);
        this.numberOfWheels = numberOfWheels;
        this.fuelConsumption = fuelConsumption;
    }
}
