package HomeWork_27;


public class Student {
    String name;
   int id;
    boolean[] present;

    @Override
    public String toString() {
        return "" + name;
    }

    public Student(String n) {
        name = n;
        id = 0;
        present = new boolean[10];
    }

}


