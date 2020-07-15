package HomeWork_18;

public class Student {
    private String name;
    private String surname;
    private int marks;
    private boolean present;


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", marks=" + marks +
                ", present=" + present +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getMarks() {
        return marks;
    }

    public boolean isPresent() {
        return present;
    }

    public Student(String name, String surname, int marks, boolean present) {
        this.name = name;
        this.surname = surname;
        this.marks = marks;
        this.present = present;
    }
}
