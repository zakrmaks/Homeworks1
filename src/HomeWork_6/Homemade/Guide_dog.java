package HomeWork_6.Homemade;


public class Guide_dog extends Homemade {
    private boolean isTrained;

    public  Guide_dog(String nickname) {
        super(nickname);
    }

    @Override
    public void greet() {
        super.greet();
        System.out.println( " I can take you at home");
    }
}
