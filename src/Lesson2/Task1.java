import java.util.Scanner;

/*
1)В переменную записываем число.
Надо вывести на экран сколько в этомчисле цифр и положительное оно или отрицательное.
 Например, "этооднозначное положительное число". Достаточно будет определить, является личисло однозначным,
  "двухзначным или трехзначным и более.

 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int length = String.valueOf(Math.abs(a)).length();

        if ((a>0)&& (length==1))
            System.out.println("однозначное положительное число ");
        if ((a<0)&& (length==1))
            System.out.println("однозначное отрицательное число");
        if ((a>0)&& (length==2))
            System.out.println("двухзначное положительное число ");
        if ((a<0)&& (length==2))
            System.out.println("двухзначное отрицательное число");
        if ((a>0)&& (length==3))
            System.out.println("трехзначное положительное число ");
        if ((a<0)&& (length==3))
            System.out.println("трехзначное отрицательное число");
    }
}
