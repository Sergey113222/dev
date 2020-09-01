package Lesson7.Task26;

public class VacuumCleaner extends SmallTechnic implements TurnOn {
    @Override
    public void turnOn() {
        System.out.println("I turnOn");
    }
}
