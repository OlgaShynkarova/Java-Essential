package Homework3.Task3;

public class Plane extends Vehicle {
    public double height;
    public double numOfPas;

    public Plane(double x, double y, double price, double speed, int year, double height, double numOfPas) {
        super(x, y, price, speed, year);
        this.height = height;
        this.numOfPas = numOfPas;
    }
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Height: " + height +
                "\nNumber of passengers: " + numOfPas);
    }
}