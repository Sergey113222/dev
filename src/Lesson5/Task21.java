//Напишите три цикла выполняющих многократное сложение строк, один с
//помощью оператора сложения и String, другой с помощью StringBuilder и метода
//append, а также аналогино для StringBuffer. Сравните скорость их выполнения.
public class Task21 {
    public static void main(String[] args) {

        //String

        long start1 = System.currentTimeMillis();
        String s = "0";
        for (int i = 1; i < 100; i++) {
            s += i;
        }
        System.out.println(s);
        long finish1 = System.currentTimeMillis();
        long resultTime1 = finish1 - start1;
        System.out.println(resultTime1);

        //StringBuilder

        long start2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("0");
        for (int j = 1; j <100; j++) {
            sb.append(j);
        }
        System.out.println(sb.toString());
        long finish2 = System.currentTimeMillis();
        long resultTime2 = finish2 - start2;
        System.out.println(resultTime2);

        //StringBuffer

        long start3 = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer("0");
        for (int k = 1; k <100; k++) {
            sbf.append(k);
        }
        System.out.println(sb.toString());
        long finish3 = System.currentTimeMillis();
        long resultTime3 = finish3 - start3;
        System.out.println(resultTime3);
    }
}
