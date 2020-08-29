package Lesson7.Transport;

public class MilitaryTransport extends AirTransport {
    boolean availabilityOfCatapult;
    int numberOfMissiles;
    double powerKW;

    public MilitaryTransport(double power, int maxSpeed, int weight, String brand, int wingspan, int minRunWayLength, boolean availabilityOfCatapult, int numberOfMissiles) {
        super(power, maxSpeed, weight, brand, wingspan, minRunWayLength);
        this.availabilityOfCatapult = availabilityOfCatapult;
        this.numberOfMissiles = numberOfMissiles;
    }
    public double powerKW(double power) {
        double powerKW = power * 0.74;
        return powerKW;
    }

    @Override
    public String toString() {
        return "MilitaryTransport{" +
                "availabilityOfCatapult=" + availabilityOfCatapult +
                ", numberOfMissiles=" + numberOfMissiles +
                ", powerKW=" + powerKW(power) +
                ", wingspan=" + wingspan +
                ", minRunWayLength=" + minRunWayLength +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                '}';
    }
}
