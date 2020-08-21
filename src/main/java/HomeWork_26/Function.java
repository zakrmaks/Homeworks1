package HomeWork_26;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Function {
    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<Double>();
        numbers.add(-5.0);
        numbers.add(2.0);
        numbers.add(5.0);
        numbers.add(6.0);
        numbers.add(9.0);
        System.out.println(sumOfNumbers(numbers));
        System.out.println(avarage(numbers));

    }
    static Double avarage (List<Double> list){
        Double result = 0.0;
        for (Double i : list){
            result += i;
        }
        return result/list.size();
    }
    public static Double sumOfNumbers (List<Double> numbers){
        final Stream<Double> stream = numbers.stream();
        final double number = stream.filter(integer -> {
            return integer > 0;
        }).map(integer -> {
            return integer * integer;
        }).filter(integer ->{
            return integer % 2 == 0;
        }).mapToDouble(x ->x).sum();

        return number;
    }

}
