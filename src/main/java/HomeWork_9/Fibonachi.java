package HomeWork_9;

import java.math.BigInteger;
import java.util.Scanner;

public class Fibonachi {
    private BigInteger a;
    private BigInteger b;
    private BigInteger summ;

    public Fibonachi() {
        this.a = BigInteger.valueOf(0);
        this.b = BigInteger.valueOf(1);
        this.summ = BigInteger.valueOf(1);
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число ");
        int num = scan.nextInt();
        System.out.print(0);
        for (int i = 1; i <= num; i++) {
            System.out.print(" " + summ);
            summ = a.add(b);
            a = b;
            b = summ;
        }
    }
}
