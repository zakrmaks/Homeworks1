package HomeWork_18;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        Random rand = new Random();
        int numOfItter = 10;
        int range = 10-4;
Gson gson = new Gson();

  ArrayList student = new ArrayList();
        for (int i = 0; i < numOfItter; i++) {
            student.add(new Student("Ivanov "+(int)Math.abs(Math.random()*range+4),"Ivan "+(int)Math.abs(Math.random()*range+4), (int)Math.abs(Math.random()*range+4), rand.nextBoolean()));
        }
//        System.out.println(student.toString());
        String JSON = gson.toJson(student);
        System.out.println(JSON);
        FileWriter writer = new FileWriter("D:\\hillel\\Homeworks\\src\\HomeWork_18\\text.txt");
        writer.write(JSON);
        writer.flush();
    }

}
