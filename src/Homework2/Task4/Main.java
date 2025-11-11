package Homework2.Task4;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.showInfo();
        Car car2 = new Car(2021);
        car2.showInfo();
        Car car3 = new Car(2022, 160.0);
        car3.showInfo();
        Car car4 = new Car(2021, 180.0, 3);
        car4.showInfo();
        Car car5 = new Car(2024, 110, 5, "Black");
        car5.showInfo();
    }
}