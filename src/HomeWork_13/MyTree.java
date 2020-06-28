package HomeWork_13;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class MyTree implements Set {
    private Node root;
    private int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public boolean contains(Object o) {
        return containsIn((Integer) o, root);
    }

    private boolean containsIn(int i, Node node) {
        if (node == null) {
            return false;
        }
        if (node.data == i) {
            return true;
        } else if (node.data > i) {
            return containsIn(i, node.left);
        } else {
            return containsIn(i, node.right);
        }
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            Node temp = root;
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        Integer data = (Integer) o;
        Node newNode = new Node(data);
        if (root == null) {
            root = newNode;
        } else {
            appendNode(data, root);
        }
        size++;
        return false;
    }

    private void appendNode(Integer toAdd, Node node) {
        if (node.data == toAdd) {
            return;
        } else if (node.data > toAdd) {
            if (node.left == null) {
                node.left = new Node(toAdd);
            } else {
                appendNode(toAdd, node.left);
            }
        } else {
            if (node.right == null) {
                node.right = new Node(toAdd);
            } else {
                appendNode(toAdd, node.right);
            }
        }
    }

    @Override
    public boolean remove(Object o) {
        if (!contains(o)) {
            return false;
        } else {
            deleteNode(root, (int) o);
            return true;
        }
    }

    public Node deleteNode(Node node, int value) { if (node == null)
            return null;
        if (value < node.data) {
            node.left = deleteNode(node.left, value);
        } else if (value > node.data) {
            node.right = deleteNode(node.right, value);
        } else {
            if (node.left == null && node.right == null) {
                node = null;
            } else if (node.left == null) {
                node = node.right;
            } else if (node.right == null) {
                node = node.left;
            } else {
                Node find = find(node.right);
                node.data = find.data;
                node.right = deleteNode(node.right, find.data);
            }
        }
        return node;
    }

    private Node find(Node node) {
        if (node.left == null)
            return node;
        else
            return find(node.left);

    }

    @Override
    public boolean addAll(Collection c) {
        for (Object o : c.toArray()){
            add(o);
        }

        return true;
    }

    @Override
    public void clear() {
        root = null;
        size = 0;
    }

    @Override
    public boolean removeAll(Collection c) {
        for (Object o : c.toArray()) {
            if (!remove(o)){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection c) {
        MyTree temp = new MyTree();
        for (Object o: c.toArray()){
            if (contains(o)){
                temp.add(o);
            }

        }
        root = temp.root;
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
//TODO methode
    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    private class Node {
        int data;

        public Node(Object data) {
            this.data = (int) data;
        }

        Node left;
        Node right;
    }
}
