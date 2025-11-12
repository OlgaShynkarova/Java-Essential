package Homework3.Task3;

public class Ship extends Vehicle{
    public double numOfPas;
    public String homePort;

    public Ship(double x, double y, double price, double speed, int year, double numOfPas, String homePort) {
        super(x, y, price, speed, year);
        this.numOfPas = numOfPas;
        this.homePort = homePort;
    }
    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("Home port: " + homePort +
                "\nNumber of passengers: " + numOfPas);
    }
}