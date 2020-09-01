package Lesson7.Clothes.Trousers;

public class NikeTrousers implements ITrousers {
    @Override
    public void takeOff() {
        System.out.println("снял штаны найк");
    }

    @Override
    public void putOn() {
        System.out.println("одел штаны найк");
    }
}
