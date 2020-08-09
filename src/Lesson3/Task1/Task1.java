package Lesson3.Task1;
/*
Начав тренировки, спортсмен в первый день пробежал 10 км.
 Каждыйдень он увеличивал дневную норму на 10% нормы предыдущего дня.
  Какойсуммарный путь пробежит спортсмен за 7 дней?
 */
public class Task1 {
    public static void main(String[] args) {
        double distance = 10;
        double sum = 10;
        for (int i = 0; i < 6; i++) {
            double next_distance = distance * 1.1;
            distance = next_distance;
            System.out.println(next_distance);
            sum = sum + distance;
            System.out.println(sum);

        }
    }
}
