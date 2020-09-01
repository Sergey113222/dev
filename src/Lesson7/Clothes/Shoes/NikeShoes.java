package Lesson7.Clothes.Shoes;

public class NikeShoes implements IShoes {
    @Override
    public void takeOff() {
        System.out.println("снял кросовки найк");
    }

    @Override
    public void putOn() {
        System.out.println("одел кросовки найк");
    }
}
