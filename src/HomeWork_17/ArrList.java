package HomeWork_17;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class ArrList<E> implements Collection<E> {

    private E[] array;
    private int size;

    public ArrList() {
        this.size = 0;
        Object[] temp = new Object[size];
        this.array = (E[])temp;
    }

    @Override
    public String toString() {
        return "ArrList{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (E element : array) {
            if (element.equals(o))
                return true;
        }

        return false;
    }


    @Override
    public Iterator<E> iterator() {

        return new Iterator<>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < array.length;
            }

            @Override
            public E next() {
                E result = array[index];
                index++;
                return result;
            }
        };
    }


    @Override
    public Object[] toArray() {
        Object[] temp = new Object[size];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        return temp;
    }


    @Override
    public <T> T[] toArray(T[] a) {
        return a;
    }

    @Override
    public boolean add(E e) {
        if (e == null) {
            throw new NullPointerException("Can't add null element");
        }
       array = addEllement(1);
        array[size] = e;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        if (o == null) {
            throw new NullPointerException("Can't add null element");
        }
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)){
                array[i] = null;
                array = deleteNullElement();
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object obj : c.toArray()){
            if (!contains(obj)){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        array = null;
        size = 0;

    }

    private <E> E[] addEllement(int numOfEll) {
       Object[] temp = new Object[size+numOfEll];
        System.arraycopy(array, 0, temp, 0, size);
        E[] tempCast = (E[]) temp;
        return tempCast;
    }
    private <E> E[] deleteNullElement() {
        Object[] temp = new Object[size];
        int count = 0;
        int arrayCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]== null) count++;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = arrayCount; j < temp.length; j++) {
                if (array[i]!= null) {
                    temp[j] = array[i];
                    arrayCount++;
                    break;
                }
            }
        }
        E[] tempCast = (E[]) temp;
        return tempCast;
    }
}
