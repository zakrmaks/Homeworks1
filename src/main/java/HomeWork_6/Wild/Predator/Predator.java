package HomeWork_6.Wild.Predator;

import HomeWork_6.Wild.Wild;

public class Predator extends Wild {
    @Override
    public void greet() {
        super.greet();
        System.out.println(" and I am angry");
    }
}
