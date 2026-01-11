package Advanced.Homework1.Task2;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Apple", 45.0));
        products.add(new Product("Lemon", 150.0));
        products.add(new Product("Grape", 220.0));
        products.add(new Product("Pear", 70.0));
        products.add(new Product("Orange", 160.0));
        products.add(new Product("Banana", 65.0));
        products.add(new Product("Melon", 110.0));
        products.add(new Product("Kiwi", 190.0));
        products.add(new Product("Mango", 100.0));
        products.add(new Product("Strawberry", 250.0));
        Iterator<Product> productIterator = products.iterator();
        while (productIterator.hasNext()){
            System.out.println(productIterator.next());
        }
    }
}

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}