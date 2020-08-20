package HomeWork_26;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Function {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(-5);
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        numbers.add(9);
        System.out.println(sumOfNumbers(numbers));


    }
    public static int sumOfNumbers (List<Integer> numbers){
        final Stream<Integer> stream = numbers.stream();
        final int number = stream.filter(integer -> {
            return integer > 0;
        }).map(integer -> {
            return integer * integer;
        }).filter(integer ->{
            return integer % 2 == 0;
        }).mapToInt(x ->x).sum();

        return number;
    }

}
