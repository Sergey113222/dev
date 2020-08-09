//Создать последовательность случайных чисел, найти и вывести наибольшее
//из них.

public class Task13M {
    public static void main(String[] args) {
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 20);
        }
        int max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
            }
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        System.out.println(max);

    }
}
