package HomeWork_3;

import java.util.Arrays;
import java.util.Scanner;

public class HMW_3 {

        String[] name = {"Петров ", "Сидоров ", "Куницый ", "Маркен "};
        public static void main(String[] args) {

//        Tusk1();
//    Tusk2();
            //Tusk3();


        }



        private static void Tusk3() {
            Scanner scan = new Scanner(System.in);
            String[][] students = new String[3][];
            boolean index;

            String[] name = {"Петров ", "Сидоров ", "Куницый ", "Маркен \n"};
            String[] marks = {"1 \t\t", "5\t\t ", "4\t\t ", "5\n "};
            String[] present = {"present ", "absend ", "present ", "absend\n"};
            students[0] = name;
            students[1] = marks;
            students[2] = present;

            /*Поиск студента в списке*/
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
            /*Выставление оценки студенту*/
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
            /*Добавление студента */
            String[] temp = Arrays.copyOf(name, name.length+1);
            for (int i = 0; i < temp.length ; i++) {
                if (temp[i] == null)
                    temp[i] = "Петров";
                System.out.println(temp[i]);
            }
            name = temp;
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


