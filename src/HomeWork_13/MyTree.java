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

            private Node current;


            @Override
            public boolean hasNext() {
                if (current == null) {
                    return true;
                }
                return findNode(root) != null;

            }

            @Override
            public Object next() {

                if (current == null) {
                    current = findFirstNode(root);
                    return current.data;
                }
                current = findNode(root);
                return current.data;
            }

            private Node findNode(Node node) {
                if (node.data == current.data && node.right == null) {
                    return null;
                } else if (current.data < node.data) {
                    if (node.left != null) {
                        if (findNode(node.left) == null) {
                            return node;
                        } else {
                            return findNode(node.left);
                        }

                    } else {
                        return node;
                    }
                } else {
                    return findNode(node.right);
                }
            }
        };
    }


    private Node findFirstNode(Node node) {
        Node current = node;
        if (node.left == null) {
            return current;
        }
        return findFirstNode(node.left);
    }

    @Override
    public Object[] toArray() {
        Object[] array = new Object[size];
        Iterator iter = iterator();
        for (int i = 0; i < array.length; i++) {
            array[i] = iter.next();
        }

        return array;
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
        return true;
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

//FIXME delete first node(((!!!!
    @Override
    public boolean remove(Object o) {
        if (!contains(o)) {
            return false;
        } else {
            deleteNode(root, (int) o);
            size--;
            return true;
        }
    }

    public Node deleteNode(Node node, int value) {
        if (node == null)
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
        for (Object o : c.toArray()) {
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
            if (!remove(o)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection c) {
        MyTree temp = new MyTree();
        for (Object o : c.toArray()) {
            if (contains(o)) {
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

    @Override
    public String toString() {
        return print(root);

    }
    private String print (Node node) {
        if (node == null){
            return " ";
        }
        String l = print(node.left);
        String current = String.valueOf(node.data);
        String r = print(node.right);
        String result = "";

            if (! l.isEmpty() && l.length() != 0){
                result += l  ;
            }else{
                result += l +",";
            }

            result += current + ",";

            if ( !r.isEmpty() && r.length() != 0){
                result += r ;
            }else{
            result += r +",";
            }
        return result;
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


