package HomeWork_24;

public class Pov {
    public static void main(String[] args) {
        for (int i = -3; i < 20; i++) {

            double answer = pow(2, i);
            System.out.println(i + ": " + answer);
        }
    }

    private static double pow(double number, int power) {
        if (power < 0) {
            power = -power;
            number = 1 / number;
        }

        double result = 1;
        while (power > 0) {
            if (power % 2 == 1) {
                result = result * number;
                power--;
            }
            number = number * number;
            power = power / 2;
        }

        return result;
    }
}
