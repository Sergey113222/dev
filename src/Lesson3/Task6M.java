import java.util.Scanner;

/*
Создайте число. Определите, является ли число трехзначным. Определите, является
ли его последняя цифра семеркой. Определите, является ли число четным.
 */
public class Task6M {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i % 2 == 0) {
            System.out.println("число четное");
            if (i >= 100 && i < 1000) {
                System.out.println("число трухзначное ");
            }
        } else if (i >= 100 && i < 1000) {
            System.out.println("число трухзначное ");
            if (i % 10 == 7) {
                System.out.println("является");
            }
        } else if (i % 10 == 7) {
            System.out.println("является");
        }
    }
}

