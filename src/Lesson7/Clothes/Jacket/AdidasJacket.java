package Lesson7.Clothes.Jacket;

public class AdidasJacket implements IJacket {
    @Override
    public void takeOff() {
        System.out.println("снял куртку адидас");
    }

    @Override
    public void putOn() {
        System.out.println("одел куртку адидас");
    }
}
