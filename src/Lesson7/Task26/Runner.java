package Lesson7.Task26;
//Создать иерархию классов, описывающих бытовую технику. Создать несколько
//объектов описанных классов, часть из них включить в розетку.
//Иерархия должна иметь хотя бы три уровня.

public class Runner {
    public static void main(String[] args) {
    Cooker cooker = new Cooker();
    Freezer freezer = new Freezer();
    Blender blender = new Blender();
    VacuumCleaner vacuumCleaner = new VacuumCleaner();
    WashingMachine washingMachine = new WashingMachine();
    cooker.turnOn();
    freezer.turnOn();
    blender.turnOn();
    vacuumCleaner.turnOn();
    washingMachine.turnOn();
    }
}
