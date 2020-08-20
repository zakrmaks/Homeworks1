package HomeWork_27;

import com.google.gson.internal.bind.util.ISO8601Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamHW {
    private static List<Student> students = new ArrayList<>();


    public static void main(String[] args) {
        students.add(new Student("Petrov"));
        students.add(new Student("Sidorova "));
        students.add(new Student("Varkena"));
        students.add(new Student("Manga"));
        students.add(new Student("Ponchika"));
        Stream stream = students.stream();

        stream.filter(StreamHW::isContainVowelsLetter).map(obj -> {return obj.toString().toUpperCase();}).sorted().forEach(System.out::println);


    }


    private static boolean isContainVowelsLetter(Object name) {

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] temp = name.toString().toCharArray();
        ArrayList<Character> test = new ArrayList<>();
        for (char character : temp) {
            test.add(character);
        }
        int count = 0;
        for (Character letter : vowels) {
            for (Character let : temp) {
                if (let.equals(letter)) {
                    count++;
                }
            }

        }
        return count > 2 ? true : false;
    }

}

