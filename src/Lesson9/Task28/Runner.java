package Lesson9.Task28;

//Написать класс, который умеет хранить в себе массив любых типов данных (int, long
//etc.). Реализовать метод get(int index), который возвращает любой элемент
//массива по индексу.

public class Runner {
    public static void main(String[] args) {
        String[] arrayS = {"sss", "rrr", "aaa"};
        Integer [] arrayI = {1, 2, 3};

        Array<Integer> arrayInt = new Array<Integer>(arrayI);

        Array<String> arrayStr = new Array<String>(arrayS);
        System.out.println(arrayInt.get(2));
        System.out.println(arrayStr.get(2));

    }
}
