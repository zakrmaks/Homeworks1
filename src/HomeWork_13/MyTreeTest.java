package HomeWork_13;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyTreeTest {
    MyTree binarytree = new MyTree();


    @Test
    public void size() {
        binarytree.add(4);
        Assert.assertEquals(1,binarytree.size());
    }

    @Test
    public void isEmpty() {
        binarytree.add(4);
        Assert.assertEquals(false,binarytree.isEmpty());
    }

    @Test
    public void contains() {
        binarytree.add(4);
        binarytree.add(5);
        binarytree.add(6);
        binarytree.add(7);
        Assert.assertEquals(false,binarytree.contains(2));
    }

    @Test
    public void add() {
    }

    @Test
    public void remove(){
        binarytree.add(4);
        binarytree.add(5);
        binarytree.add(6);
        binarytree.add(7);
        binarytree.remove(4);
        System.out.println();
    }

    @Test
    void testSize() {
    }

    @Test
    void testIsEmpty() {
    }

    @Test
    void testContains() {
    }

    @Test
    void iterator() {
    }

    @Test
    void toArray() {
    }

    @Test
    void testAdd() {
    }

    @Test
    void testRemove() {
    }

    @Test
    void deleteNode() {
    }

    @Test
    void addAll() {
    }

    @Test
    void clear() {
    }

    @Test
    void removeAll() {
    }

    @Test
    void retainAll() {
    }

    @Test
    void containsAll() {
    }

    @Test
    void testToArray() {
    }
}