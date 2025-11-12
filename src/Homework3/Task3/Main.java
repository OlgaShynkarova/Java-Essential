package Homework3.Task3;

public class Main {
    public static void main(String[] args) {
        Plane plane = new Plane(85.4, 52.1, 2500000, 700.0, 2018, 10000, 300);
        Car car = new Car(40, 61.7, 1700000, 200, 2021);
        Ship ship = new Ship(75.8, 14.6, 5000000, 400, 2010, 350, "Odessa");
        System.out.println("Information about plane:");
        plane.showInfo();
        System.out.println("Information about car:");
        car.showInfo();
        System.out.println("Information about ship:");
        ship.showInfo();
    }
}