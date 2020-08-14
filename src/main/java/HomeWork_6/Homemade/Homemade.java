package HomeWork_6.Homemade;

import HomeWork_6.Animals;

public class Homemade extends Animals {
    private String nickname;
    private boolean isVaccinated;

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public Homemade(String nickname) {
        this.nickname = nickname;
    }

    public String getNickname() {
        return nickname;
    }

    public Homemade(boolean isVaccinated) {
        this.isVaccinated = isVaccinated;
    }
    @Override
    public void greet() {
        super.greet();
        System.out.print(" my name is " + getNickname());

    }
}
