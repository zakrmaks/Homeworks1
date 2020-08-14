package HomeWork_10;

public class Main {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        MyLinkedList list1 = new MyLinkedList();
        System.out.println("empty? : " + list.isEmpty());
        list.add(1);
        System.out.println("empty? : " + list.isEmpty());
        list.add(2);
        list.add(3);
//        list.clear();
        System.out.println("Contain 3? " + list.contains(3));
//        System.out.println(list.toString() + "empty");
        list.add(4);
        list.remove(1);
        list.remove(4);
        list.add(5);
        list.add(6);
        System.out.println(list.toString());
        list1.add(15);
        list1.add(16);
        list1.add(17);
        list.addAll(list1);
        System.out.println(list.toString());
//        list.removeAll(list1);
//Iterator iter = MyLinkedList.iterator();
        System.out.println(list.containsAll(list1));
        System.out.println(list.retainAll(list1));
        System.out.println(list.toString());
        System.out.println(list.iterator().hasNext());
        System.out.println(list.iterator().next().toString());
        System.out.println(list.iterator().hasNext());
        System.out.println(list.iterator().next().toString());
        System.out.println(list.iterator().hasNext());
        System.out.println(list.iterator().next().toString());
        System.out.println(list.iterator().hasNext());

    }
}
