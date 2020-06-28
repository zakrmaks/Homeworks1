package Test;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        ArrayList list2 = new ArrayList();
        ArrayList list3 = new ArrayList();
        ArrayList list4 = new ArrayList();
//        Comparator compare = new Comaprator();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        System.out.println(list2.toString());
        System.out.println(" size? " + list2.size());
        list.add(6);
        list.add(7);
        list.add(8);
        list.addAll(2, list2);
        System.out.println(list.toString());
//        list2.set(0,15);
//        System.out.println(list2.toString());
//        Object temp = list2.set(0,10);
//        System.out.println(list2.toString());
//        list2.add(4,132);
//        System.out.println(list2.toString());


    }
}

