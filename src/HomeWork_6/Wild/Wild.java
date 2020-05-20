package HomeWork_6.Wild;

import HomeWork_6.Animals;

public class Wild extends Animals {
    private boolean isPredator;

    @Override
    public void greet() {
        System.out.print("Hello, I am a wild animal");;
    }
}
