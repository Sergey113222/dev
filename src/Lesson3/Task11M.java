//Имеется целое число, определить является ли это число простым, т.е.
//делится без остатка только на 1 и себя.

public class Task11M {
    public static void main(String[] args) {
        int x = (int) (Math.random() * 10);
        if (x != 0) {
            while (x % x == 0 && x % 1 == 0) {
                System.out.println(x);
                break;
            }
        } else {
            System.out.println("ноль не является простым числом");
        }
    }
}
