package HomeWork_5;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 1, 6};
        IntArray array = new IntArray();
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        array.addAll(arr);
        System.out.println(array.ToString());
        System.out.println(array.indexOf(2));
        System.out.println(array.contain(15));
        System.out.println(array.sizeOf());
        array.sort();
        System.out.println(array.ToString());
        System.out.println(array.contain(5));
        array.clean();
        array.add(7);
        array.add(14);
        array.add(15);
        array.add(3);
        System.out.println(array.ToString());
    }
}
