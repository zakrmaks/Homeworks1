package HomeWork_8;


import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;


public class Container implements Collection {
   private Object[] array;
    private int size;

    public Container() {
        size = 0;
        array = new Object[size];
    }

    public Container(Object[] array) {
        this.array = array;
        size = array.length;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return array == null;
    }


    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < array.length;
            }

            @Override
            public Object next() {
                Object result = array[index];
                index++;
                return result;
            }
        };
    }

    @Override
    public Object[] toArray() {
        Object[] temp = new Object[array.length];
        System.arraycopy(array, 0, temp, 0, array.length);
        return temp;
    }

    @Override
    public boolean add(Object o) {
        Object[] temp = new Object[size + 1];
        for (int i = 0; i < array.length; i++) {
            temp[i] = array[i];
        }
        temp[array.length] = o;
        array = temp;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(o)) {
                array[i] = 0;
                deleteNullElement();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        for (int i = 0; i < c.size(); i++) {
            add(c.toArray()[i]);
        }

        return true;
    }

    @Override
    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
        deleteNullElement();
    }

    @Override
    public boolean retainAll(Collection c) {
        int count = 0;
        Object[] temp = new Object[count];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < c.size(); j++) {
                if (array[i].equals(c.toArray()[j])){
                    temp[count] = array[i];
                    count++;
                }
            }
        }
        array = temp;
        return true;
    }

    @Override
    public boolean removeAll(Collection c) {
        for (int i = 0; i < c.size(); i++) {
            remove(c.toArray()[i]);
        }
        return true;
    }

    @Override
    public boolean containsAll(Collection c) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (contains(c.toArray()[i]) == true){
                count++;
            }
        }
        return (count >= c.size()? true : false);
    }

    @Override
    public Object[] toArray(Object[] a) {
        Object[] temp = new Object[a.length];
        System.arraycopy(a, 0, temp, 0, a.length);
        return temp;
    }

    private void deleteNullElement() {
        int count = 0;
        int arrayCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(0)) count++;
        }
        Object[] temp = new Object[array.length - count];
        for (int i = 0; i < array.length; i++) {
            for (int j = arrayCount; j < temp.length; j++) {
                if (array[i].equals(0) == false) {
                    temp[j] = array[i];
                    arrayCount++;
                    break;
                }
            }
        }
        array = temp;
    }

}
