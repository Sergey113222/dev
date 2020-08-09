//Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
//учесть, что слова могут разделяться несколькими пробелами, в начале и конце
//текста также могут быть пробелы, но могут и отсутствовать.

public class Task19 {
    public static void main(String[] args) {
        String str = "Строковый литерал это последовательность символов, заключенных в двойные кавычки.";

        int n = 1;
        char symbol;

        if (str.charAt(0) == ' ') { // это мы отсекаем первый пробел
            for (int i = 1; i < str.length() - 1; i++) { // это мы отсекаем последний пробел
                symbol = str.charAt(i);
                if (symbol == ' ') {
                    n++;
                } else if (str.charAt(i) == ' ' && str.charAt(i + 1) == ' ') { // это если два пробела подряд
                    n--;
                }

            }
        } else if (str.charAt(0) != ' ')
            for (int i = 0; i < str.length() - 1; i++) {
                symbol = str.charAt(i);
                if (symbol == ' ') {
                    n++;
                } else if (str.charAt(i) == ' ' && str.charAt(i + 1) == ' ') {
                    n--;
                }

            }
        System.out.println("У нас есть " + n + " слов");
    }
}

