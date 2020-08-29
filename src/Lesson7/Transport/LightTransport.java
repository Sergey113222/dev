package Lesson7.Transport;

public class LightTransport extends LandTransport {
    int time;
    String type;
    int numberOfPassenger;
    double powerKW;

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    int maxDistance;

    public LightTransport(double power, int maxSpeed, int weight, String brand, int numberOfWheels, double fuelConsumption, int time, String type, int numberOfPassenger) {
        super(power, maxSpeed, weight, brand, numberOfWheels, fuelConsumption);
        this.time = time;
        this.type = type;
        this.numberOfPassenger = numberOfPassenger;
    }

    public double powerKW(double power) {
        double powerKW = power * 0.74;
        return powerKW;
    }

    @Override
    public String toString() {
        return "LightTransport{" +
                "time=" + time +
                ", type='" + type + '\'' +
                ", numberOfPassenger=" + numberOfPassenger +
                ", powerKW=" + powerKW(power) +
                ", numberOfWheels=" + numberOfWheels +
                ", fuelConsumption=" + fuelConsumption +
                ", power=" + power +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                '}';
    }
    public int maxDistance (int time, int maxSpeed ) {
        return time*maxSpeed;
    }
    public   double consumption(int maxDistance, double fuelConsumption) {
        return maxDistance * fuelConsumption / 100;
    }

}
