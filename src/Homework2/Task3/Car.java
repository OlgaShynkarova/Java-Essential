package Homework2.Task3;

public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;
    public Car() {}
    public Car(int year) {
        this.year = year;
    }
    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }
    public Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
    }
    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
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