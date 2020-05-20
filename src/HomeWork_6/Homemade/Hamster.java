package HomeWork_6.Homemade;

import HomeWork_6.Homemade.Homemade;

public class Hamster extends Homemade {
    public Hamster(String nickname) {
        super(nickname);
    }

    public Hamster(boolean isVaccinated) {
        super(isVaccinated);

    }

    @Override
    public void greet() {
        super.greet();
        System.out.println();
        ;
    }
}
