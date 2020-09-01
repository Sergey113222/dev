package Lesson7.Task26;

public class Cooker extends HeatingTechnic implements TurnOn {
    @Override
    public void turnOn() {
        System.out.println("I turnOn");
    }
}
