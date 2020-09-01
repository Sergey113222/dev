package Lesson7.Clothes;

//Интерфейсы:
//- Куртка
//- Штаны
//- Обувь
//в каждом интерфейсе есть 2 метода (надеть и снять)
//Делаем несколько реализации каждого интерфейса.
//Создаём класс человек:
//У человека поля:
//-имя
//-куртка
//-штаны
//-обувь
//У человека есть 2 метода:
//- одеться(вызываются методы надеть у всех вещей)
//- раздеться (вызываются методы снять у всех вещей)

import Lesson7.Clothes.Jacket.AdidasJacket;
import Lesson7.Clothes.Jacket.NikeJacket;
import Lesson7.Clothes.Shoes.AdidasShoes;
import Lesson7.Clothes.Shoes.NikeShoes;
import Lesson7.Clothes.Trousers.AdidasTrousers;
import Lesson7.Clothes.Trousers.NikeTrousers;

public class Runner {
    public static void main(String[] args) {


        IHuman humanAdidas = new Human("Вася", new AdidasJacket(), new AdidasTrousers(), new AdidasShoes());

        humanAdidas.putOnClothes();
        humanAdidas.takeOffClotes();
        System.out.println();
        IHuman humanNike = new Human("Коля", new NikeJacket(), new NikeTrousers(), new NikeShoes());
        humanNike.putOnClothes();
        humanNike.takeOffClotes();
    }
}
