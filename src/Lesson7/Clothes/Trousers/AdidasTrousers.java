package Lesson7.Clothes.Trousers;

public class AdidasTrousers implements ITrousers {
    @Override
    public void takeOff() {
        System.out.println("снял штаны адидас");
    }

    @Override
    public void putOn() {
        System.out.println("Одел штаны адидас");

    }
}
