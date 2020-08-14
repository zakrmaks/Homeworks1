package HomeWork_6.Homemade;

import HomeWork_6.Homemade.Homemade;

public class Dog extends Homemade {
    public Dog(String nickname) {
        super(nickname);
    }
    @Override
    public void greet() {
        super.greet();
        System.out.println(" Woof");
    }
}
