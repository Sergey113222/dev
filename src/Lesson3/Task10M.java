//Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).

public class Task10M {
    public static void main(String[] args) {
        int factorial = 1;
        for (int i = 10; i <= 15; i++) {
            factorial = factorial * i;

        }
        System.out.println(factorial);
    }
}
