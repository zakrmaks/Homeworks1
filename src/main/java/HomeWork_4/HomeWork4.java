package HomeWork_4;

import java.util.Arrays;


public class HomeWork4 {
    final static int NUMBER_OF_STUDENTS = 10;

    public static void main(String[] args) {
        Student[] students = new Student[NUMBER_OF_STUDENTS];
        addStudent(students, "Петров");
        addStudent(students, "Сидоров");
        addStudent(students, "Iванов");
        setMarks(students, "петров", 9, 5);
        print(students);
//        deleteStudent(students, "Сидоров");
        System.out.println();
        print(students);
        foundStudent(students,"dfdf");
//        clearAll(students);

    }

    public static void addStudent(Student[] students, String studentName) {
        int nextStudent = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                nextStudent = i;
                break;
            }
        }
        if (nextStudent == -1) {
            System.out.println("Can't add student");
            return;
        }
        students[nextStudent] = new Student(studentName);

    }

    public static void setMarks(Student[] students, String studentName, int numOfLesson, int mark) {
        numOfLesson = --numOfLesson;
        for (int i = 0; i < students.length; i++) {
            if (students[i].name.equalsIgnoreCase(studentName) != false) {
                students[i].numOfLesson[numOfLesson] = mark;
                break;
            } else {
                System.out.println("Student doesn't found");
                break;
            }
        }
    }

    public static void deleteStudent(Student[] students, String studentName) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students.length);
            if (students[i] == null) {
                break;
            } else if (students[i].name.equalsIgnoreCase(studentName) != false) {
                students[i] = null;
                break;
            }
        }

    }

    public static void print(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) continue;
            System.out.println(students[i].name + "\t" + Arrays.toString(students[i].numOfLesson));

        }

    }

    public static void clearAll(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            students[i] = null;
        }
        System.out.println("Список студентов очищен");
    }

    public static void foundStudent(Student[] students, String studentName) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null){
                System.out.println("This student is not in the list");
                break;}
            else if (students[i].name.equalsIgnoreCase(studentName) != false) {
                System.out.println("This student is in the list");
                break;
            }
            else {
                ;

            }
        }
    }
}

