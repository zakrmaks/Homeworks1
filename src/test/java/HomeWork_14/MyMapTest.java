//package HomeWork_14;
//
//import org.junit.Assert;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.util.*;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class MyMapTest {
//    private MyMap map;
//    @BeforeEach
//    void setUp() {
//        map = new MyMap();
//        map.put("first", 1);
//        map.put("second", 2);
//        map.put("third",3);
//    }
//
//    @AfterEach
//    void tearDown() {
//        map = new MyMap();
//
//        map.put("first", 1);
//        map.put("second", 2);
//        map.put("third",3);
//    }
//
//    @Test
//    void size() {
//        Assert.assertEquals(0,map.size());
//    }
//
//    @Test
//    void isEmpty() {
//        Assert.assertEquals(false,map.isEmpty());
//    }
//
//    @Test
//    void containsKey() {
//        Assert.assertEquals(true,map.containsKey("second"));
//    }
//
//    @Test
//    void containsValue() {
//        Assert.assertEquals(true,map.containsValue(3));
//    }
//
//    @Test
//    void get() {
//        Assert.assertEquals(3, map.get("third"));
//    }
//
//    @Test
//    void put() {
//        map.put("forth",4);
//        Assert.assertEquals(4,map.get("forth"));
//    }
//
//    @Test
//    void remove() {
//        map.remove("second");
//        Assert.assertEquals(3,map.get("third"));
//    }
//
//    @Test
//    void putAll() {
//        Map test = new HashMap();
//        test.put(4,"four");
//        test.put(5,"five");
//        test.put(6,"six");
//        map.putAll(test);
//        Assert.assertEquals(map.get(6),"six");
//    }
//
//    @Test
//    void clear() {
//        map.clear();
//        Assert.assertEquals(null,map.get("second"));
//    }
//
//    @Test
//    void keySet() {
//        Set test = new HashSet();
//        test = map.keySet();
//        Assert.assertEquals(true,test.contains("second"));
//    }
//
//    @Test
//    void values() {
//        Collection test;
//        test = map.values();
//        Assert.assertEquals(true,test.contains(3));
//    }
//
//    @Test
//    void entrySet() {
//        Set test = map.entrySet();
//        Iterator iter = test.iterator();
//
//        Map.Entry temp1 =(Map.Entry) iter.next();
//        Assert.assertEquals("third",temp1.getKey());
//    }
//}