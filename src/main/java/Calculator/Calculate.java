package Calculator;

public class Calculate {
    private  double addition;
    private double subtraction;
    private  double divide;
    private double multipl;
    private double firsNumber;
    private double secondNumber;
//получаем введённые значения
EnterNumber number = new EnterNumber();


    public double getFirstNumber() {
         this.firsNumber = number.getFirstNumber();
        return firsNumber;
    }

    public double getSecondNumber() {
        this.secondNumber = number.getSecondNumber();
        return secondNumber;
    }


//расчитываем сумму чисел
    public double getAddition() {
        addition = firsNumber + secondNumber;
        return addition;
    }
//расчитываем разность чисел
    public double getSubtraction() {
        subtraction = firsNumber - secondNumber;
        return subtraction;
    }
    //расчитываем деление чисел

    public double getDivide() {
        divide = firsNumber / secondNumber;
        return divide;
    }

    //расчитываем произведение чисел

    public double getMultipl() {
        multipl = firsNumber * secondNumber;
        return multipl;
    }


}
