package Homework2.Task2;

import Homework2.Task2.Car;
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setColor("Red");
        car1.setYear(2025);
        car1.showInfo();
        Car car2 = new Car(2020);
        car2.setColor("Blue");
        car2.showInfo();
        Car car3 = new Car(2023,"Black");
        car3.showInfo();
    }
}