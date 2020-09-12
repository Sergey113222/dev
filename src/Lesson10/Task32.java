package Lesson10;
//Имеется текст. Следует составить для него частотный словарь.

import java.util.HashMap;
import java.util.Map;

public class Task32 {
    public static void main(String[] args) {
        String text = "Кот собака кролик" +
                " кот Собака кролик" +
                " кот собака кролиК мышь";
        String[] newText = text.replaceAll("[^а-яА-Я]", " ").toLowerCase().split("\\s");
        Map<String, Integer> word = new HashMap<>();
        for (String s : newText){
            if (word.containsKey(s)){
                word.put(s, word.get(s) + 1);
            } else  {
                word.put(s, 1);
            }
        }
        System.out.println(word);
    }


}
