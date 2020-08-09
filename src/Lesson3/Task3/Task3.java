package Lesson3.Task3;
/*
Вычислить: 1+2+4+8+...+256
 */
public class Task3 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 1;
        for (int j = 0; j < 8; j++) {
            i = i * 2;
            sum = sum + i;
            System.out.println(i);
            System.out.println(sum);
        }
        System.out.println(sum);
    }
}
