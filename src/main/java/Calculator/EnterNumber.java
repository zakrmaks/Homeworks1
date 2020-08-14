package Calculator;

import java.util.Scanner;

//Создаём пользователю поле для ввода
public class EnterNumber {
   private double firstNumber = enterNumber();
   private  double secondNumber = enterNumber();

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }
//Метод для считывания введенного значения
    public static double enterNumber() {
        double number = 0;
        Scanner scan = new Scanner(System.in)
        ;
        {
            System.out.println("Введите число:");
            if (scan.hasNextDouble()) {
                number = scan.nextDouble();
            } else {
                System.out.println("Вы ввели неверное число");
                scan.next();
                number = enterNumber();
            }

        }
        return number;
    }

}

