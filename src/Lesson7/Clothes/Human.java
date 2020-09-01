package Lesson7.Clothes;

import Lesson7.Clothes.Jacket.IJacket;
import Lesson7.Clothes.Shoes.IShoes;
import Lesson7.Clothes.Trousers.ITrousers;

public class Human implements IHuman {
    private String name;
    private IJacket jacket;
    private ITrousers trousers;
    private IShoes shoes;

    public Human(String name, IJacket jacket, ITrousers trousers, IShoes shoes) {
        this.name = name;
        this.jacket = jacket;
        this.trousers = trousers;
        this.shoes = shoes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IJacket getJacket() {
        return jacket;
    }

    public void setJacket(IJacket jacket) {
        this.jacket = jacket;
    }

    public ITrousers getTrousers() {
        return trousers;
    }

    public void setTrousers(ITrousers trousers) {
        this.trousers = trousers;
    }

    public IShoes getShoes() {
        return shoes;
    }

    public void setShoes(IShoes shoes) {
        this.shoes = shoes;
    }

    @Override
    public void putOnClothes() {
        shoes.putOn();
        trousers.putOn();
        jacket.putOn();
    }

    @Override
    public void takeOffClotes() {
        shoes.takeOff();
        trousers.takeOff();
        jacket.takeOff();
    }
}
