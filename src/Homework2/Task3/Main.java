package Homework2.Task3;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setColor("Yellow");
        car1.setYear(2025);
        car1.setSpeed(100.0);
        car1.setWeight(3);
        car1.showInfo();
        Car car2 = new Car(2020);
        car2.setColor("Oranje");
        car2.setWeight(2);
        car2.setSpeed(130.0);
        car2.showInfo();
        Car car3 = new Car(2023,"Black");
        car3.setWeight(2);
        car3.setSpeed(150.0);
        car3.showInfo();
        Car car4 = new Car(2015, 140.0, 4);
        car4.showInfo();
        Car car5 = new Car(2023, 160, 3, "Pink");
        car5.showInfo();
    }
}
