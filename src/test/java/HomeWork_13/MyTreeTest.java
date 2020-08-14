package HomeWork_13;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.*;

public class MyTreeTest {
    private MyTree binarytree;
    private MyTree testTree;

    @Before
    public void setUp() throws Exception {
        testTree = new MyTree();
        binarytree = new MyTree();
        binarytree.add(5);
        binarytree.add(6);
        binarytree.add(7);
        binarytree.add(8);
        testTree.add(5);
        testTree.add(6);
        testTree.add(7);
        testTree.add(8);
    }

    @After
    public void tearDown() throws Exception {
        binarytree.add(5);
        binarytree.add(6);
        binarytree.add(7);
        binarytree.add(8);
    }

    @Test
    public void size() {
        Assert.assertEquals(4, binarytree.size());
    }

    @Test
    public void isEmpty() {
        Assert.assertEquals(false, binarytree.isEmpty());
    }

    @Test
    public void contains() {
        Assert.assertEquals(false, binarytree.contains(2));
    }

    @Test
    public void iterator() { Iterator iter = binarytree.iterator();
        Assert.assertEquals(true, iter.hasNext());
        iter.next();
        Assert.assertEquals(true, iter.hasNext());
        iter.next();
        Assert.assertEquals(true, iter.hasNext());
        iter.next();
        Assert.assertEquals(true, iter.hasNext());
        iter.next();
        Assert.assertEquals(false, iter.hasNext());
    }

    @Test
    public void toArray() {Object[] temp = new Object[]{5,6,7,8};
        Object[] temp2 = binarytree.toArray();
        for (int i = 0; i <temp2.length ; i++) {
            Assert.assertEquals(temp[i], temp2[i]);
        }
    }

    @Test
    public void add() {
        Assert.assertEquals(true, binarytree.add(5));
    }

    @Test
    public void remove() {
        Object[] temp = new Object[]{5, 7, 8};

        binarytree.remove(6);
        Object[] temp2 = binarytree.toArray();
        Assert.assertArrayEquals(temp, temp2);
    }



    @Test
    public void addAll() {
        Assert.assertEquals(true,binarytree.addAll(testTree));
    }

    @Test
    public void clear() { binarytree.clear();
        Assert.assertEquals(true, binarytree.isEmpty());
    }

    @Test
    public void removeAll() {Assert.assertEquals(true, binarytree.removeAll(testTree));
    }

    @Test
    public void retainAll() {
    Assert.assertEquals(true,binarytree.retainAll(testTree));}

    @Test
    public void containsAll() {
        Assert.assertEquals(true,binarytree.containsAll(testTree));
    }



}