package Advanced.Homework3.Task2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("newFile.txt"));
             BufferedReader br = new BufferedReader(new FileReader("newFile.txt"))) {
            bw.write("Hello, World!!!\n");
            bw.write("I like Java!!!\n");
            bw.write(String.valueOf(256));
            bw.newLine();
            bw.write(String.valueOf(14));
            bw.flush();
            System.out.println("Data written to file!");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}