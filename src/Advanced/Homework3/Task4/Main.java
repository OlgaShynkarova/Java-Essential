package Advanced.Homework3.Task4;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\оля\\Java\\CBS\\Homework\\Essential\\src\\Advanced\\Homework3\\Task4\\textFile"));
             BufferedReader br = new BufferedReader(new FileReader("E:\\оля\\Java\\CBS\\Homework\\Essential\\src\\Advanced\\Homework3\\Task4\\textFile"))) {
            bw.write("Abstract class for writing to character streams.\n" +
                    " The only methods that a subclass must implement are write(char[], int, int), flush(), and close().\n" +
                    " Most subclasses, however, will override some of the methods defined here in order to provide higher efficiency, additional functionality, or both.");
            bw.flush();
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}