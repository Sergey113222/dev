//Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
//которых есть параметры, например <p id=”p1”>, и замену их на простые теги
//абзацев <p>.

public class Task23 {
    public static void main(String[] args) {
        String str = "<p>абзац первый</p> <p id=”p1”> абзац второй</p>";
        String strNew = str.replaceAll("</p>", "<p>");
         strNew = str.replaceAll("<.{1,10}>", "<p>");
        System.out.println(strNew);
    }
}
