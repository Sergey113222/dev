package Lesson6.Computer;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Computer comp = new Computer("pentium", "ddr3 2GB", "320GB", 5);
        System.out.println(comp.toString());
        Scanner sc = new Scanner(System.in);
        System.out.println("ВВедите число с клавиатуры 0 или 1");
        int number = sc.nextInt();
        System.out.println(comp.condition());
        comp.turnOn();
        if (!comp.condition()) {
            System.out.println("комп сгорел больше не влючиться!!!!");
        }

        comp.turnOn();
        if (comp.condition()) {
            comp.turnOff();
        }

    }
}
