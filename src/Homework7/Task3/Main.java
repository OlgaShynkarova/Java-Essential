package Homework7.Task3;

import java.lang.reflect.ParameterizedType;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product details: ");
        Price[] price = new Price[2];
        for (int i = 0; i < price.length; i++){
            System.out.println("Product " + (i+1) + ": ");
            System.out.println("Enter the product name: ");
            String productName = scanner.nextLine();
            System.out.println("Enter the store name: ");
            String storeName = scanner.nextLine();
            double cost = 0.0;
            boolean validCost = false;
            while (!validCost){
                System.out.println("Enter the cost of the product: ");
                String costOfProduct = scanner.nextLine();
                try {
                    cost = Double.parseDouble(costOfProduct);
                    validCost = true;
                }catch (NumberFormatException e){
                    System.out.println("Error parsing string: " + e.getMessage());
                }
            }
            price[i] = new Price(productName, storeName, cost);
        }
        Arrays.sort(price);
        for (Price product : price) {
            System.out.println(product);
        }
        System.out.println("Enter the store name for searching: ");
        String searchStore = scanner.nextLine();
        try {
            for (Price product : price) {
                if (product.storeName.equalsIgnoreCase(searchStore))
                    System.out.println(product);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}