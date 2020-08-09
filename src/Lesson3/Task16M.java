//Определите сумму элементов одномерного массива, расположенных между
//минимальным и максимальным значениями.

public class Task16M {
    public static void main(String[] args) {
        int sum = 0;
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < list.length; i++) {

            sum = sum + list[i];
        }
        System.out.println(sum);

    }
}
