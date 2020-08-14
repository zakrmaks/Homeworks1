package HomeWork_13;

public class Main {
    public static void main(String[] args) {
        MyTree binarytree = new MyTree();
        binarytree.add(4);
        binarytree.add(5);
        binarytree.add(6);
        binarytree.add(7);
        binarytree.remove(4);
        Object[] temp = binarytree.toArray();
        System.out.println();
    }
}
