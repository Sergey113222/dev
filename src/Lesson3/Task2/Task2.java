package Lesson3.Task2;
/*
Одноклеточная амеба каждые 3 часа делится на 2 клетки.
 Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.

 */
public class Task2 {
    public static void main(String[] args) {
        int ameba = 1;
        for (int i = 0; i < 8; i++) {
            ameba = ameba * 2;
            System.out.println(ameba);
        }
        System.out.println(ameba);
    }
}
