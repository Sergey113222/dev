/*5) Даны 3 целых числа. Найти количество положительных и отрицательныхчисел в исходном наборе.*/

public class Task5 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = -3;
        int positive= 0;
        int negative = 0;
        if (a> 0)
            ++positive;
        if (a<0)
            ++negative;
        if (b> 0)
            ++positive;
        if (b<0)
            ++negative;
        if (c> 0)
            ++positive;
        if (c<0)
            ++negative;
        System.out.println(positive);
        System.out.println(negative);
    }
}
