package Lesson7.Task26;

public class WashingMachine extends WashingTechnic implements TurnOn {
    @Override
    public void turnOn() {
        System.out.println("I turnOn");
    }
}
