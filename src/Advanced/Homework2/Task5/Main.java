package Advanced.Homework2.Task5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter line. To complete enter \"end\"");
        while (true){
            String line = reader.readLine();
            if (line.equals("end")){
                break;
            }
            list.add(line);
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}