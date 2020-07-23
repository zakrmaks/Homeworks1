package HomeWork_14;

import org.junit.Assert;

import java.util.*;



class MyMapTest {
private MyMap map;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
         map = new MyMap();
        map.put("first", 1);
        map.put("second", 2);
        map.put("third",3);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        map = new MyMap();

        map.put("first", 1);
        map.put("second", 2);
        map.put("third",3);
    }

    @org.junit.jupiter.api.Test
    void size() {

        Assert.assertEquals(3,map.size());
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        Assert.assertEquals(false,map.isEmpty());
    }

    @org.junit.jupiter.api.Test
    void containsKey() {
        Assert.assertEquals(true,map.containsKey("second"));
    }

    @org.junit.jupiter.api.Test
    void containsValue() {
        Assert.assertEquals(true,map.containsValue(3));
    }

    @org.junit.jupiter.api.Test
    void get() {
        Assert.assertEquals(3, map.get("third"));
    }

    @org.junit.jupiter.api.Test
    void put() {
        map.put("forth",4);
        Assert.assertEquals(4,map.get("forth"));
    }

    @org.junit.jupiter.api.Test
    void remove() {
        map.remove("second");
        Assert.assertEquals(3,map.get("third"));
    }

    @org.junit.jupiter.api.Test
    void putAll() {
        Map test = new HashMap();
        test.put(4,"four");
        test.put(5,"five");
        test.put(6,"six");
        map.putAll(test);
Assert.assertEquals(map.get(6),"six");
    }

    @org.junit.jupiter.api.Test
    void clear() {
        map.clear();
        Assert.assertEquals(null,map.get("second"));
    }

    @org.junit.jupiter.api.Test
    void keySet() {
      Set test = new HashSet();
   test = map.keySet();
        Assert.assertEquals(true,test.contains("second"));
    }

    @org.junit.jupiter.api.Test
    void values() {
        Collection test;
        test = map.values();
        Assert.assertEquals(true,test.contains(3));
    }

    @org.junit.jupiter.api.Test
    void entrySet() {
        Set test = map.entrySet();
        Iterator iter = test.iterator();

        Map.Entry temp1 =(Map.Entry) iter.next();
        Assert.assertEquals("third",temp1.getKey());
    }
}