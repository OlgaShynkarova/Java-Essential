package Advanced.Homework4.Task2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Dekoder {
    public static void main(String[] args) {
        try(BufferedReader br = new BufferedReader(new FileReader("E:\\оля\\Java\\CBS\\Homework\\Essential\\src\\Advanced\\Homework4\\Task2\\NewFile.txt"))) {
            String line;
            String regex = "\\b(на|у|з|до|від|про|відповідно|через|перед|між|над|під)\\b";
            while ((line = br.readLine()) != null) {
                String result = line.replaceAll("(?i)" + regex, "Java");
                System.out.println(result);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}