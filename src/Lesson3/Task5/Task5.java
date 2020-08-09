package Lesson3.Task5;
/*
Напишите программу печати таблицы перевода расстояний из дюймов всантиметры для значений длин от 1 до 20 дюймов.
 1 дюйм = 2,54 см

 */
public class Task5 {
    public static void main(String[] args) {
        double inch = 2.54;
        double valye;
        for (double distance = 1; distance <= 20; distance++) {
            System.out.println(distance);
            valye = distance * inch;
            System.out.println(valye);

        }
    }
}
