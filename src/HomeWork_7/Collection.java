package HomeWork_7;

public class Collection {
    private int SIZE_OF = 4;
    private Object[] array = new Object[SIZE_OF];

    public Collection(Object[] s) {
        this.SIZE_OF = s.length;
        this.array = s;
    }

    public boolean isEmpty() {
        boolean isEmpty = false;
        for (int i = 0; i < SIZE_OF; i++) {
            if (array[i] == null) isEmpty = true;
        }
        return isEmpty;
    }

    public boolean contains(Object e) {
        boolean isContain = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(e)) {
                isContain = true;
            }
        }
        return isContain;
    }

    public void add(Object a) {
        if (SIZE_OF == array.length) {
            Object[] newArray = new Object[SIZE_OF * 2];
            for (int i = 0; i < SIZE_OF; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[SIZE_OF] = a;
        SIZE_OF++;
    }

    public boolean remove(Object s) {
        int count = -1;
        for (int i = 0; i < SIZE_OF; i++) {
            if (array[i] == s) {
                array[i] = 0;
                count++;
                break;
            }
        }
        arrayCopy();
        return (count == -1 ? false : true);
    }



    public void addAll(Collection s) {
        Object[] newArray = new Object[SIZE_OF + s.array.length];
       int count = 0;
        for (int i = 0; i < SIZE_OF; i++) {
            newArray[i] = array[i];
        }
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] == null) {
                for (int j = count; j < s.array.length; j++) {
                    newArray[i] = s.array[j];
                    count++;
                    break;
                }
            }
        }
        array = newArray;
        SIZE_OF++;
    }
public void retainAll(Collection s){
    Object[] newArray = new Object[s.array.length];
    for (int i = 0; i < s.array.length; i++) {
        newArray[i] = s.array[i];
    }
    array = newArray;
}
public void removeAll(Collection s){
        int count = 0;
    for (int i = 0; i < s.array.length; i++) {
            for (int j = count; j < SIZE_OF; j++) {
                if (array[j] == s.array[i]) {
                    array[j] = 0;
                    count++;
                    break;
                }
        }
    }
    arrayCopy();
}
public boolean containAll(Collection s){
        int count = 0;
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < s.array.length; j++) {
            if (array[i] == s.array[j]){
                count++;
                break;
            }

        }

    }
    return (count == array.length? true : false);
}
private void arrayCopy(){
        int count = 0;
       int countOfArrayLength = 0;

    for (int i = 0; i < array.length; i++) {
        if (array[i] == (Object)0) count++;
    }
        Object[] temp = new Object[array.length-count];
    for (int i = 0; i < array.length; i++) {
        for (int j = countOfArrayLength; j < array.length-count; j++) {
            if (array[i].equals(0)) {
                break;
            }
            if (j == array.length - count) break;
            temp[j] = array[i];
            countOfArrayLength++;
            break;
        }
    }
    this.array = temp;
}

}

