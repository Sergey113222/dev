
/*
Задание 4
Определить число, полученное выписыванием в обратном порядке цифр
любого 4-х значного натурального числа n.
 */
public class Task4M {
    public static void main(String[] args) {
        int a = 1034;
        int a4 = a % 10;
        int a3 = ((a - a4) % 100) / 10;
        int a2 = ((a - a3 * 10 - a4) % 1000) / 100;
        int a1 = (a - a2 * 100 - a3 * 10 - a4) / 1000;



        System.out.print(a4);
        System.out.print(a3);
        System.out.print(a2);
        System.out.print(a1);
    }
}
