package HomeWork_6.Homemade;

import HomeWork_6.Homemade.Homemade;

public class Cat extends Homemade {
    public Cat(String nickname) {
        super(nickname);
    }

    @Override
    public void greet() {
        super.greet();
        System.out.println(" Meow");
    }
}
