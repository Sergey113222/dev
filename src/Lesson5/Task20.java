//Имеется строка с текстом. Вывести текст, составленный из последних букв
//всех слов.

public class Task20 {
    public static void main(String[] args) {
        String str = "A Строковый литерал это последовательность символов, заключенных в двойные кавычки";

        int n = str.length();
        char symbol;

        if (str.charAt(0) == ' ') { // это мы отсекаем первый пробел
            for (int i = 1; i < str.length() - 1; i++) { // это мы отсекаем последний пробел
                symbol = str.charAt(i);
                if (symbol == ' ') {
                    System.out.print(str.charAt(i - 1));
                }


            }
        } else if (str.charAt(0) != ' ') { // это мы отсекаем первый пробел
            for (int i = 0; i < str.length() - 1; i++) { // это мы отсекаем последний пробел
                symbol = str.charAt(i);
                if (symbol == ' ') {
                    System.out.print(str.charAt(i - 1));
                }

            }

        }
        System.out.print(str.charAt(n-1));

    }
}
