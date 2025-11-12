package Homework3.Task6;

import static Homework3.Task6.AnsiColors.colorIt;

public class GreenPrinter extends Printer{
    @Override
    public void print(String value){
        System.out.println(colorIt(value, AnsiColors.GREEN));
    }
}