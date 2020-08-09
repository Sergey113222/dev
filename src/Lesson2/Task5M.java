/*
Задание 5
Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
различны?
 */

public class Task5M {
    public static void main(String[] args) {
        int a = 1111;
        int a4 = a % 10;
        int a3 = ((a - a4) % 100) / 10;
        int a2 = ((a - a3 * 10 - a4) % 1000) / 100;
        int a1 = (a - a2 * 100 - a3 * 10 - a4) / 1000;

        if ((a1 == a2) && (a2 == a3) && (a3 == a4))
            System.out.println("it's true ");
        else
            System.out.println("it's false");
    }
}
