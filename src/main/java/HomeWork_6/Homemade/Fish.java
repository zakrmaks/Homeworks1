package HomeWork_6.Homemade;

import HomeWork_6.Wild.Wild;

public class Fish extends Homemade {
    public Fish(String nickname) {
        super(nickname);
    }

    @Override
    public void greet() {
        super.greet();
        System.out.println(".....bulbulbul....");;
    }
}
