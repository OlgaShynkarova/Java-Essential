package Homework4.Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConverterTemperature converterTemperature = new ConverterTemperature(15);
        String scale = checkScale();
        System.out.println("Celcius: " + converterTemperature.getCelsius() + " °C");
        switch (scale){
            case "K": case "k":
                System.out.println("Kelvins: " + converterTemperature.convert(scale));
                break;
            case "F": case "f":
                System.out.println("Fahnreihents: " + converterTemperature.convert(scale));
                break;
        }
    }
    public static String checkScale(){
        System.out.println("Please enter 'K' or 'F' for choosing the scale.");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()){
            String scale = scanner.nextLine();
            if (scale.equalsIgnoreCase("K") || scale.equalsIgnoreCase("F")){
                return scale;
            }else
                System.out.println("You entered incorrect string! Please, try again.");
                return checkScale();
        }else
            System.out.println("You did not enter a string! Please, try again.");
        return checkScale();
    }
}