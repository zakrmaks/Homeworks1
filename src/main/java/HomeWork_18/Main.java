package HomeWork_18;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
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
        String JSON = gson.toJson(student);
        System.out.println(JSON);
        FileWriter writer = new FileWriter("C:\\Users\\zakrm\\IdeaProjects\\Homeworks\\src\\HomeWork_18\\student.json");
        writer.write(JSON);
        writer.flush();
    }

}
