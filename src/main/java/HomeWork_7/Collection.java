package HomeWork_7;

public class Collection {
    private Object[] array = new Object[0];

    public Collection() {
    }

    public Collection(Object[] s) {
        Object[] temp = new Object[s.length];
        System.arraycopy(s, 0, temp, 0, s.length);
        array = temp;
    }

    public boolean isEmpty() {
        boolean isEmpty = false;
        for (int i = 0; i < array.length; i++) {
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
        Object[] newArray = new Object[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = a;
        array = newArray;

    }


    public boolean remove(Object s) {
        int count = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(s)) {
                array[i] = 0;
                count++;
                break;
            }
        }
        arrayCopy();
        return (count == -1 ? false : true);
    }


    public void addAll(Collection s) {
        Object[] newArray = new Object[array.length + s.array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
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
    }

    public void retainAll(Collection s) {
        Object[] newArray = new Object[s.array.length];
        for (int i = 0; i < s.array.length; i++) {
            for (int j = 0; j < s.array.length; j++) {
                if (array[i].equals(s.array[j])){
                    newArray[i]= s.array[j];
                    break;
                }

            }
        }
        array = newArray;
    }

    public void removeAll(Collection s) {
        int count = 0;
        for (int i = 0; i < s.array.length; i++) {
            for (int j = count; j < array.length; j++) {
                if (array[j].equals(s.array[i])) {
                    array[j] = 0;
                    count++;
                    break;
                }
            }
        }
        arrayCopy();
    }

    public boolean containAll(Collection s) {
        int count = 0;
        for (int i = 0; i < s.array.length; i++) {
            if (contains(s.array[i])){
                count++;
            }

        }
        return (count >= s.array.length ? true : false);
    }

    private void arrayCopy() {
        int count = 0;
        int countOfArrayLength = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(0)) count++;
        }
        Object[] temp = new Object[array.length - count];
        for (int i = 0; i < array.length; i++) {
            for (int j = countOfArrayLength; j < array.length - count; j++) {
                if (array[i].equals(0)) {
                    break;
                }
                if (j >= array.length - count) break;
                temp[j] = array[i];
                countOfArrayLength++;
                break;
            }
        }
        this.array = temp;
    }

}

