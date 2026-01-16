package Advanced.Homework2.Task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> words = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the word " + i + ":");
            String word = reader.readLine();
            words.add(word);
        }
        words = doubleValues(words);
        for (String word : words) {
            System.out.println(word);
        }
    }
    public static List<String> doubleValues(List<String> list){
        for (int i = 0; i < list.size(); i++) {
            list.add(i+1,list.get(i));
            i++;
        }
        return list;
    }
}