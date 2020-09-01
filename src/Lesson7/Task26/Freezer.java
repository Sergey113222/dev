package Lesson7.Task26;

public class Freezer extends FreezingTechnic implements TurnOn {
    @Override
    public void turnOn() {
        System.out.println("I turnOn");
    }
}
