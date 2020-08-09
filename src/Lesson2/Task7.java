/*7)  В переменную записываете количество программистов.
В зависимости от количества программистов необходимо вывести правильно окончание.
Например: • 2 программиста • 1 программиста • 10 программистов • и т.д.
 */

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int programer = scanner.nextInt();
        if (programer == 0)
            System.out.println(programer + " программистов");
        if (programer == 1)
            System.out.println(programer + " программист");
        if ((programer > 1) && (programer < 5))
            System.out.println(programer + " программиста");
        if ((programer >= 5) && (programer <= 100))
            System.out.println(programer + " программистов");
    }
}
