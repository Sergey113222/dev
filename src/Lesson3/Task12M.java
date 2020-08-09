//Найдите сумму первых n целых чисел, которые делятся на 3.

public class Task12M {
    public static void main(String[] args) {
        int quantity = 0;
        int sum = 0;
        int x = (int) (Math.random() * 20);
        while (quantity != 3) {
            if (x % 3 == 0) {
                sum = sum + x;
                ++quantity;
                x = (int) (Math.random() * 20);
            } else {
                x = (int) (Math.random() * 20);
            }
        }
        System.out.println(sum);


    }
}
