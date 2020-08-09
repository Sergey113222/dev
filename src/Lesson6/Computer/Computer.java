package Lesson6.Computer;

public class Computer {
    String processor;
    String ram;
    String vinchester;
    int resources;
    public static int resoures1 = 0;
    int number;
    public int random_number1 = (int)(Math.random() * 2.0D);

    public Computer(String processor, String ram, String vinchester, int resources) {
        this.processor = processor;
        this.ram = ram;
        this.vinchester = vinchester;
        this.resources = resources;
    }

    public String toString() {
        return "Computer{processor='" + this.processor + "', ram='" + this.ram + "', vinchester='" + this.vinchester + "', resources=" + this.resources + "}";
    }

    public boolean condition() {
        if (this.number == this.random_number1) {
            return true;
        } else if (this.number != this.random_number1) {
            return false;
        } else {
            return resoures1 == this.resources ? false : false;
        }
    }

    public void turnOn() {
        if (this.condition()) {
            System.out.println("компьютер включился");
            ++resoures1;
        } else if (!this.condition()) {
            System.out.println("комп сгорел");
        }

    }

    public void turnOff() {
        if (this.condition()) {
            System.out.println("компьютер выключился");
            ++resoures1;
        } else if (!this.condition()) {
            System.out.println("комп сгорел");
        }

    }
}
