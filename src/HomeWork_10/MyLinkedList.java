package HomeWork_10;

import java.util.Collection;
import java.util.Iterator;

public class MyLinkedList implements Collection {
    private Node head = null;
    private int size = 0;
    private Node tail = null;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null ? true : false;
    }

    @Override
    public boolean contains(Object o) {
        Node current = head;
        while (current != null) {
            if (current.getData().equals(o)) {
                return true;
            } else {
            }
            current = current.getNext();
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {

            @Override
            public boolean hasNext() {
                return head != null ;
            }

            @Override
            public Object next() {
                Object result = head.getData();
                head = head.getNext();
                return result;
            }
        };
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        Node current = head;
        for (int i = 0; i < size; i++) {
            array[i] = current.getData();
            current = current.getNext();
        }
        return array;
    }

    @Override
    public boolean add(Object o) {
        if (head == null) {
            head = tail = new Node(o, null);
        } else {
            Node newNode = new Node(o, null);
            tail.setNext(newNode);
            tail = tail.getNext();
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        Node current = head;
        Node next = head.getNext();
        Node temp = null;
        if (head.getData().equals(o)) {
            head = head.getNext();
        }
        while (next != null) {
            if (next.getData().equals(o)) {
                current.setNext(next.getNext());
                temp = current;
                current = current.getNext();
                size--;
                break;
            }
            next = next.getNext();
            current = current.getNext();
        }
        if (tail.getData().equals(o)) {
            tail = temp;
        }
        return false;
    }


    @Override
    public boolean addAll(Collection c) {
        for (Object object : c.toArray()) {
            add(object);
        }
        return true;
    }

    @Override
    public void clear() {
        head = tail = null;
        size = 0;
    }

    @Override
    public boolean retainAll(Collection c) {
        Node curent = head;
        MyLinkedList temp = new MyLinkedList();
        for (Object object : c.toArray()) {
            if (!object.equals(curent.getData())) {
                temp.add(object);
            }
        }
        head = temp.head;
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
        for (Object o : c.toArray()) {
            if (!contains(o)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        Node temp = head;
        String result = " ";
        while (temp != null) {
            result += temp.getData() + ", ";
            temp = temp.getNext();
        }
        return result;
    }

    @Override
    public Object[] toArray(Object[] a) {
        Object[] temp = new Object[a.length];
        System.arraycopy(a, 0, temp, 0, a.length);
        return temp;
    }

    public static class Node {
        private Object data;
        private Node next;

        public Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Object getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setData(Object object) {
            this.data = object;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
