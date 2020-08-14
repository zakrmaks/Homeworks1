package HomeWork_12;

import java.util.*;

public class MyList implements List {
    private Object[] array;
    private int size;

    public MyList() {
        this.size = 0;
        this.array = new Object[size];
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
        for (Object object : array) {
            if (object.equals(o)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            int next = 0;

            @Override
            public boolean hasNext() {
                if (next < size) {
                    return true;
                }
                return false;
            }

            @Override
            public Object next() {
                Object object = array[next];
                next++;
                return object;
            }
        };
    }

    @Override
    public Object[] toArray() {
        return copyOf();
    }

    @Override
    public boolean add(Object o) {
        addEllement(1);
        array[size] = o;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) {
                array[i] = null;
                deleteNullElement();
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        for (Object o : c.toArray()) {
            add(o);
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        addEllement(c.size());
        System.arraycopy(array, index, array,index + c.size(),size-index);
        System.arraycopy(c.toArray(), 0, array, index, c.size());
        size += c.size();
        return true;
    }

    @Override
    public void clear() {
        size = 0;
        this.array = new Object[size];
    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    @Override
    public Object set(int index, Object element) {
        Object temp = array[index];
        array[index] = element;
        return temp;
    }

    //FIXME!!!
    @Override
    public void add(int index, Object element) {
      addEllement(1);
System.arraycopy(array,index,array,index+1,size-index);
array[index] = element;
size++;
    }

    @Override
    public Object remove(int index) {
        Object temp = array[index];
        array[index] = null;
        deleteNullElement();
        return temp;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (array[i].equals(o)) {
                index = i;
            }
        }
        return index;
    }

    @Override
    public ListIterator listIterator() {
        return new ListIterator() {
            int next = 0;

            @Override
            public boolean hasNext() {
                if (next < size) {
                    return true;
                }
                return false;
            }

            @Override
            public Object next() {
                Object object = array[next];
                next++;
                return object;
            }

            @Override
            public boolean hasPrevious() {
                return next > 0;
            }

            @Override
            public Object previous() {
                Object object = array[next - 1];
                next--;
                return object;
            }

            @Override
            public int nextIndex() {
                return next;
            }

            @Override
            public int previousIndex() {
                return next - 1;
            }

            @Override
            public void remove() {
                System.arraycopy(array, next, array, next - 1, size - next);
                next--;
            }

            @Override
            public void set(Object o) {
                array[next] = o;
            }

            @Override
            public void add(Object o) {
                System.arraycopy(array,next,array,next+1,size-next);
                array[next] = o;
                size++;
            }
        }

                ;
    }

    @Override
    public ListIterator listIterator(int index) {
        return new ListIterator() {
            int next = index;

            @Override
            public boolean hasNext() {
                if (next < size) {
                    return true;
                }
                return false;
            }

            @Override
            public Object next() {
                Object object = array[next];
                next++;
                return object;
            }

            @Override
            public boolean hasPrevious() {
                return next > 0;
            }

            @Override
            public Object previous() {
                Object object = array[next - 1];
                next--;
                return object;
            }

            @Override
            public int nextIndex() {
                return next;
            }

            @Override
            public int previousIndex() {
                return next - 1;
            }

            @Override
            public void remove() {
                System.arraycopy(array, next, array, next - 1, size - next);
                next--;
            }

            @Override
            public void set(Object o) {
                array[next] = o;
            }

            @Override
            public void add(Object o) {
                System.arraycopy(array,next,array,next+1,size-next);
                array[next] = o;
                size++;
            }
        }

                ;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        List temp = new MyList();
        for (int i = fromIndex; i < toIndex; i++) {
            temp.add(array[i]);
        }
        return temp;
    }

    @Override
    public boolean retainAll(Collection c) {
        MyList temp = new MyList();
        for (Object object : c.toArray()){
            if (contains(object)){
                temp.add(object);
            }
        }
        array = temp.toArray();
        return true;
    }

    @Override
    public boolean removeAll(Collection c) {
        for (Object o : c.toArray()) {
            remove(o);
        }
        return true;
    }

    @Override
    public boolean containsAll(Collection c) {
        int count = 0;
        for (Object object : c.toArray()) {
            if (contains(object)) {
                count++;
            }
        }
        return count >= c.size();
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public String toString() {
        return "array=" + Arrays.toString(array);
    }

    private void deleteNullElement() {
        int count = 0;
        int arrayCount = 0;
        for (Object o : array) {
            if (o == null) {
                count++;
            }
        }
        Object[] temp = new Object[array.length - count];
        for (int i = 0; i < array.length; i++) {
            for (int j = arrayCount; j < temp.length; j++) {
                if (array[i] != null) {
                    temp[j] = array[i];
                    arrayCount++;
                    break;
                }
            }
        }size -= count;
        array = temp;
    }

    private Object[] copyOf() {
        Object[] temp = new Object[size];
        System.arraycopy(array, 0, temp, 0, size);
        return temp;
    }

    private void addEllement(int numOfEll) {
        Object[] temp = new Object[array.length + numOfEll];
        System.arraycopy(array, 0, temp, 0, array.length);
        array = temp;
    }
}
