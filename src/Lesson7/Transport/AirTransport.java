package Lesson7.Transport;

public class AirTransport extends Transport {
    int wingspan;
    int minRunWayLength;

    public AirTransport(double power, int maxSpeed, int weight, String brand, int wingspan, int minRunWayLength) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minRunWayLength = minRunWayLength;

    }
}
