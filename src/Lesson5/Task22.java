//Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
//записаных по правилам Java, с помощью регулярных выражений и вывести их на
//страницу.

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// 1 равно 01
//10 равно 0А
//12121212233222246 Получаем число в 16-ой системе счисления: 02B102DA5688866
// в Java используют префикс 0x

public class Task22 {
    public static void main(String[] args) {
        String str = "0xW454 0x255 8A3C 1222 23E5 0x4E111 123435 0x3CA2 0x23  0x4 A1 0xABCD KLNB8 12X1 0x1234567";
        Pattern regexp = Pattern.compile("0x[1-9A-F]{2,20}");
        Matcher m = regexp.matcher(str);
        while (m.find()) {
            System.out.print(str.substring(m.start(), m.end()) + " ");
        }
    }
}
