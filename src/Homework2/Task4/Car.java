package Homework2.Task4;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;
    public Car() {
        this.year = 2012;
        this.speed = 150.0;
        this.weight = 4;
        this.color = "Purple";
    }
    public Car(int year) {
        this();
        this.year = year;
    }
    public Car(int year, double speed) {
        this(year);
        this.speed = speed;
    }
    public Car(int year, double speed, int weight) {
        this(year, speed);
        this.weight = weight;
    }
    public Car(int year, double speed, int weight, String color) {
        this(year, speed, weight);
        this.color = color;
    }
    public void showInfo(){
        System.out.println("Year: " + year + ". Speed: " + speed + ". Weight: " + weight + " ton. Color: " + color);
    }
    public double getSpeed() {
        return speed;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}