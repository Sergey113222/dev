package Lesson3.Task4;
import java.util.Scanner;

/*
Составьте программу, вычисляющую A*B, не пользуясь операциейумножения.

 */
public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int multiply = a;
        for (int i = 1; i < b; i++) {
            multiply = multiply + a;
            System.out.println(multiply);
        }
        System.out.println(multiply);
    }
}
