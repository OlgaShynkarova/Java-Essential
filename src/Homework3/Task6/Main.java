package Homework3.Task6;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print("Text without color.");
        Printer redPrinter = new RedPrinter();
        redPrinter.print("This is red text.");
        Printer greenPrinter = new GreenPrinter();
        greenPrinter.print("This is green text.");
        Printer yellowPrinter = new YellowPrinter();
        yellowPrinter.print("This is yellow text.");
    }
}