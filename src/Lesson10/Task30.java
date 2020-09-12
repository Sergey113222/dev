package Lesson10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
//числа.
public class Task30 {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();

        Integer score;
        for (int i = 0; i < 20; i++) {
            values.add(score = (int) (Math.random() * 10));
        }
        System.out.println(values);

        Set<Integer> nonDuplicateValues = new HashSet<>(values);
        System.out.println(nonDuplicateValues);
    }
}
