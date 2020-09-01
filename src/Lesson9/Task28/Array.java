package Lesson9.Task28;

public class Array<T> {
    private T [] item;

    public Array(T[] item) {
        this.item = item;
    }

    public T get(int index) {
        return item[index];
    }


}
