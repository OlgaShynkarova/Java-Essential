package Homework4.Task5;

public class ConverterTemperature {
    private double celsius;
    public double getCelsius() {
        return celsius;
    }
    public ConverterTemperature(double celsius) {
        this.celsius = celsius;
    }
    public double convertToKelvins(){
        return this.getCelsius() + 273.15;
    }
    public double convertToFahrenheit(){
        return this.getCelsius() * 9/5 + 32;
    }
    public double convert(String scale) {
        if (scale.equalsIgnoreCase("K")) {
            return convertToKelvins();
        } else if (scale.equalsIgnoreCase("F")) {
            return convertToFahrenheit();
        }else
            return 0.0;
    }
}