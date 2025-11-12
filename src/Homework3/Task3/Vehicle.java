package Homework3.Task3;

public class Vehicle {
    protected double x;
    protected double y;
    protected double price;
    protected double speed;
    protected int year;
    public Vehicle(double x, double y, double price, double speed, int year) {
        this.x = x;
        this.y = y;
        this.price = price;
        this.speed = speed;
        this.year = year;
    }
    public void showInfo(){
        System.out.println("Coordinates: " + x + ", " + y +
                "\nPrice: " + price +
                "\nSpeed: " + speed +
                "\nYear: " + year);
    }
}