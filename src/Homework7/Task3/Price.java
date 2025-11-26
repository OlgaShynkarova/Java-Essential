package Homework7.Task3;

public class Price implements Comparable<Price> {
    private String productName;
    public String storeName;
    private double price;

    public Price(String productName, String storeName, double price) {
        this.productName = productName;
        this.storeName = storeName;
        this.price = price;
    }
    public String getStoreName() {
        return storeName;
    }
    @Override
    public String toString() {
        return "Price{" +
                "productName: " + productName +
                ", storeName: " + storeName +
                ", price: " + price + " uah}";
    }
    @Override
    public int compareTo(Price o) {
        return this.storeName.compareToIgnoreCase(o.storeName);
    }
}