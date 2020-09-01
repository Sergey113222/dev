package Lesson7.Clothes.Shoes;

public class AdidasShoes implements IShoes {
    @Override
    public void takeOff() {
        System.out.println("снял кросовки адидас");
    }

    @Override
    public void putOn() {
        System.out.println("одел кросовки адидас");
    }
}
