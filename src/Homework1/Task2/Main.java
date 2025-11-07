package Homework1.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1 = getNumber();
        double num2 = getNumber();
        Rectangle rectangle = new Rectangle();
        System.out.println("The area of the rectangle is " + rectangle.areaCalculator(num1,num2));
        System.out.println("The perimeter of the rectangle is " + rectangle.perimeterCalculator(num1,num2));
    }
    public static double getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        if (sc.hasNextDouble()) {
            return sc.nextDouble();
        } else {
            System.out.println("You entered an incorrect number. Please try again.");
            return getNumber();
        }
    }
}