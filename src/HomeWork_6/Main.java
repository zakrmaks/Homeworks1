package HomeWork_6;

import HomeWork_6.Homemade.*;
import HomeWork_6.Wild.*;
import HomeWork_6.Wild.Predator.Crocodile;
import HomeWork_6.Wild.Predator.Lion;
import HomeWork_6.Wild.Predator.Wolf;

public class Main {
    public static void main(String[] args) {
        final Animals[] animals = create();
        for (Animals animal :animals) {
animal.greet();

        }
    }
public static Animals[] create(){
        Guide_dog guideDog = new Guide_dog("Поводырь");
    Cat cat = new Cat("Мурзик");
    Dog dog = new Dog("Джек");
    Hamster hamster = new Hamster("Борька");
    Fish fish = new Fish("Рыбка");
    Giraf giraf = new Giraf();
    Crocodile crocodile = new Crocodile();
    Lion lion = new Lion();
    Wolf wolf = new Wolf();
    Animals animals[] = new Animals[]{cat, dog, guideDog, hamster, fish, giraf, crocodile, lion, wolf};
    return animals;

}
}
