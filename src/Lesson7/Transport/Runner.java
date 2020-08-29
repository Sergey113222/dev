package Lesson7.Transport;

public class Runner {
    public static void main(String[] args) {

        CivilTransport ct = new CivilTransport(20, 100, 1, "SSS", 10, 1000, 20, true);
        System.out.println(ct.toString());

        LightTransport lt = new LightTransport(90, 200, 1, "BMW", 4, 12.5, 5, "sedan", 5);
        System.out.println("За время " + lt.time + " ч, автомобиль " + lt.brand + " двигаясь с максимальной скоростью " + lt.maxSpeed + " км/ч проедет " + lt.maxDistance(lt.time, lt.maxSpeed) + " км  и израсходует " +  lt.consumption(lt.maxDistance(lt.time, lt.maxSpeed), lt.fuelConsumption) + "  литров топлива.");

    }
}
