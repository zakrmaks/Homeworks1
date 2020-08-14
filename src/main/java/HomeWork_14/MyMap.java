package HomeWork_14;

import java.util.*;

public class MyMap implements Map {
    private static int NUM_OF_BUCKETS = 16;
   private Entry[] data = new Entry[NUM_OF_BUCKETS];
   private int size = 0;
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        for (Entry current  :data){
            Entry entry = current;
            while (entry != null){
                if (entry.key.equals(key)){
                    return true;
                }
                entry = entry.next;
            }
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        for (Entry current  :data){
            Entry entry = current;
            while (entry != null){
                if (entry.value.equals(value)){
                    return true;
                }
                entry = entry.next;
            }
        }
        return false;
    }

    @Override
    public Object get(Object key) {
        int index = getIndex(key);
        Entry current = data[index];
        while (current != null){
            if (current.key.equals(key)){
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    @Override
    public Object put(Object key, Object value) {
        int index = getIndex(key);
        if (data[index] == null){

            data[index] = new Entry(null,key,value);
        } else {
            Entry current = data[index];
            while ( current != null){
                if (current.key.equals(key)){
                    Object lastValue = current.value;
                    current.value = value;
                    return lastValue;
                }
                current = current.next;
            }
            data[index] = new Entry(data[index], key,value);
        }
        size++;
        return null;
    }

    @Override
    public Object remove(Object key) {
        int index = getIndex(key);
        Object delete = null;
        Entry current = data[index];
        Entry next = current.next;
        if (current.key.equals(key)){
            delete= current.value;
            data[index] = current.next;
            return delete;
        }
        while (next != null)
        {
            if (next.key.equals(key)){
                delete = next.value;
                current.next = current;
            }
            current = next;
            next = next.next;
        }
        size--;
        return delete;
    }

    @Override
    public void putAll(Map m) {
 Set key = m.keySet();
 for (Object element : key){
     put(element,m.get(element));
 }

    }

    @Override
    public void clear() {
data = new Entry[NUM_OF_BUCKETS];
size = 0;
    }

    @Override
    public Set keySet() {
        TreeSet entrySet = new TreeSet();
        for (Entry currentEntry : data){
            Entry entry = currentEntry;
            while (entry != null){
                entrySet.add(entry.key);
                entry = entry.next;
            }
        }


        return entrySet;
    }

    @Override
    public Collection values() {
        TreeSet entrySet = new TreeSet();
        for (Entry currentEntry : data){
            Entry entry = currentEntry;
            while (entry != null){
                entrySet.add(entry.value);
                entry = entry.next;
            }
        }


        return entrySet;
    }

    @Override
    public Set<Entry> entrySet() {
        HashSet entrySet = new HashSet();
       for (Entry currentEntry : data){
            Entry entry = currentEntry;
            while (entry != null){
                entrySet.add(entry);
                entry = entry.next;
            }
        }


        return entrySet;
    }
    private int getIndex(Object key){
        return  Math.abs(key.hashCode()) % NUM_OF_BUCKETS;
    }

    private static class Entry implements Map.Entry {
      private   Entry next;
      private   Object key;
       private Object value;

      public Entry(Entry next, Object key, Object value) {
            this.next = next;
            this.key = key;
            this.value = value;
        }


        @Override
        public Object getKey() {
            return key;
        }

        @Override
        public Object getValue() {
            return value;
        }

        @Override
        public Object setValue(Object value) {
            Object lastValue = this.value;
            this.value = value;
            return lastValue;
        }
    }
}
