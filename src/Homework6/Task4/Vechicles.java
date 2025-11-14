package Homework6.Task4;

public enum Vechicles {
    CAR(8000.0, "Red"),
    PLANE(50000.0, "White"),
    SHIP(90000.0, "Grey");
    private final String color;
    private final double price;
    public String getColor() {
        return color;
    }
    public double getPrice() {
        return price;
    }
    Vechicles(double price, String color) {
        this.price = price;
        this.color = color;
    }
    @Override
    public String toString(){
        return "Name: " + this.name() + ", color: " + this.getColor() + ", price: " + this.getPrice() + " usd";
    }
}