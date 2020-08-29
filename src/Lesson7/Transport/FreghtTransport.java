package Lesson7.Transport;

public class FreghtTransport extends LandTransport{
    double carryingCapacity;
    double powerKW;

    public FreghtTransport(double power, int maxSpeed, int weight, String brand, int numberOfWheels, double fuelConsumption, double carryingCapacity) {
        super(power, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.carryingCapacity = carryingCapacity;
    }
    public double powerKW(double power) {
        double powerKW = power * 0.74;
        return powerKW;
    }

    @Override
    public String toString() {
        return "FreghtTransport{" +
                "carryingCapacity=" + carryingCapacity +
                ", powerKW=" + powerKW(power) +
                ", numberOfWheels=" + numberOfWheels +
                ", fuelConsumption=" + fuelConsumption +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                '}';
    }
}
