package HomeWork_5;

public class IntArray {
    private int size = 10;
    private int[] array = new int[size];

    public IntArray(int[] array) {
        this.array = copyOf(array);
        this.size = array.length;
    }

    public IntArray() {
    }

    public String ToString() {
        if (isEmpty() || array == null) {
            return "[]";
        }
        String line = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) continue;
            line += array[i] + ", ";
        }
        line = line.substring(0, line.length() - 2);
        line = "[" + line + "]";
        return line;
    }

    public int indexOf(int indexToFind) {
        for (int i = 0; i < array.length; i++) {
            if (indexToFind == i) return i;
        }
        return -1;
    }

    public boolean contain(int findNumber) {
        boolean count = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == findNumber) {
                count = true;
                break;
            }
        }
        return count;
    }

    public int sizeOf() {
        return size;
    }

    public void add(int addEll) {
        if (size == array.length) {
            int[] newArray = new int[size * 2];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size] = addEll;
        size++;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addAll(int[] arr) {
        int[] newArr = new int[size * 2];
        newArr = array;
        for (int i = 0, j = 0; i < newArr.length; i++) {
            newArr[i] = array[i];
            if (array[i] == 0) {
                if (arr.length == j) break;
                newArr[i] = arr[j];
                j++;
            }
        }
        this.array = newArr;
    }

    public void clean() {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }

    public void sort() {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > array[i + 1]) {
                    if (array[i + 1] == 0) break;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
    }

    public int[] copyOf(int[] array) {
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        return temp;
    }
}


