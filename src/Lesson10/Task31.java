package Lesson10;
//Создать список оценок учеников с помощью ArryList, заполнить случайными
//оценками. Найти самую высокую оценку с использованием итератора.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Task31 {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>();

        Integer score;
        for (int i = 0; i < 20; i++) {
            scores.add(score = (int) (Math.random() * 10));
        }
        System.out.println(scores);


        int maxScore = scores.get(0);
        for (Integer i : scores) {
            if (i > maxScore)
                maxScore = i;
        }
        System.out.println("Максимальное число " + maxScore);
    }
}
