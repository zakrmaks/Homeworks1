package HomeWork_5;

public class IntArray {
    private int[] array = new int[0];

    public IntArray(int[] array) {
        this.array = copyOf(array);
    }

    public IntArray() {
    }

    public int indexOf(int indexToFind) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == indexToFind) return i+1;
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
        return array.length;
    }

    public void add(int addEll) {
            int[] newArray = new int[array.length +1];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        array[array.length-1] = addEll;
    }

    public boolean isEmpty() {
        return array.length == 0;
    }

    public void addAll(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            add(arr[i]);
        }
    }

    public void clean() {

        array = new int[0];

    }


    public int[] copyOf(int[] array) {
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        return temp;
    }
    public void sort(){
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
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
}


