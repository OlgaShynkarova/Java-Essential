package Homework1.Task4;

public class Computer {
    public String brand;
    public int ramSize;
    public String processor;
    public Computer(String brand, int ramSize, String processor) {
        this.brand = brand;
        this.ramSize = ramSize;
        this.processor = processor;
    }
    public void showInfo(){
        System.out.println("Brand: " + brand + ", RAM: " + ramSize + ", processor: " + processor);
    }
}