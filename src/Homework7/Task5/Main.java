package Homework7.Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        try {
            System.out.println("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.println("Enter the second number: ");
            double num2 = scanner.nextDouble();
            System.out.println("Choose the operation: '+', '-', '*', '/'");
            String operation = scanner.next();
            switch (operation){
                case "+":
                    System.out.println(calculator.add(num1, num2));
                    break;
                case "-":
                    System.out.println(calculator.sub(num1, num2));
                    break;
                case "*":
                    System.out.println(calculator.mul(num1, num2));
                    break;
                case "/":
                    System.out.println(calculator.div(num1, num2));
                    break;
                default:
                    throw new IllegalArgumentException("Uncorrect operation.");
            }

        }catch (ArithmeticException  | IllegalArgumentException e){
            System.out.println("Exception: " + e.getMessage());
        }catch (Exception e){
            System.out.println("Unexpected error: " + e.getMessage());
        }
        scanner.close();
    }
}