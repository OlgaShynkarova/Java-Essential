package Homework3.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DocumentWorker documentWorker;
        String key = getKey();
        if (key.equalsIgnoreCase("pro")){
           documentWorker = new ProDocumentWorker();
        }else  if (key.equalsIgnoreCase("exp")){
            documentWorker = new ExpertDocumentWorker();
        }else
            documentWorker = new DocumentWorker();
        documentWorker.openDocument();
        documentWorker.editDocument();
        documentWorker.saveDocument();

    }
    public static String getKey(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the key ('pro' or 'exp') or click Enter for a free version:");
        if (scanner.hasNextLine()) {
            return scanner.nextLine().trim();
        }else {
            System.out.println("You did not enter a string. Please try again.");
            return getKey();
        }
    }
}