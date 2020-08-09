/*4) Даны 3 целых числа. Найти количество положительных чисел в исходномнаборе.*/

public class Task4 {
    public static void main(String[] args) {
        int a = -1;
        int b = -2;
        int c = -3;
        int sum = 0;
        if (a>0 )
            ++sum;
        if (b>0)
            ++sum;
        if (c>0)
            ++sum;
        System.out.println(sum);

    }
}
