package HomeWork_9;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//new Fibonachi();
IntArray intarr = new IntArray();
intarr.add(4);
intarr.add(10);
intarr.add(16);
intarr.add(3);
intarr.add(2);
intarr.add(5);
        System.out.println(intarr.ToString());
        intarr.sort();
        System.out.println(intarr.ToString());
        System.out.println(intarr.binarySearch(10));
    }
}
