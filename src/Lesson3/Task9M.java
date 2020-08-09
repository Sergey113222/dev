public class Task9M {

    //изтенить притер чтобы высчитывалась не сумма а произведение
    public static void main(String[] args) {

        long factorial = 1;

        long x = (long) (Math.random() * 20) + 1; //Math.random от [0.0 до 1.0)
        while (x != 0) {
            factorial = x * factorial;

            x = (long) (Math.random() * 20);
        }

        System.out.println("произведение: " + factorial);

    }
}
// так и не понял почему иногда могут появляться отрицательные числа или ноль??? Не влазят в long?
