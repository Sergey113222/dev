import java.util.Scanner;

/*
Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
полностью закрыть круглой картонкой радиусом r.
 */
public class Task7M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double r = sc.nextDouble();
        double c = Math.sqrt((a * a) + (b * b));
        if (r >= c) {
            System.out.println("можно закрыть");
        } else {
            System.out.println("нельзя закрыть");
        }
    }
}
