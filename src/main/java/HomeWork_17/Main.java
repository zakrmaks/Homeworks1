package HomeWork_17;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrList<String> list = new ArrList<>();
        Iterator iter = list.iterator();
        list.add("Hello");
        list.add("Bt");
        list.add("sdss");
        System.out.println(list.contains("Bt"));
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(iter.hasNext());
        System.out.println(iter.next());
        System.out.println(iter.hasNext());
        System.out.println(iter.next());
        System.out.println(iter.hasNext());
        System.out.println(iter.next());
        System.out.println(iter.hasNext());
     Object[] temp = new Object[list.size()];
     temp = list.toArray();
        for (int i = 0; i < temp.length; i++) {
            System.out.print(" "+ temp[i]+ " ");
        }
        System.out.println(list.remove("Bt"));
        temp = list.toArray();
        for (int i = 0; i < temp.length; i++) {
            System.out.print(" "+ temp[i]);
        }
        list.clear();
        System.out.println(list.size());
    }



}
