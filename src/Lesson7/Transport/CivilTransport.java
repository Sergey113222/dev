package Lesson7.Transport;

public class CivilTransport extends AirTransport{
    int numberOfAirPassenger;
    boolean availabilityBussnesClass;
    double powerKW;

    public CivilTransport(double power, int maxSpeed, int weight, String brand, int wingspan, int minRunWayLength, int numberOfAirPassenger, boolean availabilityBussnesClass) {
        super(power, maxSpeed, weight, brand, wingspan, minRunWayLength);
        this.numberOfAirPassenger = numberOfAirPassenger;
        this.availabilityBussnesClass = availabilityBussnesClass;
    }
    public double powerKW(double power) {
        double powerKW = power * 0.74;
        return powerKW;
    }

    @Override
    public String toString() {
        return "CivilTransport{" +
                "numberOfAirPassenger=" + numberOfAirPassenger +
                ", availabilityBussnesClass=" + availabilityBussnesClass +
                ", wingspan=" + wingspan +
                ", minRunWayLength=" + minRunWayLength +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", powerKW=" + powerKW(power) +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                '}';
    }
}
