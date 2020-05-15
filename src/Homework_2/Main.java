package Homework_2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//Tusk 0 выполнен в первом ДЗ путем рекурсии в случаи неправильного ввода;
        // Tusk1();
        //Tusk2();

        // Tusk3();
       // Tusk4a();
       // Tusk4b();
        // Tusk4c();
        //Tusk5();
        // Tusk6();
        //   Tusk7();



    }





    private static void Tusk7() {
        int number;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        number = scan.nextInt();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println("ваше число кратно:" + i);
            }

        }
    }


    private static void Tusk6() {
        int number;
        int count = 1;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        number = scan.nextInt();

        for (int x = 2; x < number; x++) {

            if (number % x == 0) {
                count++;
            }
        }
        if (count < 2) {
            System.out.println("Ваше число простое");
        } else {
            System.out.println("Ваше число сложенное");
        }
    }


    private static void Tusk5() {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число:");
        number = scan.nextInt();
        if (number % 2 == 0) {
            System.out.println("Ваше число четное");
        } else {
            System.out.println("Ваше число нечетное");
        }


    }

    private static void Tusk4c() {
        int width;
        int height;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ширину:");
        width = scan.nextInt();
        System.out.println("Введите высоту:");
        height = scan.nextInt();
        for (int y = 0; y < height; y++) {
            if (y % 2 != 0) {
                System.out.print(" ");
            }
            for (int x = 0; x < width; x++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }

    private static void Tusk4b() {
        double width ;
        double height;


        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ширину:");
        width = scan.nextInt();
        System.out.println("Введите высоту:");
        height = scan.nextInt();
        double test = width/height;


                for (double y = 0; y < height; y++) {
            for (double x = 0; x < width; x++) {
                if (y == 0 || x == 0 || y == height - 1 || x == width - 1  || y == x/test || x == width-1 - y*test )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }



    private static void Tusk4a( ) {
        int width;
        int height;

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите ширину:");
        width = scan.nextInt();
        System.out.println("Введите высоту:");
        height = scan.nextInt();
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (y == 0 || x == 0 || y == height - 1 || x == width - 1 )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }



    private static void Tusk3() {
        double depositGrivna;
        double annualPercentage;
        int depositDuration;
        double incomeFromPercentPerYear;
        double annualIncome;
        double incomeFromPercentage;
        double accountMonney;
        double count = 0;


        Scanner scan = new Scanner(System.in);
        System.out.println("Введите сумму депозита:");
        depositGrivna = scan.nextDouble();
        System.out.println("Введите годовой процент банка:");
        annualPercentage = scan.nextDouble();
        System.out.println("Введите длительность депозита(кол-во лет):");
        depositDuration = scan.nextInt();
        for (int i = 1; i <= depositDuration; i++) {
            accountMonney = depositGrivna;
            incomeFromPercentPerYear = accountMonney * annualPercentage / 100;
            incomeFromPercentage = incomeFromPercentPerYear + count;
            count = incomeFromPercentPerYear;
            annualIncome = incomeFromPercentPerYear + depositGrivna;
            depositGrivna = incomeFromPercentPerYear + accountMonney;
            System.out.println("на вашем счету за " + i + " год " + annualIncome);
            System.out.println("вы получили " + incomeFromPercentPerYear + " Дохода за год");
            System.out.println(" общая сумма дохода с процента " + incomeFromPercentage);
            System.out.println("==============================================================");

        }


    }

    private static void Tusk2() {
        Scanner scan = new Scanner(System.in);
        int countOfNumber;
        int summ = 0;
        int average;
        System.out.println("Введите количество чисел:");
        countOfNumber = scan.nextInt();
        int number[] = new int[countOfNumber];

        for (int i = 0; i < countOfNumber; i++) {
            System.out.println("Введите Число");
            number[i] = scan.nextInt();
            summ += number[i];
        }
        average = summ / countOfNumber;
        System.out.println("Среднее арифметическое чисел: " + average);


    }


    private static void Tusk1() {
        Scanner scan = new Scanner(System.in);
        double firsNumber;
        double secondNumber;
        double average;
        System.out.println("Введите первое число");
        firsNumber = scan.nextDouble();
        System.out.println("Введите второе число");
        secondNumber = scan.nextDouble();
        average = (firsNumber + secondNumber) / 2;
        System.out.println("Среднее арифметическое ваших чисел:" + average);


    }
}
