//Создать массив оценок произвольной длины, вывести максимальную и
//минимальную оценку, её (их) номера.

public class Task14M {
    public static void main(String[] args) {
        int[] list = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 10);
        }
        int max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] > max) {
                max = list[i];
            }

        }
        int min = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] < min) {
                min = list[i];
            }
        }
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
        System.out.println();
        System.out.println(max);
        System.out.println(min);
    }
}
