package HomeWork_12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        MyList list = new MyList();
        MyList list2 = new MyList();

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        System.out.println(list2.toString());

        System.out.println(" size? " + list2.size());
//
        list.add(10);
        list.add(11);
        list.add(12);
        System.out.println(list.toString());
        list2.addAll(2,list);
        System.out.println(list2.toString());
        System.out.println("Contains?" + list2.contains(2));
        System.out.println(list2.subList(2,5).toString());
        System.out.println(list2.retainAll(list));
        System.out.println(list2.toString());



    }
}
