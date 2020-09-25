package Lesson10;

import java.util.ArrayList;
import java.util.List;

//Создать список оценок учеников с помощью ArrayList, заполнить случайными
//оценками. Удалить неудовлетворительные оценки из списка.

public class Task29 {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>();

        Integer score;
        for (int i = 0; i < 20; i++) {
            scores.add(score = (int) (Math.random() * 10));
        }
        System.out.println(scores);

        for (int i = 0; i < scores.size(); i++) {
            if (scores.get(i) <= 3) {
                scores.remove(scores.get(i));
                i--;
            }

        }
        System.out.println(scores);
    }
}
