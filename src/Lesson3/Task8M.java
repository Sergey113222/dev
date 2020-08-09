import java.util.Random;

/*
Имеется целове число (задать с помощью Random rand = new Random(); int x =
rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
нему слово «рублей» в правильном падеже.
 */
public class Task8M {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt();
        System.out.println(x);
        if (x == 0) {
            System.out.println(x + " рублей");
        } else if (x >= 5 && x <= 20) {
            System.out.println(x + " рублей");
        } else if (x == 1 || x % 10 == 1) {
            System.out.println(x + " рубль");
        } else if (x == 2 || x == 3 || x == 4 || x % 10 == 2 || x % 10 == 3 || x % 10 == 4) {
            System.out.println(x + " рубля");
        } else if (x >= -20 && x <= -5) {
            System.out.println(x + " рублей");
        } else if (x == -1 || x % 10 == -1) {
            System.out.println(x + " рубль");
        } else if (x == -2 || x == -3 || x == -4 || x % 10 == -2 || x % 10 == -3 || x % 10 == -4) {
            System.out.println(x + " рубля");
        } else {
            System.out.println(x + " рублей");
        }

    }
}
