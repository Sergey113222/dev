package Lesson7.Clothes.Jacket;

public class NikeJacket implements IJacket {
    @Override
    public void takeOff() {
        System.out.println("снял куртку найк");
    }

    @Override
    public void putOn() {
        System.out.println("одел куртку найк");
    }
}
