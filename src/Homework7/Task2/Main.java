package Homework7.Task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Worker[] workers = new Worker[5];
        System.out.println("Enter the details of five employees: ");
        for (int i = 0; i < workers.length; i++){
            System.out.println("Worker " + (i + 1) + ":");
            System.out.println("Surname and initials: ");
            String surnameInitials = scanner.nextLine();
            System.out.println("Job title: ");
            String jobTitle = scanner.nextLine();
            int yearOfEmployment = 0;
            boolean validYear = false;
            while (!validYear){
                System.out.println("Year of empoyment: ");
                String year = scanner.nextLine();
                try {
                    yearOfEmployment = Integer.parseInt(year);
                    validYear = true;
                }catch (NumberFormatException e){
                    System.out.println("Error parsing string: " + e.getMessage());
                }
            }
            workers[i] = new Worker(surnameInitials, jobTitle, yearOfEmployment);
        }
        Arrays.sort(workers, Comparator.comparing(Worker::getSurnameInitials));
        for (Worker worker : workers) {
            System.out.println(worker.getSurnameInitials() + " " + worker.getJobTitle() + " " + worker.getYearOfEmployment());
        }
        int workExperience;
        System.out.println("Enter a number to compare work experience: ");
        while (true){
            String number = scanner.nextLine();
            try {
                workExperience = Integer.parseInt(number);
                break;
            }catch (NumberFormatException e){
                System.out.println("You entered uncorrect number. Please try again: ");
            }
        }
        int currentYear = 2025;
        System.out.println("Employees with more experience than " + workExperience + " years: ");
        boolean found = false;
        for (Worker worker:workers) {
            int experience = currentYear - worker.getYearOfEmployment();
            if (experience > workExperience){
                System.out.println(worker.getSurnameInitials());
                found = true;
            }
        }
        if (!found)
            System.out.println("Employees with such experience were not found.");
        scanner.close();
    }
}