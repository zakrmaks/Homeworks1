package HomeWork_3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Tusk1();
//    Tusk2();
        Tusk3();
    }

    private static void addStudent(String name, String[] surnames) {
        int error = -1;
        for (int i = 0; i < surnames.length; i++) {
            if (surnames[i] == null) {
                surnames[i] = name;
                error = i;
                break;
            }
        }
        if (error == -1) System.out.println("List is full");

    }

    private static void addMarks(int mark, int lesson, int idOfStudent, int[][] marks) {
        marks[idOfStudent - 1][lesson - 1] = mark;
    }

    private static void print(String[] surnames, int[][] marks, boolean[] present) {
        for (int i = 0; i < surnames.length; i++) {
            if (surnames[i] == null) break;
            System.out.println(surnames[i] + " " + Arrays.toString(marks[i]) + ", " + present[i]);
        }
    }

    private static void delete(String nameOfStudent, String[] students, int[][] marks, boolean[] presentce) {
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j <marks[i].length; j++) {

                if (students[i] == nameOfStudent) {
                    students[i] = "null";
                    presentce[i] = false;
                    marks[i][j] = 0;
                    break;
                }
            }
        }
    }

    private static void clear(String[] surname, int[][] marks, boolean[] presents) {
        for (int i = 0; i < surname.length; i++) {
            for (int j = 0; j < marks[i].length; j++) {
                surname[i] = null;
                marks[i][j] = 0;
                presents[i] = false;
            }
        }
    }
    private static void containe(String surname, String[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(surname)) {
                System.out.println("Student is in the list");
                break;
            }
        }
    }

    private static void Tusk3() {
        final int MAX_STUDENT = 20;
        String[] surname = new String[MAX_STUDENT];
        int[][] marks = new int[MAX_STUDENT][10];
        boolean[] presents = new boolean[MAX_STUDENT];
        addStudent("Vasya", surname);
        addStudent("Petia", surname);
        addStudent("Igor", surname);
        addMarks(4, 6, 2, marks);
        print(surname, marks, presents);
        System.out.println("=====================================================");
//        delete("Vasya", surname, marks, presents);
        print(surname, marks, presents);
//        clear(surname, marks, presents);
        System.out.println("=====================================================");
        print(surname, marks, presents);
        containe("Vasya", surname);


//        Scanner scan = new Scanner(System.in);
//        String[][] students = new String[2][];
//        boolean index;
//
//        String[] name = {"Петров ", "Сидоров ", "Куницый ", "Маркен \n"};
//        int[] marks = {1, 5, 4, 5};
//        String[] present = {"present ", "absend ", "present ", "absend\n"};
//        students[0] = name;
//        students[1] = present;
//
//        /*Поиск студента в списке*/
//        System.out.println("Введите фамилию студента:");
//
//        String nameOf = null;
//        int indexname = 0;
//        for (int i = 0; i < name.length; i++) {
//            if (nameOf == null)
//             nameOf = scan.nextLine();
//                if(String.valueOf(nameOf).equalsIgnoreCase(name[i]) == true){
//                    indexname = i;
//                }
//            }
//        System.out.println(indexname);
//        /*Выставление оценки студенту*/
//        for (int i = 0; i < name.length; i++) {
//            if(indexname == i){
//                System.out.println("Введите оценку");
//                marks[i] = scan.nextLine();
//            }
//
//        }
//        // Вывод списка
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < name.length; j++) {
//                int count = 1;
//                System.out.print( count+j + ". " + students[i][j]);
//            }
//        }
//        /*Добавление студента */
//        String[] temp = Arrays.copyOf(name, name.length+1);
//        for (int i = 0; i < temp.length ; i++) {
//            if (temp[i] == null)
//                temp[i] = "Петров";
//            System.out.println(temp[i]);
//        }
//name = temp;
    }


    private static void Tusk2() {
        String xyA, xyB, xyC;
        double sum1, sum2, sum3;
        System.out.println("Enter point A ");
        xyA = EnterNumber();
        int[] Axy = new int[xyA.length()];
        Axy = StringToInt(xyA);
        System.out.println("Enter point B ");
        xyB = EnterNumber();
        int[] Bxy = new int[xyA.length()];
        Bxy = StringToInt(xyB);
        System.out.println("Enter found point ");
        xyC = EnterNumber();
        int[] Cxy = new int[xyA.length()];
        Cxy = StringToInt(xyC);
        sum1 = (0 - Cxy[0]) * (Axy[1] - 0) - (0 - 0) * (0 - Cxy[1]);
        sum2 = (0 - Cxy[0]) * (0 - Axy[1]) - (Bxy[0] - 0) * (Axy[1] - Cxy[1]);
        sum3 = (Bxy[0] - Cxy[0]) * (0 - 0) - (0 - Bxy[0]) * (0 - Cxy[1]);
        System.out.println(sum1 + " " + sum2 + " " + sum3);
        if ((sum1 > 1 && sum2 > 1 && sum3 > 1) || (sum1 < 1 && sum2 < 1 && sum3 < 1))
            System.out.println("Your point in the right triangle");
        else System.out.println("Your point out of the right triangle");

    }

    private static void Tusk1() {
        String number;
        int summ = 0;
        System.out.println("Enter your number");
        number = EnterNumber();
        char[] everyNumber = new char[number.length()];
        int[] charToIntNumber = new int[number.length()];
        everyNumber = number.toCharArray();
        System.out.println("Char array:");
        for (int i = 0; i < number.length(); i++) {
            System.out.println("Element [" + i + "]: " + everyNumber[i]);
            charToIntNumber[i] = Character.getNumericValue(everyNumber[i]);
            summ = summ + charToIntNumber[i];
        }
        System.out.println("Summ of your numbers is: " + summ);

    }

    private static int[] StringToInt(String number) {
        char[] oneNumber = new char[number.length()];
        oneNumber = number.toCharArray();
        int[] convertNumber = new int[number.length()];
        for (int i = 0; i < number.length(); i++) {
            convertNumber[i] = Character.getNumericValue(oneNumber[i]);
        }
        return convertNumber;
    }

    private static String EnterNumber() {
        String number;
        Scanner scan = new Scanner(System.in);
        number = scan.nextLine();
        return number;
    }
}
