package Homework1.Task2;

public class Rectangle {
    public double side1;
    public double side2;
    public static double areaCalculator(double side1, double side2){
        double area = side1 * side2;
        return area;
    }
    public static double perimeterCalculator(double side1, double side2){
        double perimeter = 2 * side1 + 2 * side2;
        return  perimeter;
    }
}